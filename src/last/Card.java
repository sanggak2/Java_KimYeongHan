package last;

import java.util.Map;

//\u2660: 스페이드, \u2665: 하트, \u2666: 다이아, \u2663: 클로버
public class Card implements Comparable<Card> {
    private int number;
    private Suit suit;
    /*private String emblem;
    private Map<String, Integer> tier =
            Map.of("\u2660",0,"\u2665",1,
                    "\u2666",2,"\u2663",3);*/

    public Card(int number, Suit suit) {
        this.number = number;
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Card o) {
        if (this.number == o.number)
            return suit.compareTo(o.suit);
        return Integer.compare(this.number, o.number);
    }

    @Override
    public String toString() {
        return number + "(" + suit.getIcon() + ")";
    }
}
