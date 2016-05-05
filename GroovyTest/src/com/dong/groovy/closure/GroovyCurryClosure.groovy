package com.dong.groovy.closure

/**
 * 科里化闭包
 * @author dong
 * 科里化闭包：闭包中的某些形参可以在调用的时候通过api curry()绑定通用的参数
 * curry():绑定闭包的某些参数，绑定个数是1< k<n
 * rcurry()：从后向前绑定闭包需要的通用参数参数个数是1<k<n
 */
class GroovyCurryClosure {

	static testCurryClosure(closure){
		Date date = new Date("07/05/2016")
		def ss1 = "这一天很重要"
		def ss2 = "这一天也很奇葩"
		//		closure(date,ss1)
		//		closure(date,ss2)
		def postFortune = closure.curry(date,ss1);
		postFortune ss1
		postFortune ss2
	}

	static main(args) {
		testCurryClosure(){ Date date,fortune1,fortune2 ->
			println "test"
			println date.getDateString() + "  " + fortune1 + " " + fortune2
			println "$date  $fortune1  $fortune2"
		}
	}
}
