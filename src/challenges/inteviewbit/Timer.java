package challenges.inteviewbit;

import java.math.BigInteger;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Timer {

    public static long timeIt(int iterations, BiFunction<Integer, Integer, Integer> function, int a, int b){
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            function.apply(a,b);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
