package math;

import java.util.*;

public class IsPower {
    public int isPower(int A) {
        if (A < 1) return 0;
        if (A == 1) return 1;
        ArrayList<Integer> primeFactors = primeFactors(A);
        Map<Integer, Integer> counter = getCounter(primeFactors);
        return counter.values().stream().reduce(this::gcd).get() > 1 ? 1 : 0;
    }

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

    public static Map<Integer, Integer> getCounter(List<Integer> list){
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int i: list) {
            counter.put(i, counter.getOrDefault(i,0)+1);
        }
        return counter;
    }

    public int gcd(int a, int b){
        int c;
        while(b != 0) {
            c = b;
            b = a%b;
            a = c;
        }
        return a;
    }
}
