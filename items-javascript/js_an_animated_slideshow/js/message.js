/**
 * Created by andychen on 2015/1/9.
 */
function positionMessage() {
    var elem = document.getElementById('message');
    elem.style.position = 'absolute';
    elem.style.top = '100px';
    elem.style.left = '50px';
    moveElement('message', 555, 444, 10);
}
