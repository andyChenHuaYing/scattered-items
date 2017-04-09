/**
 * Created by andychen on 2015/1/9.
 */
var movement;
function moveElement(elementId, final_x, final_y, interval) {
    var elem = document.getElementById(elementId);
    var topPosition = parseInt(elem.style.top);
    var leftPosition = parseInt(elem.style.left);

    if (topPosition < final_y) {
        topPosition++;
    }

    if (topPosition > final_y) {
        topPosition--;
    }

    if (leftPosition < final_x) {
        leftPosition++;
    }

    if (leftPosition > final_x) {
        leftPosition--;
    }

    if (topPosition == final_y && leftPosition == final_x) {
        return true;
    }
    elem.style.top = topPosition + 'px';
    elem.style.left = leftPosition + 'px';
    var repeat = "moveElement('" + elementId + "', " + final_x + ", " + final_y + ", " + interval + ")";
    movement = setTimeout(repeat, interval);
}