/**
 * Created by andychen on 2015/1/9.
 */
function prepareSlideShow() {
    var div = document.createElement("div");
    div.id = "slideShow";
    var img = document.createElement("IMG");
    img.id = "preview";
    img.src = "../images/preview.png";
    img.alt = "building blocks of web design";
    div.appendChild(img);
    insertAfter(document.getElementById("linkList"), div);

    var links = document.getElementsByTagName("a");
    links[0].onmouseover = function () {
        moveElementImprove("preview", -100, 0, 10);
    };
    links[1].onmouseover = function () {
        moveElementImprove("preview", -200, 0, 10);
    };
    links[2].onmouseover = function () {
        moveElementImprove("preview", -300, 0, 10);
    }
}

function insertAfter(targetTag, newTag) {
    var parent = targetTag.parentNode;
    if (parent.lastChild == targetTag) {
        parent.appendChild(newTag);
    } else {
        parent.insertBefore(newTag, targetTag.nextSibling);
    }
}


