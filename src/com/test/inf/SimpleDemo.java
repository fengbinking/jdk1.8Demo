package com.test.inf;

import java.util.function.Supplier;

/**
 * 接口函数式调用及方法实现
 * 
 * @author fengbin
 *
 */
public class SimpleDemo {
	public static void main(String[] args) {
		Simple simple = name -> "不是你记忆中的[" + name + "]，但致命程度没什么两样";
		String res = simple.say("荆轲");
		System.out.println(res);

		/**
		 * 代码块
		 */
		simple = (name) -> {
			String tell = "生活不只苟且，还有诗和远方";
			return name + "说：" + tell;
		};
		res = simple.say("李白");
		System.out.println(res);

		/**
		 * 接口静态方法
		 */
		Person person=Simple.createObject(User::new);
		person.say();
	}
}

@FunctionalInterface
interface Simple {
	String say(String name);
	default String get(){
		return "接口默认方法";
	}
	static Person createObject(Supplier<Person> supplier){
		return supplier.get();
	}
}
interface Person{
	default void say(){
		System.out.println("我是超类");
	}
}
class User implements Person{
	private String name="小不点";
	private int age=23;
	@Override
	public void say(){
		System.out.println("我叫"+name+",今年"+age);
	}
}

