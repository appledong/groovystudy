package com.dong.groovy.javabean

/**
 * 具名参数（在初始化bean的时候以键值对方式指明bean中的参数）初始化javabean
 * @author dong
 * 1. Java构造方法：默认情况下类有一个无参构造方法，但是在类中指明构造方法后，Java不会在生成默认的无参构造方法。
 * 2. 由于具名参数的处理是在无参构造方法执行后执行的，加上上面的声明，所以在bean中指明构造方法（没有无参构造方法）
 * 具名参数不起作用。
 * 3. 初始化时，具名参数可以少于bean的变量数量，没有指明的为null
 * 4. 初始化时，具名参数指定bean没有声明的变量的时候，会出现No such property异常
 */
class KeyValueinitPersonByGroovy {

	def name
	def age
	def id
	
	KeyValueinitPersonByGroovy(){
		
	}
	
	KeyValueinitPersonByGroovy(name,age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name: " + name + " age: " + age + " id: " + id;
	}



	static main(args) {
		KeyValueinitPersonByGroovy keyvalueinitpersonbygroovy = new KeyValueinitPersonByGroovy(name:"appledong",age:12,id:"10010")
		println keyvalueinitpersonbygroovy.toString()
		KeyValueinitPersonByGroovy keyvalueinitpersonbygroovy2 = new KeyValueinitPersonByGroovy(name:"appledong",age:12)
		println keyvalueinitpersonbygroovy2.toString()
		KeyValueinitPersonByGroovy keyvalueinitpersonbygroovy3 = new KeyValueinitPersonByGroovy(name:"appledong",age:12,haha:"haha")
		println keyvalueinitpersonbygroovy3.toString()
	}
}
