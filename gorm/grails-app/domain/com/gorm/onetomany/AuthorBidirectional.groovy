package com.gorm.onetomany

class AuthorBidirectional {

	String name
	static hasMany = [ books : BookBidirectional ]

	static constraints = {}

	static mapping = { version false }
}
