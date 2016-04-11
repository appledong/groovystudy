package com.dong.groovy.javabean

class JavaBeanTest {

	static main(args) {
		PersonByJava personbyjava = new PersonByJava("appledong", 30);
		println "PersonByJava:name: " + personbyjava.name
		println "PersonByJava:age: " + personbyjava.age
		println "reload setting name: "
		personbyjava.setName("googledong")
		println "PersonByJava:name: " + personbyjava.name
		println "PersonByJava:personid: " + personbyjava.personid

		PersonByGroovy personbygroovy = new PersonByGroovy("appledong", 30)
		println "PersonByGroovy:name: " + personbygroovy.name
		println "PersonByGroovy:age: " + personbygroovy.age
		println "reload setting name: "
		personbygroovy.setName("googledong")
		println "PersonByGroovy:name: " + personbygroovy.name
		println "PersonByGroovy:personid: " + personbygroovy.personid

		PrivatePersonByGroovy privatepersonbygroovy = new PrivatePersonByGroovy("appledong", 30)
		println "PrivateJavaBeanByGroovy:name: " + privatepersonbygroovy.name
		println "PrivateJavaBeanByGroovy:age: " + privatepersonbygroovy.age
		try{
			println "reload setting personid: "
			privatepersonbygroovy.personid = "10012"
		} catch(groovy.lang.ReadOnlyPropertyException ex){
			println ex.message
		}

		try{
			println "reload setting name: "
			privatepersonbygroovy.name = "google name"
			println "PrivateJavaBeanByGroovy:name: " + privatepersonbygroovy.name
		}catch(IllegalAccessException ex){
			println ex.message
		}
		
		println "reload setting name: "
		privatepersonbygroovy.resetage(25)
		println "PrivateJavaBeanByGroovy:age: " + privatepersonbygroovy.age
	}
}
