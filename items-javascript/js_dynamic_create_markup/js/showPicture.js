/**
 * Attach onclick even on a link tag.
 */
function prepareGallery() {
    if (!document.getElementById) {
        return false
    }
    if (!document.getElementsByTagName) {
        return false
    }

    var imageGalleryNode = document.getElementById('imageGallery');
    if (!imageGalleryNode) {
        return false
    }

    var links = imageGalleryNode.getElementsByTagName("a");
    if (links.length > 0) {
        for (var i = links.length - 1; i >= 0; i--) {
            links[i].onclick = function () {
                /*
                 if show picture work then stop a link active.
                 a link will not work if return false.
                 */
                return showPicture(this) ? false : true;
            };
            links[i].onkeypress = links[i].onclick;
        }
    }
}

/**
 * Insert after the specified node
 */
function insertAfter(newNode, targetElement) {
    var parentNode = targetElement.parentNode;
    if (parentNode.lastChild == targetElement) {
        parentNode.appendChild(newNode);
    } else {
        parentNode.insertBefore(newNode, targetElement.nextSibling);
    }
}

/**
 * Construct placeholder element
 */
function preparePlaceholder() {

    if (!document.createElement) {
        return false;
    }
    if (!document.createTextNode) {
        return false;
    }
    if (!document.getElementById) {
        return false;
    }
    if (!document.getElementById('imageGallery')) {
        return false;
    }
    var imgElement = document.createElement("IMG");
    imgElement.src = "../picture/benchi.jpg";
    imgElement.alt = "my image gallery";
    imgElement.id = "placeholder";

    var pElement = document.createElement("p");
    pElement.id = "description";

    var txt = document.createTextNode("Choose one picture !");

    var galleryNode = document.getElementById('imageGallery');
    insertAfter(imgElement, galleryNode);
    pElement.appendChild(txt);
    insertAfter(pElement, imgElement);
}

/**
 * Show the clicked picture.
 * which picture is clicked.
 * false if something is unexpected .
 */
function showPicture(whichPicture) {
    var placeholder = document.getElementById('placeholder');
    if (!placeholder) {
        return false
    }
    if (placeholder.nodeName != "IMG") {
        return false
    }

    var source = whichPicture.getAttribute('href');
    placeholder.setAttribute('src', source);

    var description = document.getElementById('description');
    if (description) {
        var text = whichPicture.getAttribute('title') ? whichPicture.getAttribute('title') : "";
        var firstChildNode = description.firstChild;
        if (firstChildNode.nodeType == 3) {
            firstChildNode.nodeValue = text;
        }
    }
    return true;
}

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

addEvent(prepareGallery);
addEvent(preparePlaceholder);
