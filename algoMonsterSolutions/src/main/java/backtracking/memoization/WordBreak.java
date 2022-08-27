package backtracking.memoization;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author XEfrem on 8/22/22.
 * @project BackTracking Problems
 */
public class WordBreak {

    public boolean wordBreak(String target, String[] input) {
        StringBuilder str = new StringBuilder();
        return dfs(target, input, 0);
    }

    private boolean dfs(String target, String[] input, int currentIndex) {

        if(currentIndex == target.length()) return true;

        for(String in: input) {
            if (target.substring(currentIndex).startsWith(in)) {
                if (dfs(target, input, currentIndex + in.length())) return  true;
            }
        }
        return false;
    }

    public boolean wordBreakUsingMemoization(String target, String[] input) {
        return dfsUsingMemoization(target, input, 0, new Boolean[target.length()]);
    }

    private boolean dfsUsingMemoization(String target, String[] input, int i, Boolean[] memo) {
        if(i == target.length()) return true;
        if(memo[i] != null) return memo[i];
        boolean ok = false;

        for (String word: input) {
            if(target.substring(i).startsWith(word)) {
                ok = ok || dfsUsingMemoization(target, input, i + word.length(), memo);
            }
        }

        return ok;
    }
}
