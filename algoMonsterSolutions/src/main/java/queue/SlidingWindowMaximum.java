package queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMaximum {
    public static List<Integer> slidingWindowMaximum (List<Integer> input, int k) {
        List<Integer> output = new ArrayList<>();
        ArrayDeque<Integer> deque = new ArrayDeque<>(k);

        for (int i=0; i<input.size();i++) {
            while (!deque.isEmpty() && input.get(deque.getLast())<input.get(i)){
                deque.removeLast();
            }
            deque.addLast(i);

            if (deque.getFirst() == i-k) {
                deque.removeFirst();
            }

            if (i>=k-1) {
                output.add(input.get(deque.getFirst()));
            }
        }

        return output;
    }
}
