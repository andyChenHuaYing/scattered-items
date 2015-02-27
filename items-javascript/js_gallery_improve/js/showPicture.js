/**
 * Attach onclick even on a link tag.
 */
function prepareGallery () {
	if (!document.getElementById) {return false}
	if (!document.getElementsByTagName) {return false}

	var imageGalleryNode = document.getElementById('imageGallery');
	if (!imageGalleryNode) {return false}

	var links = imageGalleryNode.getElementsByTagName("a");
	if (links.length > 0) {
		for (var i = links.length - 1; i >= 0; i--) {
			links[i].onclick = function (){
				/*
					if show picture work then stop a link active.
					a link will not work if return false.
				 */
				return !showPicture(this);
			}
		}
	}
}

/**
 * Show the clicked picture.
 * which picture is clicked.[description]
 * @return boolean if something is unexpected .
 */
function showPicture(whichPicture){
	var placeholder = document.getElementById('placeholder');
	if (!placeholder) {return false}
	if (placeholder.nodeName != "IMG") {return false}

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

/*
function prepareGallery(){if(!document.getElementById||!document.getElementsByTagName)return!1;var a=document.getElementById("imageGallery");if(!a)return!1;a=a.getElementsByTagName("a");if(0<a.length)for(var b=a.length-1;0<=b;b--)a[b].onclick=function(){return showPicture(this)?!1:!0}}
function showPicture(a){var b=document.getElementById("placeholder");if(!b||"IMG"!=b.nodeName)return!1;var c=a.getAttribute("href");b.setAttribute("src",c);if(b=document.getElementById("description"))a=a.getAttribute("title")?a.getAttribute("title"):"",b=b.firstChild,3==b.nodeType&&(b.nodeValue=a);return!0}function addEvent(a){var b=window.onload;window.onload="function"!=typeof window.onload?a:function(){b();a()}}addEvent(prepareGallery);*/
