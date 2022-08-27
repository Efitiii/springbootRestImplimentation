package objectorienteddesign.playingCards;

enum Suit {
    HEARTS ("hearts"),
    SPADES ("spades"),
    CLUBS ("clubs"),
    DIAMONDS("diamonds");

    private String suitName;

    Suit(String suitName) {
        this.suitName = suitName;
    }

}

enum SuitJoker {
    RED("Red"),
    BLACK("Black");

    private String suitName;

    SuitJoker(String suitName) {this.suitName = suitName;}

    public String getSuitName() {return suitName;}
}

enum Result {
    LOSS, WIN, TIE;
}
