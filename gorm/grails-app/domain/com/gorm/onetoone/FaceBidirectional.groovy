package com.gorm.onetoone

class FaceBidirectional {

	NoseBidirectional nose

	static constraints = { nose unique: true }
	static mapping = { version false }
}
