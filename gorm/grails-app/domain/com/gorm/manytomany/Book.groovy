package com.gorm.manytomany

class Book {

	String title
	static belongsTo = Author
	static hasMany = [authors:Author]

	static constraints = {
	}

	static mapping = { version false }
}
