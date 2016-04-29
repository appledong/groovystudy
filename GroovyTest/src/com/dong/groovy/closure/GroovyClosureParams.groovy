package com.dong.groovy.closure

/**
 * groovy闭包参数的传递
 * @author dong
 * 1. groovy中如果方法仅有一个闭包参数，在方法调用的时候可以不写（）直接写闭包
 * 2. 闭包如果只有一个参数，可以使用it操作符
 * 3. 闭包传递回来的参数超过一个参数，得注明参数的数量
 */
class GroovyClosureParams {

	static def compute1(closure){
		for(def i= 0;i<15;i++){
			closure(i)
		}
	}

	static def compute2(closure){
		for(def i= 0;i<15;i++){
			closure(i,"0到15的偶数和是：")
		}
	}

	static main(args){
		compute1(){ println "来自Compute1的值是：" + it }
		compute2(){ def i,def j->
			println j+i 
		}
	}
}
