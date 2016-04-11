package com.dong.groovy.common

/**
 * Groovy方法可以返回多个返回值
 * @author dong
 * 1. Groovy方法可以不指定返回的类型，由具体调用的时候值决定（返回的类型和需要的必须一致，不一致会出现异常）
 * 2. Groovy方法可以没有return关键字，最后一行代码的执行结果就是返回值，如果最后一行没有则返回为null
 * 3. Groovy方法可以有多个返回值（返回的数组类型或者list类型，不是返回多个return）Groovy返回形式如def ( firstname,secondname)
 * 4. Groovy返回的值的个数小于等于方法实际返回的数组或者list的个数，大于时分为两种情况：一是出现数组越界异常（par.split("[.]")）另一种
 * 是没有赋值的置为null["haha","gary"]
 * 5. Groovy返回多个值可以很轻松的实现两个字符串的转换，不需要借助第三个字符串
 */
class MuiltyReturn {

	static def spit(par="jhon.david"){
		par.split("[.]")
//		["haha","gary"]
	}
	
	static main(args){
		def ( firstname,secondname) = spit();
		println "MuiltyReturn:firstname: " + firstname + " secondname: " + secondname
		def name = spit();
		println "MuiltyReturn:name" + name
		def name1= "good"
		def name2 = "haha"
		println "MuiltyReturn:name1 " + name1 + " name2 " + name2
		(name1,name2) = [name2,name1]
		println "MuiltyReturn:name1 " + name1 + " name2 " + name2
		def ( first,second,third) = spit();
		println "MuiltyReturn:first: " + first + " second: " + second + " third:" + third
	}
}
