package math;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    final static String f = "Fizz";
    final static String b = "Buzz";
    final static String fb = "math.FizzBuzz";

    public ArrayList<String> fizzBuzz(int A) {
        return IntStream.rangeClosed(1, A)
                .mapToObj(this::fizzbuzzify)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private String fizzbuzzify(int i){
        return i % 3 == 0 ? (i % 5 == 0 ? fb : f) : (i % 5 == 0 ? b : String.valueOf(i));
    }
}
