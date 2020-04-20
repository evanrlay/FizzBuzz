import org.junit.Test;

public class ThirdFizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        String expectedAnswer = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz ";
        String answer = ThirdFizzBuzz.getSolutionForNumber(20);

        assert(answer.contains(expectedAnswer));
        assert(answer.contains("fizz: 4"));
        assert(answer.contains("buzz: 3"));
        assert(answer.contains("fizzbuzz: 1"));
        assert(answer.contains("lucky: 2"));
        assert(answer.contains("integer: 10"));
    }
}
