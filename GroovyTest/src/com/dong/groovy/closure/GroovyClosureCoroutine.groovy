package com.dong.groovy.closure

/**
 * Groovy扩展了Java对协程的实现
 * @author dong
 *	Java原生不支持协程的开发，groovy通过闭包实现了协程开发
 *  此处的协程指的是逻辑上的协程，本例中iterate循环调用闭包，闭包实现具体的逻辑
 *  这个实现在Java中可以通过接口实现
 */
class GroovyClosureCoroutine {

	static def iterate(n,closure){
		1.upto(n) {
			println "In iterate of value ${it}"
			closure(it)
		}
	}

	static main(args) {
		println "call iterate method start"
		def total = 0
		iterate(10){
			total+=it
			println "In closure of value toatle is" + total
		}
		println "call iterate method end"
	}
}
