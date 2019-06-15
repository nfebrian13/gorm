package com.gorm.manytomany

class Author {

	String name
	static hasMany = [books:Book]

	static constraints = {
	}

	static mapping = { version false }
}
