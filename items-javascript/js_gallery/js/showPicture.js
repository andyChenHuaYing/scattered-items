function switchPicture(whichPicture) {
    var source = whichPicture.href;
    var placeholder = document.getElementById('placeholder');
    placeholder.setAttribute('src', source);
    document.getElementById('description').firstChild.nodeValue = whichPicture.getAttribute('title');
}

/*
 function countBodyChildren () {
 alert(document.getElementsByTagName('body')[0].childNodes.length);
 }

 window.onload = countBodyChildren;*/
