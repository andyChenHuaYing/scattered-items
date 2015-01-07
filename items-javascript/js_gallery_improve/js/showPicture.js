/**
 * Attach onlick even on a link tag.
 */
function prepareGallery () {
	if (!document.getElementById) {return false};
	if (!document.getElementsByTagName) {return false};

	var imageGalleryNode = document.getElementById('imageGallery');
	if (!imageGalleryNode) {return false};

	var links = imageGalleryNode.getElementsByTagName("a");
	if (links.length > 0) {
		for (var i = links.length - 1; i >= 0; i--) {
			links[i].onclick = function (){
				/*
					if show picture work then stop a link active.
					a link will not work if return false.
				 */
				return showPicture(this) ? false : true;
			}
		}
	}
}

/**
 * Show the clicked picture.
 * @param  {[type]} which picture is clicked.[description]
 * @return false if something is unexpected .
 */
function showPicture(whichPicture){
	var placeholder = document.getElementById('placeholder');
	if (!placeholder) {return false}
	if (placeholder.nodeName != "IMG") {return false};

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
 * Multiple execut window.onload;
 */
function addEvent(fun){
	var oldFunction = window.onload;
	if (typeof window.onload != 'function') {
		window.onload = fun;
	} else {
		window.onload = function () {
			oldFunction();
			fun();
		}
	}
}

addEvent(prepareGallery);
