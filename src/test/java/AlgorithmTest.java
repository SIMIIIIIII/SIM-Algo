import algorithms.Factorial;
import algorithms.Fibonacci;
import org.javagrader.Grade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Grade
public class AlgorithmTest {
    @Test
    @Grade(value = 1)
    public void testFactorial(){
        assertEquals(6, Factorial.calculate(3));
    }

    @Test
    @Grade(value = 1)
    public void testFibonacci(){
        assertEquals(55, Fibonacci.calculate(10));
    }
}