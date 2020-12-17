package words.fizzBuzz;

public class Palette {
    private String word;
    private int value;

    public Palette(String word, int value){
        if(value == 0) throw new FizzBuzzException();
        this.value = value;
        this.word = word;
    }

    public String print(int number){
        String str = String.valueOf(number);
        return (number % value == 0 || str.contains(String.valueOf(value))) ? word : null;
    }
}
