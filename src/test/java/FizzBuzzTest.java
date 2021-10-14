import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Triple A (AAA)
 *
 * Arrange
 * Act
 * Assert
 *
 */

class FizzBuzzTest {

    @Test
    void whenANumberThatIsNotMultipleOfThreeOrFiveIsEnteredShouldReturnTheSameNumber() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 7;

        String result = fizzBuzz.calc(number);

        assertThat(result, is("7"));
    }

    @Test
    void whenANumberThatIsMultipleOfThreeIsEnteredShouldReturnFizz(){

        FizzBuzz fizzBuzz = new FizzBuzz();

        int number = 3;
        String result = fizzBuzz.calc(number);

        assertThat(result, is("Fizz"));
    }

    @Test
    void whenANumberThatIsMultipleOfFiveIsEnteredShouldReturnBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        int number = 5;
        String result = fizzBuzz.calc(number);

        assertThat(result, is("Buzz"));
    }
    @Test
    void whenANumberThatIsMultipleOfFiveAndThreeIsEnteredShouldReturnFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        int number = 15;
        String result = fizzBuzz.calc(number);

        assertThat(result, is("FizzBuzz"));
    }


}