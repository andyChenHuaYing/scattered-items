var deck;
$(document).ready(function () {
    deck = [
        new card('Ace', 'Hearts', 11),
        new card('Two', 'Hearts', 2),
        new card('Three', 'Hearts', 3),
        new card('Four', 'Hearts', 4),
        new card('Five', 'Hearts', 5),
        new card('Six', 'Hearts', 6),
        new card('Seven', 'Hearts', 7),
        new card('Eight', 'Hearts', 8),
        new card('Nine', 'Hearts', 9),
        new card('Ten', 'Hearts', 10),
        new card('Jack', 'Hearts', 10),
        new card('Queen', 'Hearts', 10),
        new card('King', 'Hearts', 10),
        new card('Ace', 'Diamonds', 11),
        new card('Two', 'Diamonds', 2),
        new card('Three', 'Diamonds', 3),
        new card('Four', 'Diamonds', 4),
        new card('Five', 'Diamonds', 5),
        new card('Six', 'Diamonds', 6),
        new card('Seven', 'Diamonds', 7),
        new card('Eight', 'Diamonds', 8),
        new card('Nine', 'Diamonds', 9),
        new card('Ten', 'Diamonds', 10),
        new card('Jack', 'Diamonds', 10),
        new card('Queen', 'Diamonds', 10),
        new card('King', 'Diamonds', 10),
        new card('Ace', 'Clubs', 11),
        new card('Two', 'Clubs', 2),
        new card('Three', 'Clubs', 3),
        new card('Four', 'Clubs', 4),
        new card('Five', 'Clubs', 5),
        new card('Six', 'Clubs', 6),
        new card('Seven', 'Clubs', 7),
        new card('Eight', 'Clubs', 8),
        new card('Nine', 'Clubs', 9),
        new card('Ten', 'Clubs', 10),
        new card('Jack', 'Clubs', 10),
        new card('Queen', 'Clubs', 10),
        new card('King', 'Clubs', 10),
        new card('Ace', 'Spades', 11),
        new card('Two', 'Spades', 2),
        new card('Three', 'Spades', 3),
        new card('Four', 'Spades', 4),
        new card('Five', 'Spades', 5),
        new card('Six', 'Spades', 6),
        new card('Seven', 'Spades', 7),
        new card('Eight', 'Spades', 8),
        new card('Nine', 'Spades', 9),
        new card('Ten', 'Spades', 10),
        new card('Jack', 'Spades', 10),
        new card('Queen', 'Spades', 10),
        new card('King', 'Spades', 10)
    ];

});
function card(name, suit, value) {
    this.name = name;
    this.suit = suit;
    this.value = value;
}

var used_card = [];
function deal() {
    for (var i = 0; i < 2; i++) {
        hit();
    }
}

function getRandom(num) {
    return Math.floor(Math.random() * num);
}

function hit() {
    var good_card = false;
    do {
        good_card = true;
        var index = getRandom(52);
        var c = deck[index];
        used_card[used_card.length] = index;
        //hand.cards[hand.cards.length] = c;
        var $d = $('<div>');
        $d.addClass('current_hand').appendTo('#my_hand');
        $('<img>').appendTo($d).attr('src', 'images/cards/' + c.suit + '/' + c.name + '.jpg')
            .fadeOut('slow').fadeIn('slow');
    } while (!good_card);
}

$('#btnDeal').click(function () {
    deal();
    $(this).toggle();
});