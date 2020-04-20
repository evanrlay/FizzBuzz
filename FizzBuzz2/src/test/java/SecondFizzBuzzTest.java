import org.junit.Test;

public class SecondFizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        String expectedAnswer = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz ";
        String answer = SecondFizzBuzz.getSolutionForNumber(20);

        assert(answer.equals(expectedAnswer));

    }
}
