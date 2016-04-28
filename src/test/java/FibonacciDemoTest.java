import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciDemoTest {
    @Test
    public void testFib() throws Exception {
        assertEquals(0, fib(0));
        assertEquals(1, fib(1));
    }

    private int fib(int number) {
        if (number == 0) {
            return 0;
        }
        return 1;
    }
}