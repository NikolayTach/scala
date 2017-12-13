/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2017, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
*/

package scala.annotation

/**
 * Annotation classes extending this trait only accept constant values as arguments.
 *
 * Note that this trait extends [[StaticAnnotation]], so constant annotations are persisted in the
 * classfile.
 *
 * The implementation requires arguments of constant annotations to be passed as named arguments,
 * except if there is a single argument, which then defines the annotation's parameter named
 * `value`.
 *
 * Constant annotations may use default arguments. Note that the internal representation of an
 * annotation usage (which is visible for compiler plugins, for example) only contains arguments
 * that are explicitly provided.
 *
 * Constant annotations are not allowed to define auxiliary constructors, and the primary
 * constructor is required to have a single parameter list.
 *
 * Example:
 *
 * {{{
 *   class Ann(value: Int, x: Int = 0) extends scala.annotation.ConstantAnnotation
 *   class Test {
 *     def someInt = 0
 *     @Ann(value = 0, x = 1) def g = 0
 *     @Ann(0) def f = 0                 // Internal representation contains `@Ann(value = 0)`
 *     @Ann(someInt)                     // error: argument needs to be a compile-time constant
 *   }
 * }}}
 */
trait ConstantAnnotation extends StaticAnnotation
