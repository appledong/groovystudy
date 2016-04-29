package com.dong.groovy.closure

/**
 * 使用闭包实现方法的封装
 * @author dong
 * 1. 使用闭包可以实现逻辑方法和逻辑方法的准备方法和逻辑方法后的善后方法封装在一起，user调用的时候只是关注逻辑方法即可
 * 2. 针对资源的读取和写入等都可以
 * 3. groovy提供了一系列的api，在api中封装了非逻辑方法，外面使用的时候又易忘的api
 * 4. ExecuteAroundMethod（三明治模式）：讲逻辑体加载逻辑前和逻辑后中间的设计模式
 */
class GroovyClosureExecuteAroundMethod {

	def open(){
		println "open 资源"
	}

	def read(){
		println "read 资源"
	}

	def write(){
		println "write 资源"
	}

	def closed(){
		println "closed 资源"
	}

	static def user(closure){
		def test = new GroovyClosureExecuteAroundMethod ()
		test.open();
		try{
			closure(test)
		} finally{
			test.closed()
		}
	}

	static main(args) {
		user{
			it.read()
			it.write()
		}
	}
}
