package com.dong.groovy.oversymbol

class ListOverSymbol {

	static main(args) {

		/**
		 * list中<<操作符的使用，等价于leftShift()：list添加一个新元素
		 */
		def list = ["hello", "mary", "lily"]
		list<<"haha"
		list.each { println "$it" }
	}
}
