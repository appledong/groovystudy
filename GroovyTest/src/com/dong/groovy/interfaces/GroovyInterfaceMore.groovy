package com.dong.groovy.interfaces

/**
 * 接口不同方法对应不同的回调的处理
 * @author dong
 * 1. 将一个map作为接口的回调
 * 2. map的key是接口中声明的方法名，value是一个闭包，闭包内的逻辑是接口这个方法对应的回调逻辑
 * 3. 在map中只是实现接口被调用的映射即可，不被调用的无需实现，但是接口种方法被调用以后必须有其映射
 * 没有将会出现空指针异常
 * 4. 实现接口回调时只是实现需要实现的即可，不需要实现全部的回调，在具体的使用中，针对不同逻辑调用不同的
 * 接口方法，这个特别适合
 */
class GroovyInterfaceMore {

	static printfirst(){
		println "first"
	}

	static printsecond(){
		println "second"
	}

	static printthird(){
		println "third"
	}

	static printfour(){
		println "four"
	}

	static main(args){
		InterfaceTrigger interfacetrigger = new InterfaceTrigger()
		def interfaceimpl = [firstMethod:{printfirst()},
			secondMethod:{printsecond()},
			"thirdMethod":{printthird()},
			"fourMethod":{printfour()}]
		interfacetrigger.setFirstInterface(interfaceimpl as FirstInterface)
		interfacetrigger.setSecondInterface(interfaceimpl as SecondInterface)
		interfacetrigger.interfaceTrigger()
	}
}
