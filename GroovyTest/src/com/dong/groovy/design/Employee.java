package com.dong.groovy.design;

import java.math.BigDecimal;

/**
 * Java多态的实现
 * 
 * @author dong
 *
 */
public class Employee {
	public void raise(Number amount) {
		System.out.println("Employee got raise");
	}

	// public void raise(BigDecimal amount) {
	// System.out.println("Employee got  outlandish raise");
	// }
}
