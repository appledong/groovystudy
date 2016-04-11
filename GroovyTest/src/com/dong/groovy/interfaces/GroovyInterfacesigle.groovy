package com.dong.groovy.interfaces

/**
 * 针对多个接口（每个接口都是多方法）接口方法都是单实现
 * @author dong
 * 注意是闭包作为接口的回调
 */
class GroovyInterfacesigle {

	static printself(){
		println "printself"+{$it}
	}

	static main(args) {
		InterfaceTrigger interfaceTrigger = new InterfaceTrigger();
		interfaceTrigger.setFirstInterface({printself()} as FirstInterface)
		interfaceTrigger.setSecondInterface({printself()} as SecondInterface)
		interfaceTrigger.interfaceTrigger()
	}
}
