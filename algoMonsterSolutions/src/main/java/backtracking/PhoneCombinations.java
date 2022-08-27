package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PhoneCombinations {

    public static List<String> findCombinations(HashMap<Character, char[]> input, String digit) {
        List<String> output = new ArrayList<>();

        countCombinations(input, output, digit.toCharArray(), new StringBuilder());
        Queue<StringBuilder> queue = new LinkedList<>();

        return output;
    }

    private static void countCombinations(HashMap<Character, char[]> input, List<String> output, char[] digit, StringBuilder str) {

        if(str.length() == digit.length){
            output.add(str.toString());
            return;
        }

        char next_char = digit[str.length()];

        for (char entry: input.get(next_char)) {
            str.append(entry);
            countCombinations(input, output, digit, str);
            str.deleteCharAt(str.length()-1);
        }
    }


}
