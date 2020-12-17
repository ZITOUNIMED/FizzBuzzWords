package words.fizzBuzz;

public class FizzBuzzException extends RuntimeException{
    public FizzBuzzException(){
        super("Can't use zero number here!");
    }
}
