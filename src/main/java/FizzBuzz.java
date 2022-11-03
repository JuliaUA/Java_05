import java.util.Arrays;

public class FizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        if (start <= end) {
            String[] output = new String[end - start + 1];
            for (int i = 0; i < output.length; i ++ , start ++) {
                if (start %3 == 0 && start % 5 == 0) {
                output[i] = "FizzBuzz";
            } else if(start % 3 == 0) {
                output[i] = "Fizz";
            } else if(start % 5 == 0) {
                output[i] = "Buzz";
            } else {
                output[i] = String.valueOf(start);
            }
        }

        return output;
        } else {

            return new String[0];}
     }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new FizzBuzz().fizzBuzz(-20,-1)));
    }
}
