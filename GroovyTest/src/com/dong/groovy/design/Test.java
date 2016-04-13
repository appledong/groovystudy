package com.dong.groovy.design;

public class Test {

	public static void movethings(Man man) {
		man.movethings();
	}

	/**
	 * 继承的实现（实现人）
	 * 
	 * @param human
	 * 继承多是同类同样行为的扩展
	 */
	public static void movethings(Human human) {
		human.movethings();
	}

	/**
	 * 接口的实现
	 * 
	 * @param moveThingInterface
	 * 接口多是不同类同样行为的扩展
	 */
	public static void movethings(MoveThingInterface moveThingInterface) {
		moveThingInterface.movethings();
	}

	public static void main(String[] args) {
		movethings(new Man());
		System.out.println("继承实现");
		movethings(new SubMan());
		movethings(new SubWoman());
		System.out.println("接口实现");
		movethings(new InterfaceMan());
		movethings(new InterfaceWoman());
		movethings(new InterfaceZoo());
	}

}
