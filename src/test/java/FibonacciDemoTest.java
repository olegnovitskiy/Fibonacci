import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciDemoTest {
    @Test
    public void testFib() throws Exception {
        int cases[][] = {{0, 0}, {1,1}, {2, 1}, {3, 2}};
        for (int[] aCase : cases) {
            assertEquals(aCase[1], fib(aCase[0]));
        }
    }

    private int fib(int number) {
        if (number == 0) {
            return 0;
        }
        if (number <= 2) {
            return 1;
        }
        return fib(number - 1) + fib(number - 2);
    }
}