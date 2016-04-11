package com.dong.groovy.javabean

class PrivatePersonByGroovy {
	private def name
	private def age
	private final def personid = "10010"

	PrivatePersonByGroovy(personname,personage){
		name = personname
		age = personage
	}
	
	private resetage(personage){
		age = personage + 1;
	}
	
	
}
