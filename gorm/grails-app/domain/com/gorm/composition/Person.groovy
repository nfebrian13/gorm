package com.gorm.composition

class Person {

	Address homeAddress
	Address workAddress
	static embedded = ['homeAddress', 'workAddress']

	static constraints = {}

	static mapping = { version false }
}
