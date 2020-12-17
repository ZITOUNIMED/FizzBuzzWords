package words.fizzBuzz;

public class Fizz extends AbstractFizzBuzz{
    private Palette palette = new Palette("...Fizz...", 3);
    @Override
    protected String print(int number) {
        return palette.print(number);
    }
}
