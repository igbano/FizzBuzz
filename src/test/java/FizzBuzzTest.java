import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
class FizzBuzzTest {

    @Test
    void shouldReturnFizz() {

        int number = 3;
        String code = new FizzBuzz().convert(number);

        assertThat(code, is("Fizz"));

    }

    @Test
    void shouldReturnBuzz() {

        int number = 5;
        String code = new FizzBuzz().convert(number);

        assertThat(code, is("Buzz"));

    }

    @Test
    void shouldReturnFizzBuzz() {

        int number = 15;
        String code = new FizzBuzz().convert(number);

        assertThat(code, is("FizzBuzz"));

    }

    @Test
    void shouldReturnTheSameNumber() {

        int number = 7;
        String code = new FizzBuzz().convert(number);

        assertThat(code, is("7"));

    }


}