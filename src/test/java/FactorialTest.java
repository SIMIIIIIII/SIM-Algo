import algorithms.Factorial;
import org.javagrader.Grade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Grade
public class FactorialTest {
    @Test
    @Grade(value = 1)
    public void testFactorial(){
        assertEquals(6, Factorial.calculate(3));
    }
}
