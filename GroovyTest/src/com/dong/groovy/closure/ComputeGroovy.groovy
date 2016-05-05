package com.dong.groovy.closure

/**
 * 即时创建闭包优化了逻辑
 * @author dong
 * 和前面的Java文件相比具有以下的优势：
 * 1. Java是先定义好方法，让对象去调用，不灵活，而闭包的引入让对象调用的时候更灵活，具体的操作逻辑以闭包的方式作为参数传递进去
 * 2. Java面向对象语言，对于每一个对象创建相应的属性和行为，而Groovy已经不局限于对象了，束缚更少
 * 3. Java抽象的是逻辑，而groovy的闭包抽象的是行为的部分相似地方，确切的说抽象的是部分行为
 * 4. groovy中的闭包多是在重构的时候使用，在开发中不一定能够抽象出来，类似于mvp模式
 * 5. 闭包可以声明为变量，用来复用
 * 6. 闭包可以被用来更好的设计逻辑和优化代码逻辑，了解groovy是为了了解gradle和Android的解析，此处咱不细究
 * 7. groovy中的闭包作用可以看作是java中的接口，而且还是不需要提前定义的接口，在需要实现的时候可以直接使用的
 */
class ComputeGroovy {

	static def compute(closure){
		for(def i=2;i<15;i+=2){
			closure(i)
		}
	}

	static main(args){
		int add = 0;
		int add2 = 1;
		compute{
			println "$it"
			add = add + it
		}
		compute{ add2 = add2*it }
		println "0到15所有的偶数的和是：" + add
		println "0到15所有的偶数的积是：" + add2
	}
}
