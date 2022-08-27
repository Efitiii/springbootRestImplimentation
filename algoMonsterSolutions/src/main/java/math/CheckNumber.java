package math;

public class CheckNumber {

    public static boolean checkIfPrime(int num) {
        int start = 2;
        int end = num - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (num%mid == 0) {
                return false;
            } else if (mid*mid > num) {
                end = mid -1;
            } else start = mid + 1;
        }

        return true;
    }

    public static boolean checkIfOdd(int i) {

        if (i % 2 == 0) return false;

        return true;
    }

}
