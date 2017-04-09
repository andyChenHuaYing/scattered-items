/**
 * Created by andychen on 2015/1/8.
 */
function displayAccessKeys() {
    if (!document.getElementById) {
        return false;
    }
    if (!document.getElementsByTagName) {
        return false;
    }
    if (!document.createElement) {
        return false;
    }

    var ulNode = document.getElementById("navigation");
    var aList = ulNode.getElementsByTagName("a");
    if (aList.length <= 0) {
        return false;
    }

    var h3 = document.createElement("h3");
    var newUl = document.createElement("ul");
    for (var i = 0; i < aList.length; i++) {
        var current_link = aList[i];
        var current_link_value = current_link.lastChild.nodeValue;
        var current_link_accesskey = current_link.accessKey;
        if (!current_link_accesskey) continue;
        var newLi = document.createElement("li");
        var str = current_link_accesskey + ":" + current_link_value;
        var newALink = document.createElement("a");
        newALink.innerText = str;
        newALink.href = current_link.href;
        newALink.accessKey = current_link_accesskey;
        newLi.appendChild(newALink);
        newUl.appendChild(newLi);
        console.info("accesskey:" + current_link_accesskey)
    }
    var accessKeyTile = document.createTextNode("AccessKey : ");
    h3.appendChild(accessKeyTile);
    document.body.appendChild(h3);
    document.body.appendChild(newUl);
}

addEvent(displayAccessKeys);