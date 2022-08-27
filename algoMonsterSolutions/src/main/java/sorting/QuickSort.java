package sorting;

import java.util.List;

public class QuickSort {

    public static void quickSort(List<Integer> unsorted) {
        int leftPtr = 0;
        int rightPtr = unsorted.size();

        sortByPivot(leftPtr, rightPtr, unsorted);
    }
    private static void sortByPivot(int start, int end, List<Integer> unsorted) {

        if (start>=end)
            return;

        int leftPtr = start;
        int rightPtr = end-1;

        int pivot = unsorted.get(end-1);

        while (leftPtr < rightPtr) {
            while (unsorted.get(leftPtr) < pivot && leftPtr < rightPtr) leftPtr++; //
            while (unsorted.get(rightPtr) >= pivot && leftPtr < rightPtr) rightPtr--;

            if (leftPtr == rightPtr)
                break;

            int temp = unsorted.get(leftPtr);
            unsorted.set(leftPtr, unsorted.get(rightPtr));
            unsorted.set(rightPtr, temp);

        }

        int temp = unsorted.get(leftPtr);
        unsorted.set(leftPtr, unsorted.get(end-1));
        unsorted.set(end-1, temp);


        sortByPivot(start, leftPtr, unsorted);
        sortByPivot(leftPtr+1,end, unsorted);

    }
}
