package angular

import scala.scalajs.js
import scala.scalajs.js.annotation.JSBracketAccess

/**
 * Created by pwootage on 8/2/14.
 */
object AngularScala {

  trait Angular extends js.Object {
    def module(name: String, deps: js.Array[String]): AngularModule = ???
    def module(name: String): AngularModule = ???
  }

  trait AngularModule extends js.Object {
    def controller(name: String, constructor: js.Dynamic): js.Dynamic = ???
  }

  implicit class ScalaAngularModule(module: AngularModule) {
    def controller(name: String, controller: AngularController): js.Dynamic = {
      val helper = bridge.consHelper(controller.$inject, controller.inject _)
      module.controller(name, helper)
    }
  }

  trait AngularController {
    /**
     * List of services to inject
     */
    val $inject: js.Array[String]

    /**
     * Called to inject services. Do initialization in here!
     * @param services Services requested
     */
    def inject(services: js.Array[js.Any]): Unit
  }

  trait AngularScope extends js.Object {
    @JSBracketAccess
    def apply(key: js.Any): js.Any = ???

    @JSBracketAccess
    def update(key: js.Any, value: js.Any): Unit = ???

    def $watch(expr: String, listener: js.Function2[js.Any, js.Any, js.Any], objectEquality: Boolean = false) = ???

    def $eval(expr: String): js.Any = ???

    def $evalAsync(expr: String) = ???

    def $on(name: String, listener: (AngularEvent, js.Any *) => Unit) = ???

    def $emit(name: String, args: js.Any*) = ???

    def $broadcast(name: String, args: js.Any*) = ???
  }

  trait AngularEvent extends js.Object {
    val targetScope: AngularScope = ???
    val currentScope: AngularScope = ???
    val name: String = ???

    def stopPropagation() = ???

    def preventDefault() = ???

    val defaultPrevented: Boolean = ???
  }

}
