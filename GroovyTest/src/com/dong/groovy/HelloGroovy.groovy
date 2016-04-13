package com.dong.groovy

/**
 *  hello groovy
 * @author dong
 * 1. 类名和方法名都是默认的public，不需要注明，对于groovy来说没有private概念，对于private的变量和方法都是外部访问的
 * 2. 方法可以没有返回值,但是在测试中方法的书写得有static或者def（任意返回值）的声明，不然编译错误
 * 3. 参数可以不指定其所属的类型
 * 4. 语句之间可以没有分号隔离
 */
class HelloGroovy {
	protected def printlnself(){
		println "hello groovy"
	}

	static main(args) {
		println "it is my first groovy class"
		println "hello groovy"
	}
}
