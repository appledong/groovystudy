package com.dong.groovy.design;

import java.math.BigDecimal;

public class GiveRaiseJava {

	public static void giveRaise(Employee employee) {
		employee.raise(new BigDecimal(10000.00));
	}

	public static void main(String[] args) {
		/**
		 * Employee got raise 
		 * Executive got raise
		 * 结果说明：对于重写，走的是最底层的子类的方法
		 * 对于子类重载父类的api，不会走子类重载的方法，即使传进来的是子类对象
		 */
		giveRaise(new Employee());
		Executive executive = new Executive();
		giveRaise(executive);
	}

}
