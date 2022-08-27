package objectorienteddesign.playingCards;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hand {

    List<Card> cardIndices;

    public Hand () {
        cardIndices = new ArrayList<>();
    }


    @Override
    public String toString() {
        return cardIndices.stream().map(String::valueOf).collect(Collectors.joining(", "));
    }

    public void setCardIndices(List<Card> cardIndices) {
        this.cardIndices = cardIndices;
    }
}
