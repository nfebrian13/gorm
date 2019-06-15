package com.gorm.onetoone

/* unidirectional one-to-one relationship */

class FaceUnidirectional {

	NoseUnidirectional nose

	static constraints = { nose unique: true }
	static mapping = { version false }
}
