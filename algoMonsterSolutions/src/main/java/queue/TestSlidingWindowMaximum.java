package queue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static queue.SlidingWindowMaximum.slidingWindowMaximum;

public class TestSlidingWindowMaximum {

    @Test
    public void testslidingWindowMaximum () {
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(1,3,2,5,8,7));
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(3,5,8,8));
        List<Integer> actual = slidingWindowMaximum(input, 3);
        assertEquals(actual, expected);

    }
}
