package com.dong.groovy.design

/**
 * groovy和Java的继承实现方式不一样
 * @author dong
 * groovy提供了两种实现方式：
 * 1. 通过Java似的的继承关系，不符合groovy的语法
 * 2. 通过def做为参数，并在子类中实现和调用完全一致的方法
 */
class ExecutiveGroovy extends EmployeeGroovy{
	def raise(Number amount) {		println "ExecutiveGroovy got raise"	}
	
	def raise(BigDecimal amount) {
		System.out.println("ExecutiveGroovy got  outlandish raise");
	}
}
