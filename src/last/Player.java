package last;

import java.util.TreeSet;

public class Player {
    private String name;
    private TreeSet<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new TreeSet<>();
    }

    public void draw(Deck deck) {
        hand.add(deck.drawCard());
    }

    private int sumNum(){
        int sum = 0;
        for (Card card : hand) {
            sum += card.getNumber();
        }
        return sum;
    }

    public int showHand(){
        int sum = sumNum();
        System.out.println(name+"의 카드: "+ hand +", 합계: "+sum);
        return sum;
    }

    @Override
    public String toString() {
        return name;
    }
}
