/**
 * Created by andy on 3/4/2015.
 */
$(function () {
    $("a").click(function () {
        var src = $(this).attr("href");
        var alt = $(this).attr("title");
        console.info(src + ", " + alt);
        $("#preview").attr({
            "src": src,
            "alt": alt
        });
        return false;
    });

    /*    $('#uploadFile').change(function() {

     var src =  $(this).val();
     $('#uploadFilePreview').attr("src", 'imgs/img-2-chenhong.jpg');
     });*/
    var imgDiv = $('#previewImgDiv');
    imgDiv.hide();
    $('img').mousemove(function (e) {
        imgDiv.css({
            top: e.pageY,
            left: e.pageX
        }).html('<img src="' + this.src + '"/>').show();
    }).mouseout(function () {
        imgDiv.hide();
    });
});