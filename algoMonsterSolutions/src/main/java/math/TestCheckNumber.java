package math;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCheckNumber {

    @Test
    public void testIsPrime() {
        boolean actual = CheckNumber.checkIfPrime(13);
        assertTrue(actual);

    }

    @Test
    public void testIfOdd() {
        assertTrue(CheckNumber.checkIfOdd(1));
    }
}
