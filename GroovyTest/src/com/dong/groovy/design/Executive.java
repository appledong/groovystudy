package com.dong.groovy.design;

import java.math.BigDecimal;

public class Executive extends Employee {

	public void raise(Number amount) {
		System.out.println("Executive got raise");
	}

	public void raise(BigDecimal amount) {
		System.out.println("Executive got  outlandish raise");
	}
}
