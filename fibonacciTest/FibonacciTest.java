package org.PAB2020.fibonacciTest;


import org.PAB2020.fibonacci.Fibonacci;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest extends Fibonacci {

    private Fibonacci f;

    @BeforeEach
    public void setup() {
        f = new Fibonacci();
    }

    @Test
   public void mesIncorrectoError(){
        assertThrows(RuntimeException.class, () -> f.compute(0, 3));
    }

    @Test
    public void pruebaMes1(){
        int expectedValue = 1;
        long obtainedValue = f.compute(1,3);
        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void pruebaMes5(){
        int expectedValue = 19;
        long obtainedValue = f.compute(5,3);
        assertEquals(expectedValue, obtainedValue);
    }

}
