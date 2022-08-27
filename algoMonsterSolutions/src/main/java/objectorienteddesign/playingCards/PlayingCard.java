package objectorienteddesign.playingCards;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayingCard extends Card {
    Suit suit;
    Integer value;

    public static final Map<String,Integer> VALUES = new HashMap<String, Integer>();

    public static final Map<String, Suit> SUITS = Map.of(
            "Spades", Suit.SPADES,
            "Hearts", Suit.HEARTS,
            "Diamonds", Suit.DIAMONDS,
            "Clubs", Suit.CLUBS
    );

    static {
        VALUES.put("A",1);
        VALUES.put("J", 11);
        for (int i=2; i<=10; i++) {
            VALUES.put(String.valueOf(i), i);
        }
    }

    public static final Map<Integer, String> VALUE_NAMES = VALUES.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));

    public static final Map<Suit, String> SUIT_NAMES = SUITS.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue,Map.Entry::getKey));

    public PlayingCard(Suit suit, String value) {
        this.suit = suit;
        this.value = VALUES.get(value);
    }


    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", VALUE_NAMES.get(this.value), SUIT_NAMES.get(this.suit));
    }

    @Override
    public String toStringValueSuit() {
        return String.format("%s of %s", VALUE_NAMES.get(this.value), SUIT_NAMES.get(this.suit));
    }
}
