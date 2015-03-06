$(document).ready(function () {
    var $fishElements;
    var $meatElements;
    //ensure that the button only work when first click.
    var flag = true;
    $('#vegOn').click(function () {
        if (flag) {
            $fishElements = $('.fish').parent().parent().detach();
            $('.hamburger').replaceWith('<li class="protobello"><em>Protobello Mushroom</em></li>');
            var meat = $('.meat');
            meat.after('<li class="tofu">Tofu</li>');
            $('.tofu').parent().parent().addClass('veg_leaf');
            $meatElements = meat.detach();
            flag = false;
        }

    });

    $('#restoreMe').click(function () {
        if (!flag) {
            $('.menu_entrees li').first().before($fishElements);
            $('.protobello').replaceWith('<li class="hamburger">Hamburger</li>');
            var tofu = $('.tofu');
            tofu.each(function (index) {
                $(this).before($meatElements[index]);
            });
            tofu.parent().parent().removeClass('veg_leaf');
            tofu.remove();

            flag = true;
        }
    });
});