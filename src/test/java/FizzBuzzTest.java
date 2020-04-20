import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        String expectedAnswer = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz ";
        String answer = SimpleFizzBuzz.getSolutionForNumber(20);

        assert(answer.equals(expectedAnswer));

    }
}
