package backtracking.decodeWays;

import java.util.Map;

/**
 * @author XEfrem on 8/24/22.
 * @project Memoization Problem
 */
public class DecodeWays {

    private static final Map<Integer,Character> NUMBER_TO_CHARACTER_MAP;

    static {
        NUMBER_TO_CHARACTER_MAP =
            Map.of(1, 'A', 2, 'B', 3, 'C',
            4, 'D', 5, 'E', 6, 'F',
            7, 'G', 8, 'H', 9, 'I',
            10, 'J');
        NUMBER_TO_CHARACTER_MAP.put(11,'K');
        NUMBER_TO_CHARACTER_MAP.put(12,'L');
        NUMBER_TO_CHARACTER_MAP.put(13,'M');
        NUMBER_TO_CHARACTER_MAP.put(14,'N');
        NUMBER_TO_CHARACTER_MAP.put(15,'O');
        NUMBER_TO_CHARACTER_MAP.put(16,'P');
        NUMBER_TO_CHARACTER_MAP.put(17,'Q');
        NUMBER_TO_CHARACTER_MAP.put(18,'R');
        NUMBER_TO_CHARACTER_MAP.put(19,'S');
        NUMBER_TO_CHARACTER_MAP.put(20,'T');
        NUMBER_TO_CHARACTER_MAP.put(21,'U');
        NUMBER_TO_CHARACTER_MAP.put(22,'V');
        NUMBER_TO_CHARACTER_MAP.put(23,'W');
        NUMBER_TO_CHARACTER_MAP.put(24,'X');
        NUMBER_TO_CHARACTER_MAP.put(25,'Y');
        NUMBER_TO_CHARACTER_MAP.put(26,'Z');
    }

    public int decodeWays(String input) {
        return dfs(input, 0, 0);
    }

    private int dfs(String input, int start, int count) {
        if (NUMBER_TO_CHARACTER_MAP.containsKey(input)) {
            count++;
        }

        for (int i = 0; i < input.length() ; i++) {
            if (NUMBER_TO_CHARACTER_MAP.containsKey(input.substring(0,i))) {
//                dfs(input, i, , count);
            }
        }

        return count;
    }
}
