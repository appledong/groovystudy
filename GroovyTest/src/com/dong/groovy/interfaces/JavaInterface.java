package com.dong.groovy.interfaces;

public class JavaInterface {

	public static void main(String[] args) {
		InterfaceTrigger interfaceTrigger = new InterfaceTrigger();
		interfaceTrigger.setFirstInterface(new FirstInterface() {

			@Override
			public void thirdMethod() {
				System.out.println("JavaInterface:FirstInterface:thirdMethod");
			}

			@Override
			public void secondMethod() {
				System.out.println("JavaInterface:FirstInterface:secondMethod");
			}

			@Override
			public void fourMethod() {
				System.out.println("JavaInterface:FirstInterface:fourMethod");
			}

			@Override
			public void firstMethod() {
				System.out.println("JavaInterface:FirstInterface:firstMethod");
			}
		});
		interfaceTrigger.setSecondInterface(new SecondInterface() {

			@Override
			public void thirdMethod() {
				System.out.println("JavaInterface:SecondInterface:thirdMethod");
			}

			@Override
			public void secondMethod() {
				System.out
						.println("JavaInterface:SecondInterface:secondMethod");
			}

			@Override
			public void fourMethod() {
				System.out.println("JavaInterface:SecondInterface:fourMethod");
			}

			@Override
			public void firstMethod() {
				System.out.println("JavaInterface:SecondInterface:firstMethod");
			}
		});
		interfaceTrigger.interfaceTrigger();
	}
}
