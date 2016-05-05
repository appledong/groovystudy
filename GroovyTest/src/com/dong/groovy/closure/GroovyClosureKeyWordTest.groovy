package com.dong.groovy.closure

/**
 * groovy 闭包中的三个关键字this，owner，delegate及其作用域
 * @author dong
 * 1. 由class的打印可知闭包相当于类创建的内部类
 * 2. this：在闭包中的this相当于闭包绑定的对象，有打印可知，嵌套闭包的绑定对象都是最外层的类对象，所以在二层嵌套以后的闭包中不可以使用this调用上层嵌套的变量
 * 3. owner：当前闭包的拥有者，首层闭包属于类，下一级嵌套闭包属于上一级的闭包，可以用来调用上一级闭包中的变量
 * 4. delegate：默认情况下于owner的值一直，作用域也一直，可以外在修改这个关键字，动态的路由对象
 */
class GroovyClosureKeyWordTest {
	/**
	 *  keyword in first closure start
		class is class com.dong.groovy.closure.GroovyClosureKeyWordTest$_main_closure1
		this is class com.dong.groovy.closure.GroovyClosureKeyWordTest super: java.lang.Object
		owner is class com.dong.groovy.closure.GroovyClosureKeyWordTest super: java.lang.Object
		delegate is class com.dong.groovy.closure.GroovyClosureKeyWordTest super: java.lang.Object
		keyword in first closure end
		keyword in first closure start
		class is class com.dong.groovy.closure.GroovyClosureKeyWordTest$_main_closure1_closure2
		this is class com.dong.groovy.closure.GroovyClosureKeyWordTest super: java.lang.Object
		owner is com.dong.groovy.closure.GroovyClosureKeyWordTest$_main_closure1@1b1473ab super: groovy.lang.Closure
		delegate is com.dong.groovy.closure.GroovyClosureKeyWordTest$_main_closure1@1b1473ab super: groovy.lang.Closure
		keyword in first closure end

	 * @param args
	 */
	static main(args){
		GroovyClosureKeyword groovy = new GroovyClosureKeyword()
		groovy.closuretest(){
			println "keyword in first closure start"
			println "class is " + getClass()
			println "this is " + this + " super: " +this.getClass().superclass.name
			println "owner is " + owner + " super: " +owner.getClass().superclass.name
			println "delegate is " + delegate + " super: " +delegate.getClass().superclass.name
			println "keyword in first closure end"
			groovy.closuretest(){
				println "keyword in first closure start"
				println "class is " + getClass()
				println "this is " + this + " super: " +this.getClass().superclass.name
				println "owner is " + owner + " super: " +owner.getClass().superclass.name
				println "delegate is " + delegate + " super: " +delegate.getClass().superclass.name
				println "keyword in first closure end"
			}
		}
	}
}
