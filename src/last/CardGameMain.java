package last;

//\u2660: 스페이드, \u2665: 하트, \u2666: 다이아, \u2663: 클로버
public class CardGameMain {
    public static void main(String[] args) {
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        Deck deck = new Deck();
        for (int i = 0; i < 5; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }
        int r1 = player1.showHand();
        int r2 = player2.showHand();

        if (r1 != r2) System.out.println((r1 > r2 ? player1:player2) + " 승리");
        else System.out.println("무승부");
    }
}
