package com.dong.groovy.common

/**
 * 具名参数作为方法的参数
 * @author dong
 * 1. 实参数量不能多余形参数量，否则会出现异常
 * 2. 有种特殊情况，如果实参的数量多于形参数量，并且多出来的参数都是键值对模式，Groovy会默认方法的第一个参数是
 * Map类型（多参数），将多出来的键值对拼接成一个map传递进来
 * 3. 特别注意这是一种特殊情况，尽少用，有可能得不到自己想要，改进的方式是直接声明首个参数是map类型的
 */
class KeyValueMethod {

	static def access(first,second,third){
		println "KeyValueMethod:access:first: " + first + " second:" + second + " third:" + third
	}
	
	static def access2(Map first,second,third){
		println "KeyValueMethod:access2:first: " + first + " second:" + second + " third:" + third
	}

	static main(args) {
//		access(name:"appledong",age:12,id:"10010", 8, 9)
		access( 8, 9,name:"appledong",age:12,id:"10010")
		access2(5, 6, 7)//此时调用出现异常，第一个参数指明是Map，当前传递基本类型
	}
}
