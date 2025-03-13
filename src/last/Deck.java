package last;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//\u2660: 스페이드, \u2665: 하트, \u2666: 다이아, \u2663: 클로버
public class Deck {
    List<Card> deck = new ArrayList<>();

    public Deck() {
        initCard();
        shuffle();
    }

    private void initCard() {
        for (int i = 1; i <= 13; i++) {
            deck.add(new Card(i, Suit.SPADE));
            deck.add(new Card(i, Suit.HEART));
            deck.add(new Card(i, Suit.DIAMOND));
            deck.add(new Card(i, Suit.CLUB));
        }
    }

    private void shuffle() {
        Collections.shuffle(deck);}

    public Card drawCard(){
        return deck.removeFirst();
    }

}
