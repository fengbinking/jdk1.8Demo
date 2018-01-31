package com.test.inf;
/**
 * 接口默认实现方法
 * @author fengbin
 *
 */
public class MathImpl implements Math{

	@Override
	public void test() {
		System.out.println(this.add(1, 30));
		System.out.println(this.sqrt(4));
	}

	public static void main(String[] args) {
		new MathImpl().test();
	}
}
