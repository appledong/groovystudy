package com.dong.groovy.closure

/**
 * 动态闭包
 * @author dong
 * 1. 在方法体内可以判断闭包是否为空，从而进行不同的操作
 * 2. 在图片groovy闭包中所有的属性列表图片中记录了闭包的所有属性
 * 3. 通过属性maximumNumberOfParameters可以判断闭包需要的参数的个数
 * 4. 通过属性parameterTypes可以判断闭包需要参数的所有类型
 * 5. 如果闭包不需要参数，需要按照语法->实现，不声明参数
 */
class GroovyDyncClosure {

	static def compute(closure){
		if(closure == null){
			println "没有传递闭包"
		} else{
			closure("我来自方法compute")
		}
	}

	static def compute1(closure){
		if(closure.maximumNumberOfParameters==2){
			closure("我是第一个参数","我是第二个参数")
		} else{
			closure("我是第一个参数")
		}
	}

	static main(args) {
		compute()
		compute{ println it }

		compute1(){ def i,def j->
			println i+j
		}
		compute1(){  println it }
	}
}
