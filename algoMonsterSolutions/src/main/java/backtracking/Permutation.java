package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Permutation {
    public static int findNumberOfPermutation(String abc) {
        char[] letters = abc.toCharArray();
        boolean[] used = new boolean[letters.length];
        List<String> result = new ArrayList<>();
        dfs (new ArrayList<>(), used, result, letters);
        return result.size();
    }

    private static void dfs(ArrayList<Character> path, boolean[] used, List<String> result, char[] letters) {
        if (used.length == path.size()) {
            result.add(path.stream().map(e->e.toString()).collect(Collectors.joining()));
        }

        for (int i=0; i<letters.length; i++) {
            if (used[i])
                continue;
            path.add(letters[i]);
            used[i] = true;

            dfs(path, used, result, letters);

            path.remove(path.size()-1);
            used[i] = false;
        }
    }


}
