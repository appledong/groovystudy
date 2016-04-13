package com.dong.groovy.design

class GiveRaiseGroovy {
	static def giveRaise(Employee employee) {
		employee.raise(new BigDecimal(10000.00));
	}

	/**
	 * 方法形参可以指明类型亦可以不知名类型
	 * 不知名类型注意方法名保持一致
	 * @param employeegroovy
	 * @return
	 */
	static def giveRaiseGroovy(EmployeeGroovy employeegroovy) {
		employeegroovy.raise(new BigDecimal(10000.00));
	}

	/**
	 * 实测证明groovy实现多态的方式和Java不一样
	 * Java：根据方法体调用最底层子类的实现（确切说是初始化对象的实现）
	 * groovy：根据方法体和参数调用与其相符的实现，同时存在遵循Java的原则，初始化的对象声明调用
	 * @param args
	 * @return
	 */
	static  main(String[] args) {
		/**
		 * EmployeeGroovy got raise
		 * ExecutiveGroovy got  outlandish raise
		 */
		giveRaise(new Employee());
		giveRaise(new Executive());
		giveRaiseGroovy(new EmployeeGroovy())
		giveRaiseGroovy(new ExecutiveGroovy())
	}
}
