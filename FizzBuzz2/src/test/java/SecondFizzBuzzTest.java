import org.junit.Test;

public class SecondFizzBuzzTest {
    @Test
    public void testFizzBuzzBadRange() {
        String expectedAnswer = "Starting index cannot be larger than ending index";
        String answer = SecondFizzBuzz.getSolutionForNumber(20, 10);

        assert(answer.equals(expectedAnswer));
    }

    @Test
    public void testFizzBuzzNegativeNumbers() {
        String expectedAnswer = "buzz fizz -8 -7 fizz buzz -4 lucky -2 -1 fizzbuzz 1 2 lucky 4 buzz fizz 7 8 fizz buzz ";
        String answer = SecondFizzBuzz.getSolutionForNumber(-10, 10);

        assert(answer.equals(expectedAnswer));
    }

    @Test
    public void testFizzBuzz0Range() {
        String expectedAnswer = "1 ";
        String answer = SecondFizzBuzz.getSolutionForNumber(1, 1);

        assert(answer.equals(expectedAnswer));
    }

    @Test
    public void testFizzBuzz20() {
        String expectedAnswer = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz ";
        String answer = SecondFizzBuzz.getSolutionForNumber(1, 20);

        assert(answer.equals(expectedAnswer));

    }
}
