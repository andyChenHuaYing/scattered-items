/**
 * Created by andy on 1/7/2015.
 */

/**
 * Multiple execute window.onload;
 */
function addEvent(fun) {
    var oldFunction = window.onload;
    if (!oldFunction) {
        window.onload = fun;
    } else {
        window.onload = function () {
            oldFunction();
            fun();
        }
    }
}

addEvent(getNewContent());