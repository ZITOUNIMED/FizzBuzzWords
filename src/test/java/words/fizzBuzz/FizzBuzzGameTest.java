package words.fizzBuzz;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzGameTest {

    @Test
    public void should_return_fizz_when_number_equal_3(){
        String returnedValue = FizzBuzzGame.print(3);
        assertEquals("...Fizz...", returnedValue);
    }

    @Test
    public void should_return_fizz_when_number_multiples_3(){
        assertEquals("...Fizz...", FizzBuzzGame.print(6));
        assertEquals("...Fizz...", FizzBuzzGame.print(9));
        assertEquals("...Fizz...", FizzBuzzGame.print(21));
        assertEquals("...Fizz...", FizzBuzzGame.print(60));
    }

    @Test
    public void should_return_fizz_when_number_containes_3(){
        assertEquals("...Fizz...", FizzBuzzGame.print(23));
        assertEquals("...Fizz...", FizzBuzzGame.print(93));
    }

    @Test
    public void should_return_fizz_when_number_equal_5(){
        String returnedValue = FizzBuzzGame.print(5);
        assertEquals("...Buzz...", returnedValue);
    }

    @Test
    public void should_return_fizz_when_number_multiples_5(){
        assertEquals("...Buzz...", FizzBuzzGame.print(20));
        assertEquals("...Buzz...", FizzBuzzGame.print(10));
        assertEquals("...Buzz...", FizzBuzzGame.print(100));
    }

    @Test
    public void should_return_fizz_when_number_containes_5(){
        assertEquals("...Buzz...", FizzBuzzGame.print(55));
        assertEquals("...Buzz...", FizzBuzzGame.print(52));
    }
}
