package sorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static sorting.QuickSort.quickSort;

public class TestQuickSort {

    @Test
    public void quickSortTester(){
        List<Integer> unsorted = new ArrayList<>(Arrays.asList(1,0,5,7,4,3));
        quickSort(unsorted);
        List<Integer> expected = new ArrayList<>(Arrays.asList(0,1,3,4,5,7));
        assertEquals(unsorted, expected);
    }
}
