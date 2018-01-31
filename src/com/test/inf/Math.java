package com.test.inf;
/**
 * 数学计算工具类
 * @author fengbin
 *
 */
public interface Math {
	void test();
	default int add(int a, int b){
		return a+b;
	}
	/**
	 * 平方根
	 * @param a
	 * @return
	 */
	default double sqrt(int a){
		return java.lang.Math.sqrt(a);
	}
	default int max(int a,int b){
		return java.lang.Math.max(a, b);
	}
}
