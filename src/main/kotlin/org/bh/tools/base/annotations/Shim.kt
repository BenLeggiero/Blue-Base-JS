package org.bh.tools.base.annotations

import kotlin.annotation.*
import kotlin.js.*
import kotlin.reflect.*

/*
 * @author Ben Leggiero
 * @since 2018-11-27.
 */




@Target(AnnotationTarget.FUNCTION,
        AnnotationTarget.PROPERTY_GETTER,
        AnnotationTarget.PROPERTY_SETTER,
        AnnotationTarget.CONSTRUCTOR)
annotation class Throws(vararg val exceptionClasses: KClass<out Throwable>)



class ArithmeticException(message: String? = null): Exception(message = message)



external object Console {
    fun dir(o: Any): Unit
    fun error(vararg o: Any?): Unit
    fun info(vararg o: Any?): Unit
    fun log(vararg o: Any?): Unit
    fun warn(vararg o: Any?): Unit
    fun assert(condition: Boolean, vararg objects: Any)
    fun assert(condition: Boolean, message: String, vararg substitutions: Any)
}



fun assert(condition: Boolean, message: () -> String) = Console.assert(condition, message())
