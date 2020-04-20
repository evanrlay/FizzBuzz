import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzzBadRange() {
        String expectedAnswer = "Starting index cannot be larger than ending index";
        String answer = SimpleFizzBuzz.getSolutionForNumber(20, 10);

        assert(answer.equals(expectedAnswer));
    }

    @Test
    public void testFizzBuzzNegativeNumbers() {
        String expectedAnswer = "buzz fizz -8 -7 fizz buzz -4 fizz -2 -1 fizzbuzz 1 2 fizz 4 buzz fizz 7 8 fizz buzz ";
        String answer = SimpleFizzBuzz.getSolutionForNumber(-10, 10);

        assert(answer.equals(expectedAnswer));
    }

    @Test
    public void testFizzBuzz0Range() {
        String expectedAnswer = "1 ";
        String answer = SimpleFizzBuzz.getSolutionForNumber(1, 1);

        assert(answer.equals(expectedAnswer));
    }

    @Test
    public void testFizzBuzz20() {
        String expectedAnswer = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz ";
        String answer = SimpleFizzBuzz.getSolutionForNumber(1, 20);

        assert(answer.equals(expectedAnswer));
    }
}
