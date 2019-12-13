package challenges.inteviewbit.Math;

import java.util.ArrayList;

public class Numbers {
    public static ArrayList<Integer> primeFactors(int n) {
        if (n < 2) throw new IllegalArgumentException("Cant factorise numbers less than 2. Given:{" + n + "}");
        ArrayList<Integer> primeFactors = new ArrayList<>();
        while (n%2==0) {
            primeFactors.add(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i+= 2) {
            while (n%i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        if (n > 2) primeFactors.add(n);
        return primeFactors;
    }
}
