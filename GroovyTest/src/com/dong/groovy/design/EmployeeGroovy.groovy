package com.dong.groovy.design


class EmployeeGroovy {
	def raise(Number amount) {
		println "EmployeeGroovy got raise"
	}
	
	def raise(BigDecimal amount) {
		System.out.println("EmployeeGroovy got  outlandish raise");
	}
}
