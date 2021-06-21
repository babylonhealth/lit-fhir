package com.babylonhealth.lit.macros

import scala.annotation.{ Annotation, compileTimeOnly }

@compileTimeOnly("This shouldn't exist")
class POJOBoilerplate extends Annotation
