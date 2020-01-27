package basicjava.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHypotenuse {
    @Test
    public void testHypotenuse() {
        assertEquals(5.0, basicjava.Hypotenuse.calculateHypotenuse(3.0, 4.0), 0.001);
    }

}
