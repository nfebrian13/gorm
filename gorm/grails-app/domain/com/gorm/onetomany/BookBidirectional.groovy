package com.gorm.onetomany

class BookBidirectional {

	String title
	static belongsTo = [author:AuthorBidirectional]

	static constraints = {}

	static mapping = { version false }
}
