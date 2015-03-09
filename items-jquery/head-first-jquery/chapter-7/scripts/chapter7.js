var intOne, intTwo, intThree;
window.onfocus = runLightning;
window.onblur = stopLightning;
function runLightning() {
    intOne = window.setInterval(lightningOne, 2000);
    intTwo = window.setInterval(lightningTwo, 3000);
    intThree = window.setInterval(lightningThree, 5000)
}
function stopLightning() {
    window.clearInterval(intOne);
    window.clearInterval(intTwo);
    window.clearInterval(intThree);
}

function lightningOne() {
    $('#lightning1').fadeIn(250).fadeOut(250);
}

function lightningTwo() {
    $('#lightning2').fadeIn(250).fadeOut(250);
}
function lightningThree() {
    $('#lightning3').fadeIn(250).fadeOut(250);
}

//Change face
var clix = [0, 0, 0, 0];
$('#head').click(function () {
    moveTo(0, this);
});
$('#eyes').click(function () {
    moveTo(1, this);
});
$('#nose').click(function () {
    moveTo(2, this);
});
$('#mouth').click(function () {
    moveTo(3, this);
});
function moveTo(i, obj) {
    if (clix[i] < 9) {
        clix[i] = clix[i] + 1;
        $(obj).animate({left: "-=367px"}, 300);
    } else {
        clix[i] = 0;
        $(obj).animate({left: "0"}, 300);
    }
}

function getRandom(num) {
    return Math.floor(Math.random() * num);
}

var w = 367;
var m = 10;

$('#btnRandom').click(randomize);


$('#btnReset').click(reset);

function randomize() {
    $('.face').each(function (index) {
        var target_position = getRandom(m);
        var current_position = clix[index];
        var moveTo;
        clix[index] = target_position;
        if (target_position > current_position) {
            moveTo = (target_position - current_position) * w;
            $(this).animate({left: "-=" + moveTo + "px"}, 300);
        } else if (target_position <= current_position) {
            moveTo = (current_position - target_position) * w;
            $(this).animate({left: "+=" + moveTo + "px"}, 300);
        }
    });
}

function reset() {
    $('.face').each(function (index) {
        clix[index] = 0;
        $(this).animate({left: "0"}, 200);
    });
}

