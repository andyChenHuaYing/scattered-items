/**
 * Created by andychen on 2015/1/9.
 */
function moveElementImprove (elementId, final_x, final_y, interval) {
    var elem = document.getElementById(elementId);

    if(elem.movement) {
        clearTimeout(elem.movement);
    }

    if(!elem.style.left) {
        elem.style.left = '0px';
    }

    if(!elem.style.top) {
        elem.style.top = '0px';
    }

    var topPosition = parseInt(elem.style.top);
    var leftPosition = parseInt(elem.style.left);
    var dist = 0;

    if (topPosition < final_y) {
        dist = Math.ceil((final_y - topPosition) / 10);
        topPosition += dist;
    }

    if (topPosition > final_y) {
        dist = Math.ceil((topPosition - final_y) / 10);
        topPosition -= dist;
    }

    if (leftPosition < final_x) {
        dist = Math.ceil((final_x - leftPosition) / 10);
        leftPosition += dist;
    }

    if (leftPosition > final_x) {
        dist = Math.ceil((leftPosition - final_x) / 10);
        leftPosition -= dist;
    }

    if (topPosition == final_y && leftPosition == final_x) {
        return true;
    }
    elem.style.top = topPosition + 'px';
    elem.style.left = leftPosition + 'px';
    var repeat = "moveElement('"+elementId+"', "+final_x+", "+final_y+", "+interval+")";
    elem.movement = setTimeout(repeat, interval);
}