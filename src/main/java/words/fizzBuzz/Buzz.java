package words.fizzBuzz;

public class Buzz extends AbstractFizzBuzz{
    private Palette palette = new Palette("...Buzz...", 5);
    @Override
    protected String print(int number) {
        return palette.print(number);
    }
}
