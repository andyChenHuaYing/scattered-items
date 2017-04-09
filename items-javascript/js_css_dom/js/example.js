function elementOnclick() {
    var elements = document.getElementsByTagName("p");
    for (var i = 0; i < elements.length; i++) {
        elements[i].onclick = function () {
            alert("You click a p tag !");
        }
    }
}

function stripeTable() {
    var tableElements = document.getElementsByTagName("table");
    var odd = true;
    for (var i = 0; i < tableElements.length; i++) {
        var trElements = tableElements[i].getElementsByTagName("tr");
        for (var j = 0; j < trElements.length; j++) {
            if (odd) {
                trElements[j].style.backgroundColor = '#ffc';
                odd = false;
            } else {
                odd = true;
            }
        }
    }
}

function addClass(elems, newClassName) {
    if (!elems.className) {
        elems.className = newClassName;
    } else {
        var currentClassName = elems.className;
        var space = " ";
        elems.className = currentClassName + space + newClassName;
    }
}

/**
 * Enhancing stripe table function.
 */
function useClassStripeTable() {
    var tableElements = document.getElementsByTagName("table");
    var odd = true;
    for (var i = 0; i < tableElements.length; i++) {
        var trElements = tableElements[i].getElementsByTagName("tr");
        for (var j = 0; j < trElements.length; j++) {
            if (odd) {
                addClass(trElements[j], "odd");
                odd = false;
            } else {
                odd = true;
            }
        }
    }
}