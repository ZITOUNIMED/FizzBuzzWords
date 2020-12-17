package words.fizzBuzz;

public class FizzBuzzGame {
    private static final AbstractFizzBuzz buzz = new Buzz();
    private static final AbstractFizzBuzz fizz = new Fizz();

    public static String print(int number){
        String word = fizz.print(number);
        if(word == null){
            word = buzz.print(number);
        }

        return word != null ? word : String.valueOf(number);
    }

    public static void printNumbersBetween1and100onConsole(){
        for (int i = 1; i<=100; i++){
            System.out.println(print(i));
        }
    }
}
