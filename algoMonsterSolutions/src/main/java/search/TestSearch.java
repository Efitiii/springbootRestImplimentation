package search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSearch {

    @Test
    public void testBinarySearch() {
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(2,3,4,5,6,8,9));
        int actual = Search.binarySearch(input, 3);
        List<String> output = new ArrayList<String>(Arrays.asList("1","2","3"));
        List<String> output2 = new ArrayList<String>();
        output2.add(String.join("=>", output));
        for(String str: output2) {

            System.out.println("String output " + str);
        }
        assertEquals(1, actual);
    }
}
