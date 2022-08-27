package objectorienteddesign.playingCards;

import java.util.Map;
import java.util.stream.Collectors;

public class JokerCard extends Card {

    SuitJoker suit;
    Integer value;

    public static final Map<String, SuitJoker> SUIT= Map.of(
            "Red",SuitJoker.RED,
            "Black",SuitJoker.BLACK
    );

    private static final Map<SuitJoker, String> SUIT_NAME = SUIT.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue,Map.Entry::getKey));

    public JokerCard(String color, Integer value){
        this.suit = SUIT.get(color);
        this.value = value;
    }

    @Override
    public int getValue() {
        return 14;
    }

    @Override
    public String toStringValueSuit() {
        return String.format("%s Joker", suit.getSuitName());
    }

    @Override
    public String toString() {
        return String.format("%s Joker",SUIT_NAME.get(suit));
    }
}
