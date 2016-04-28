import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by NIO on 28.04.2016. All rights reserved.
 */
public class FibonacciDemoTest extends TestCase {
    @Test
    public void testFib() throws Exception {
        assertEquals(0, fib(0));
    }

    private int fib(int i) {
        return 0;
    }
}