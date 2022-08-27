package backtracking;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPermutation {

    @Test
    public void testFindPermutation() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("hey", "hallo");
        assertEquals(Permutation.findNumberOfPermutation("abc"),6);
    }

}
