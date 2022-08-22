import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    void name() {
        Assertions.assertEquals(2,(1.5+0.5));
    }

    @Test
    void factorialIs6WhenNisEqualto3() {
        Factorial factorial=new Factorial(3);
        Assertions.assertEquals(6,factorial.calculateFactorial());
    }

    @Test
    void factorialIs1WhenNisEqualto1() {
        Factorial factorial= new Factorial(1);
        Assertions.assertEquals(1,factorial.calculateFactorial());
    }

    @Test
    void factorialIs40320WhenNisEqualto8() {
        Factorial factorial=new Factorial(8);
        Assertions.assertEquals(40320,factorial.calculateFactorial());
    }
}
