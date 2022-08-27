package backtracking.decodeWays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author XEfrem on 8/24/22.
 * @project Memoization Problem
 */
public class TestDecodeWays {

    @Test
    public void testDecodeWays(String digits) {
        /*We have a message to decode ->
        * Letters are encoded to digits by their position in the alphabets.
        * A -> 1
        * B -> 2
        * C -> 3
        * ...
        * Given a non empty string "18" how many ways are able to decode it
        * 18 -> "AH" or "R"
        * 123 -> "ABC" or "LC", "AW"*/
        DecodeWays decode = new DecodeWays();
        assertEquals(3, decode.decodeWays("123"));
    }
}
