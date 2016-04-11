package com.dong.groovy.interfaces

/**
 * 针对动态接口实现
 * @author dong
 * 1. 声明处理闭包
 * 2. 使用1中的闭包和Groovy提供的asType api 获取到接口的一个实例
 * 3. 将实例传递给接口
 * 4. 做个记录，现实中还没有遇到这种方式（原理是反射）
 */
class DynamicGroovyInterface {

	static printfirst(){
		println  "first"
	}

	static printsecond(){
		println  "second"
	}

	static main(args) {
		//	 def listener = [FirstInterface,SecondInterface]
		def handlerfirst = {printfirst()}
		def handlersecond = {printsecond()}
		def handlerfirstimpl = handlerfirst.asType(Class.forName("com.dong.groovy.interfaces.FirstInterface"))
		def handlersecondimpl = handlersecond.asType(Class.forName("com.dong.groovy.interfaces.SecondInterface"))
		InterfaceTrigger interfaceTrigger = new InterfaceTrigger()
		interfaceTrigger.setFirstInterface(handlerfirstimpl)
		interfaceTrigger.setSecondInterface(handlersecondimpl)
		interfaceTrigger.interfaceTrigger()
	}

}
