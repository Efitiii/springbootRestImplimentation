package objectorienteddesign.playingCards;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static objectorienteddesign.playingCards.PlayingCard.SUITS;

public class Game {
    ArrayList<Card> cards;
    static ArrayList<Hand> hands;

    public Game() {
        cards = new ArrayList<>();
        hands = new ArrayList<>();
    }
    public int add_card(String suit, String value){
        cards.add(new PlayingCard(SUITS.get(suit),value));
        return cards.size()-1;
    }

    public String card_string(int i) {
        return cards.get(i).toString();
    }

    public boolean card_beats(int i, int i1) {
       return cards.get(i).compareTo(cards.get(i1)) > 0;
    }

    public int add_joker(String color) {
        cards.add(new JokerCard(color, 1));
        return cards.size()-1;
    }

    public int add_hand(List<Integer> cardIndices) {
        List<Card> cardObjects = new ArrayList<>();
        for (int i: cardIndices) {
            cardObjects.add(cards.get(i));
        }
        Hand hand = new Hand();
        hand.setCardIndices(cardObjects);
        this.hands.add(hand);
        return this.hands.size()-1;
    }

    public Result beats_hand(Hand hand1, Hand hand2) {
        List<Card> sortHand1 = sortCards(hand1);
        List<Card> sortHand2 = sortCards(hand2);
        int i = sortHand1.size()-1;
        int k = sortHand2.size()-1;

        while(i>=0 && k>=0 && sortHand1.get(i).compareTo(sortHand2.get(k)) == 0) {
            i--;
            k--;
        }

        if (i<0 || k<0) return Result.TIE;

        return sortHand1.get(i).compareTo(sortHand2.get(k)) > 0 ? Result.WIN : Result.LOSS;
    }

    private List<Card> sortCards(Hand hand) {
        List<Card> cardsInHand = hand.cardIndices;
        cardsInHand.sort(new SortByValue());
        return cardsInHand;
    }

    class SortByValue implements Comparator<Card> {

        @Override
        public int compare(Card o1, Card o2) {
            return o1.compareTo(o2);
        }
    }

    public static ArrayList<Hand> getHands() {
        return hands;
    }
}
