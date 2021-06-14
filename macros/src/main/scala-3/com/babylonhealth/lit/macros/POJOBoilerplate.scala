package com.babylonhealth.lit.macros

import scala.annotation.{ StaticAnnotation, compileTimeOnly }

import com.babylonhealth.lit.macros.boilerplateMethodsMacro

@compileTimeOnly("add 'scalacOptions += \"-Ymacro-annotations\"' to your build file to enable macro annotations")
class POJOBoilerplate extends StaticAnnotation
