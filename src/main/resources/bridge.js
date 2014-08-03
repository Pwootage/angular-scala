/**
 * Created by pwootage on 8/2/14.
 */

window.bridge = {
  consHelper: function($inject, apply) {
    var ret = function() {
      apply(arguments);
      return this;
    };
    ret.$inject = $inject;
    return ret;
  }
};

window.bridge.consHelper.prototype = Function;