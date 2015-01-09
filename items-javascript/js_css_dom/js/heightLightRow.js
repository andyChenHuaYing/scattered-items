/**
 *
 * Created by andychen on 2015/1/9.
 */
function heightLightRow() {
    var tableElements = document.getElementsByTagName("table");
    for (var i = 0; i < tableElements.length; i++) {
        var trElements = tableElements[i].getElementsByTagName("tr");
        for (var j = 0; j < trElements.length; j++ ) {
            var tr = trElements[j];
            tr.onmouseover = function () {
              this.style.fontWeight = 'bold';
            };
            tr.onmouseout = function () {
              this.style.fontWeight = 'normal';
            };
        }
    }
}