package angular

import scala.scalajs.js

/**
 * Created by pwootage on 8/2/14.
 */
object AngularHTTPService {
  trait AngularHTTP extends js.Object {
    def apply(config: js.Dynamic): AngularHTTPPromise = ???
  }

  trait AngularHTTPPromise extends DefferedAPI.Promise {
    def success(callback: (js.Any, Int) => Unit): AngularHTTPPromise = ???
    def error(callback: (js.Any, Int) => Unit): AngularHTTPPromise = ???
  }
}
