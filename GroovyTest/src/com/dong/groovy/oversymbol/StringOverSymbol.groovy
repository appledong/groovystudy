package com.dong.groovy.oversymbol

class StringOverSymbol {

	static main(args) {

		//++操作符的使用
		for(char aha = 'a';aha<'c';aha++){
			println aha
		}
		
		//++操作符等于String类中的next() api
		for(def ah='a';ah<'c';ah++){
			println ah
		}

		/**
		 * groovy for-each语法也是使用到String的next() api
		 * 'a' .. 'c':代表从字符串a到c等价于['a','b','c']
		 */
		for(def cha in 'a' .. 'c'){
			println cha
		}
	}
}
