package angular

import scala.scalajs.js

/**
 * Created by pwootage on 8/2/14.
 */
object DefferedAPI {
  private def doNothing(arg: js.Any) = Unit
  class $q extends js.Object {
    def defer(): Promise = ???
    def reject(value: js.Any): Promise = ???
  }
  class Promise extends js.Object {
    def then(success: (js.Any) => Unit, failure: (js.Any) => Unit = doNothing, update: (js.Any) => Unit = doNothing): Promise = ???
  }
}

