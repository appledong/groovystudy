package com.dong.groovy.javabean

/**
 * Groovy javabean：
 * @author dong
 * 参数没有必要声明类型，在解释的时候根据赋值确认参数的类型，类js等脚本语言会有一个def（通用类型的关键字，类似于var）
 * bean的声明中不需要get和set会自动生成（标注final后仅生成set）
 * 参数不能被外部修改只有加上final操作符，可以在Groovy中声明方法和变量为private，但是groovy不会处理，在外部
 * 仍然可以通过类的对象访问私有方法和修改私有变量（Groovy早期版本不可以）
 * 
 */
class PersonByGroovy {

	def name
	def age
	final def personid = "10010"
	PersonByGroovy(personname,personage){
		name = personname
		age = personage
	}
}
