package com.dong.groovy.common

class GroovyBoolean {

	/**
	 * 布尔计算
	 * @param args
	 * Java针对的表达式必须是一个布尔表达式if语句和switch语句
	 * groovy不一样针对的表达式可以是普通的表达式，因为在groovy的内部
	 * 有一套判断机制对于变量和list（数组）判断机制如下：
	 * 变量：不为null则为true，为null则为false
	 * list：不为null且至少有一个数据为true，其他为false
	 * 判空操作符：?. 判空很方便，不需要再写if语句如：str2?. println "str2不为空"
	 * 除上面以为，系统还提供了一批其他的布尔计算机制，详见印象笔记
	 */
	static main(args) {
		def str = null
		println str? "str true":"str false"
		def str2 = "test"
		println str2? "str true":"str false"
		def list = []
		println list? "list true":"list false"
		def list2 = [2, 3, 4]
		println list2? "list2 true":"list2 false"
		
		str2?. println "str2不为空"
	}
}
