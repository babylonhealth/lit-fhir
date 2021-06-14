package com.babylonhealth.lit.macros

import scala.annotation.{ StaticAnnotation, compileTimeOnly }

@compileTimeOnly("add 'scalacOptions += \"-Ymacro-annotations\"' to your build file to enable macro annotations")
class POJOBoilerplate extends StaticAnnotation
