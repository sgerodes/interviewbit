package challenges.inteviewbit.Math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public static boolean isPrime(int A) {
        if (A < 2) return false;

        for ( int prime: sieveOfEratosthenes((int)Math.sqrt(A)) ) {
            if (A % prime == 0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> sieveOfEratosthenes(int bound) {
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

    public static Map<Integer, Integer> getCounter(List<Integer> list){
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int i: list) {
            counter.put(i, counter.getOrDefault(i,0)+1);
        }
        return counter;
    }

    public static int gcd(int a, int b){
        return gcdStein(a,b);
    }
    public static int gcdEuclidean(int a, int b){
        int c;
        while(b != 0) {
            c = b;
            b = a%b;
            a = c;
        }
        return a;
    }

    public static int gcdStein(int u, int v){
        int shift;
        if (u == 0)
            return v;
        if (v == 0)
            return u;
        for (shift = 0; ((u | v) & 1) == 0; ++shift)
        {
            u >>= 1;
            v >>= 1;
        }
        while ((u & 1) == 0)
            u >>= 1;
        do
        {
            while ((v & 1) == 0)
                v >>= 1;

            if (u > v)
            {
                int t = v;
                v = u;
                u = t;
            }
            v = v - u;
        } while (v != 0);

        return u << shift;

    }
}
