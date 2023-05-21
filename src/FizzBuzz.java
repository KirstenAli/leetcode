import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        var answers = new ArrayList<String>();

        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0)
                answers.add("FizzBuzz");

            else if (i%3==0)
                answers.add("Fizz");

            else if(i%5==0)
                answers.add("Buzz");

            else
                answers.add(String.valueOf(i));
        }

        return answers;
    }

    public static void main(String[] args){
        new FizzBuzz().fizzBuzz(3);
    }
}
