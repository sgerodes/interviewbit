package math;

import java.util.ArrayList;

public class PrimeNumbers {
    public boolean isPrime(int A) {
        if (A < 2) return false;

        for ( int prime: sieve((int)Math.sqrt(A)) ) {
            if (A % prime == 0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> sieve(int bound) {
        boolean[] notPrime = new boolean[bound + 1];
        notPrime[0] = notPrime[1] = true;

        for (int i = 2; i <= bound; i++) {
            if (notPrime[i]) continue;

            for (long j = (long) i * i; j <= (long)bound; j += i) {
                notPrime[(int)j] = true;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i <= bound; i++) {
            if (!notPrime[i]) res.add(i);
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new PrimeNumbers().isPrime(15364));
    }
}
