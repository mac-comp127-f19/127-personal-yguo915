package basicjava.test;

import basicjava.OddEven;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestOddEven {
    @Test
    public void testOddEven() {
        assertTrue(OddEven.isOdd(3));
    }

}
