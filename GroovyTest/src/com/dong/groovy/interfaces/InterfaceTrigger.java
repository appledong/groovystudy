package com.dong.groovy.interfaces;

public class InterfaceTrigger {

	private FirstInterface firstInterface;
	private SecondInterface secondInterface;

//	private int i = 0;
//	private int j = 0;

	public void setFirstInterface(FirstInterface firstInterface) {
		this.firstInterface = firstInterface;
	}

	public void setSecondInterface(SecondInterface secondInterface) {
		this.secondInterface = secondInterface;
	}

	public void interfaceTrigger() {
		for (int i = 0; i < 4; i++) {
//			System.out.println("InterfaceTrigger:interfaceTrigger:i:" + i);
			switch (i % 4) {
			case 0:
				firstInterface.firstMethod();
				break;
			case 1:
				firstInterface.secondMethod();
				break;
			case 2:
				firstInterface.thirdMethod();
				break;
			case 3:
				firstInterface.fourMethod();
				break;
			}
		}
		for (int j = 0; j < 4; j++) {
//			System.out.println("InterfaceTrigger:interfaceTrigger:j:" + j);
			switch (j % 4) {
			case 0:
				secondInterface.firstMethod();
				break;
			case 1:
				secondInterface.secondMethod();
				break;
			case 2:
				secondInterface.thirdMethod();
				break;
			case 3:
				secondInterface.fourMethod();
				break;
			}
		}
	}

}
