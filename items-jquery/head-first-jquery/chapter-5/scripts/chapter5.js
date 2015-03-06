$(document).ready(function () {
    var headClick, eyesClick, noseClick, mouthClick;
    lightningOne(4000);
    lightningTwo(5000);
    lightningThree(7000);
    $('#head').click(function () {
        if (headClick < 9) {
            headClick += 1;
            $(this).animate({left: '-=367px'}, 500);
        } else {
            headClick = 0;
            $(this).animate({left: '0px'}, 500);
        }
    });
    $('#eyes').click(function () {
        if (eyesClick < 9) {
            $(this).animate({left: '-=367px'}, 500);
            eyesClick += 1;
        } else {
            $(this).animate({left: '0px'}, 500);
            eyesClick = 0;
        }
    });
    $('#nose').click(function () {
        if (noseClick < 9) {
            $(this).animate({left: '-=367px'}, 500);
            noseClick += 1;
        } else {
            $(this).animate({left: '0px'}, 500);
            noseClick = 0;
        }
    });
    $('#mouth').click(function () {
        if (mouthClick < 9) {
            $(this).animate({left: '-=367px'}, 500);
            mouthClick += 1;
        } else {
            $(this).animate({left: '0px'}, 500);
            mouthClick = 0;
        }
    });
});

function lightningOne(t) {
    $('#container').find('#lightning1').fadeIn(250).fadeOut(250);
    setTimeout('lightningOne(' + t + ')', t);
}
function lightningTwo(t) {
    $('#container').find('#lightning2').fadeIn('fast').fadeOut('fast');
    setTimeout('lightningTwo(' + t + ')', t);
}
function lightningThree(t) {
    $('#container').find('#lightning3').fadeIn('fast').fadeOut('fast');
    setTimeout('lightningThree(' + t + ')', t);
}