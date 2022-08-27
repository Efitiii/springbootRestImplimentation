package backtracking;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPhoneCombinations {

    @Test
    public void testPhoneCombinations() {

        HashMap<Character, char[]> phoneCombinations = new HashMap<>();
        phoneCombinations.put('2', "abc".toCharArray());
        phoneCombinations.put('3', "def".toCharArray());
        phoneCombinations.put('4', "ghi".toCharArray());

        String digits = new String("234");

        assertEquals(27, PhoneCombinations.findCombinations(phoneCombinations, digits).size());
    }

}
