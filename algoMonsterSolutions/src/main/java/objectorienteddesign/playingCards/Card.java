package objectorienteddesign.playingCards;

public abstract class Card implements Comparable<Card> {

    public abstract  int getValue();

    public abstract String toStringValueSuit();

    @Override
    public int compareTo(Card o){
        return Integer.compare(getValue(), o.getValue());
    }

}
