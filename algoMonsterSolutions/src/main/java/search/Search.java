package search;

import java.util.List;

public class Search {

    public static int binarySearch(List<Integer> arr, int target) {

        int start = 0;
        int end = arr.size() - 1;

        while (start <= end) {
            int mid = (start+end)/2;

            if (arr.get(mid) == target) {
                return mid;
            } else if (arr.get(mid) > target) {
                end = mid - 1;
            } else if (arr.get(mid) < target) {
                start = mid + 1;
            }
        }

        return -1;
    }
}