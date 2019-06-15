package com.gorm.onetoone

class NoseBidirectional {

	static belongsTo = [face:FaceBidirectional]

	static constraints = {
	}
	static mapping = { version false }
}
