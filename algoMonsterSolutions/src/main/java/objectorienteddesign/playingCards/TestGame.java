package objectorienteddesign.playingCards;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestGame {

    @Test
    public void testAddCard() {
        Game game = new Game();
        assertEquals(0, game.add_card("Hearts","A"));
        String actual = game.card_string(0);
        System.out.println(actual);
        assertTrue("A of Hearts".equals(game.card_string(0)));
    }

    @Test
    public void testCardBeats() {
        Game game = new Game();
        game.add_card("Hearts", "A");
        game.add_card("Diamonds", "J");

        System.out.println(game.card_beats(0,1));
        assertFalse(game.card_beats(0,1));

    }

    @Test
    public void testAddJoker() {
        Game game = new Game();
        String color = "red";
        assertEquals(0, game.add_joker(color));
    }

    @Test
    public void testJokerCardBeats() {
        Game game = new Game();
        game.add_card("Hearts", "A");
        game.add_joker("red");
        assertFalse(game.card_beats(0,1));
    }

    @Test
    public void testJokerCardShouldNotBeatJoker() {
        Game game = new Game();
        game.add_joker("Black");
        game.add_joker("Red");
        assertFalse(game.card_beats(0,1));
    }

    @Test
    public void testJokerString() {
        Game game = new Game();
        game.add_card("Hearts", "A");
        game.add_joker("Red");

        assertTrue("Red Joker".equals(game.card_string(1)));
    }

    @Test
    public void testAddHand() {
        Game game = new Game();
        game.add_card("Hearts", "A");
        List<Integer> cardList = new ArrayList<Integer>(Arrays.asList(0));

        assertEquals(0,game.add_hand(cardList));
    }

    @Test
    public void testHandString() {
        Game game = new Game();
        game.add_card("Clubs", "9");
        game.add_card("Hearts", "J");
        game.add_joker("Black");
        List<Integer> cardList = new ArrayList<Integer>(Arrays.asList(0,1,2));
        game.add_hand(cardList);


        String expected = "9 of Clubs, J of Hearts, Black Joker";
        String actual = Game.hands.get(0).toString();
        System.out.println(actual);

        assertTrue(expected.equals(actual));
    }

    @Test
    public void testBeatsHand() {
        Game game = new Game();

        game.add_card("Clubs", "9");
        game.add_card("Hearts", "2");
        game.add_joker("Black");

        List<Integer> cardList = new ArrayList<Integer>(Arrays.asList(0,2));
        List<Integer> cardList2 = new ArrayList<Integer>(Arrays.asList(1));

        game.add_hand(cardList);
        game.add_hand(cardList2);


        assertEquals(Result.WIN, game.beats_hand(game.getHands().get(0), game.getHands().get(1)));
    }

    @Test
    public void testNotBeatsHandWhenCardRunsOut() {
        Game game = new Game();
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();

        game.add_card("Clubs", "9");
        game.add_card("Hearts", "2");
        game.add_joker("Black");

        List<Integer> cardList = new ArrayList<Integer>(Arrays.asList(0,2));
        List<Integer> cardList2 = new ArrayList<Integer>(Arrays.asList(2));

        game.add_hand(cardList);
        game.add_hand(cardList2);

        assertEquals(Result.TIE, game.beats_hand(hand1, hand2));
    }

}
