/**
 * Created by andychen on 2015/1/8.
 */

/**
 * Change abbreviations display style.
 */
function displayAbbreviations() {
    if (!document.createElement) {
        return false;
    }
    if (!document.createTextNode) {
        return false;
    }
    if (!document.getElementsByTagName) {
        return false;
    }

    var h2 = document.createElement("h2");
    var h2Text = document.createTextNode("Abbreviations");
    h2.appendChild(h2Text);
    var dl = document.createElement("dl");
    var abbrArray = document.getElementsByTagName('abbr');
    if (abbrArray.length == 0) {
        return false;
    }
    for (var i = 0; i < abbrArray.length; i++) {
        //Continue for loop if abbr is not supported by the current browser.
        if (abbrArray[i].childNodes.length < 1) continue;
        var abbrTitleNode = document.createTextNode(abbrArray[i].title);
        var abbrTextNode = document.createTextNode(abbrArray[i].firstChild.nodeValue);
        var dt = document.createElement("dt");
        var dd = document.createElement("dd");

        dd.appendChild(abbrTitleNode);
        dt.appendChild(abbrTextNode);
        dl.appendChild(dt);
        dl.appendChild(dd);
    }
    //document.body.appendChild(h2).appendChild(dl);
    document.body.appendChild(h2);
    document.body.appendChild(dl);
}