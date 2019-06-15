package com.gorm.onetomany

class AuthorUnidirectional {

	String name
	static hasMany = [ books : BookUnidirectional ]
	
	static constraints = {}
	
	static mapping = { version false }
}
