package last;

//\u2660: 스페이드, \u2665: 하트, \u2666: 다이아, \u2663: 클로버
public enum Suit {
    SPADE("\u2660"),
    HEART("\u2665"),
    DIAMOND("\u2666"),
    CLUB("\u2663");

    private String icon;
    Suit(String icon) {
        this.icon = icon;
    }
    public String getIcon() {
        return icon;
    }
}
