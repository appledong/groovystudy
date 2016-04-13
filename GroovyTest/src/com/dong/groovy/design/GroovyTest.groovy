package com.dong.groovy.design

/**
 * 
 * @author dong
 * Groovy不需要继承亦不需要实现接口，只要类中定义了该方法就可以实现需求
 */
class GroovyTest {

	/**
	 * Groovy中参数无需指明类型，方法可以如下调用成立
	 * @param helper
	 * @return
	 * 1. 由于此处没有注明类的方向，所以方法名不能够提示，特别注意方法名和类中的方法名保持一致
	 * 2. 对象不一致或者没有这个方法都会抛出异常
	 */
	def moveThings(helper){
		helper.movethings()
	}

	static main(args) {
		GroovyTest GroovyTest = new GroovyTest();
		GroovyTest.moveThings(new GroovyMan());
		GroovyTest.moveThings(new GroovyWoman());
		GroovyTest.moveThings(new GroovyZoo());
	}
}
