package backtracking.memoization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author XEfrem on 8/22/22.
 * @project BackTracking Problems
 */
public class TestWordBreak {

    @Test
    public void testWordBreak() {
        WordBreak findConcatenatedWords = new WordBreak();
        assertTrue(findConcatenatedWords
                .wordBreak("algomonster",new String[]{"algo", "monster"}));
    }

    @Test
    public void testWordBreakUsingMemoization() {
        WordBreak findConcatenatedWords = new WordBreak();
        assertTrue(findConcatenatedWords
                .wordBreakUsingMemoization("algomonster",new String[]{"algo", "monster"}));
    }
}
