$(document).ready(function () {
    function getRandom(num) {
        return Math.floor(Math.random() * num);
    }

    var hideCode = function () {
        var numRandom = getRandom(5);
        $('.guess_box').each(function (index) {
            if (numRandom == index) {
                $(this).append('<span id="has_discount"></span>');
                return false;
            }
        });
    };
    hideCode();

    $('.guess_box').click(checkForCode);

    function checkForCode() {
        var discount_msg;
        if ($.contains(this, document.getElementById('has_discount'))) {
            var my_num = getRandom(100);
            discount_msg = '<p>Your Code: CODE' + my_num + '</p>';
            $(this).addClass('discount');
        } else {
            discount_msg = '<p> You have no CODE</p>';
            $(this).addClass('non_discount');
        }

        $('.guess_box').each(function () {
            $(this).unbind('click');
        });
        $('#result').append(discount_msg);
    }

});