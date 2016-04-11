package com.dong.groovy.common

/**
 * Groovy定义参数（形参）是可选的，实参可以不传递
 * @author dong
 * 1. 在定义方法的行参时，可以设置形参的默认值
 * 2. 定义方法的形参时，可以不指定类型，参数是通过赋值决定自己的类型的
 * 3. 如例，定义形参的时候指定为int，实参传进来是String，不会出现异常，参数以运行时传进来的数据类型为主
 * 4. 实参数量可以少于形参的数量，但是不能够大于形参的数量，编译通不过
 */
class OptionalParameters {
	
	static def printParameters(firstparameter,secondparameter = 10){
		println "OptionalParameters:firstparameter " + firstparameter + " secondparameter: " + secondparameter
	}

	static main(args) {
	  printParameters("firstmain")
	  printParameters("firstmain",100)
	  printParameters("firstmain","secondmain")
//	  printParameters("firstmain","secondmain",thirdmain)
	}

}
