package com.dong.groovy.closure;

public class ComputeJava {

	public static int computeAdd() {
		int add = 0;
		for (int i = 2; i < 15; i += 2) {
			add = add + i;
		}
		return add;
	}

	public static int compute2() {
		int add = 1;
		for (int i = 2; i < 15; i += 2) {
			add = add * i;
		}
		return add;
	}

	public static void main(String[] args) {
     System.out.println("0到15所有的偶数的和是：" + computeAdd());
     System.out.println("0到15所有的偶数的积是：" + compute2());
	}

}
