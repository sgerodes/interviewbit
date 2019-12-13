package math;

import java.util.ArrayList;
import java.util.Collections;

public class GCD {

    public int gcd(int a, int b){
        int c;
        while(b != 0) {
            c = b;
            b = a%b;
            a = c;
        }
        return a;
    }

    public int gcdWithFactors(int A, int B) {
        A = Math.abs(A);
        B = Math.abs(B);
        if (A == 1 || B == 1) return 1;
        if (A == 0) return B;
        if (B == 0) return A;
        return listIntersection(primeFactors(A), primeFactors(B)).stream().reduce(1, (a, b) -> a * b);
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

    public static ArrayList<Integer> listIntersection(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> intersection = new ArrayList<>();
        int aPtr = 0, bPtr = 0;
        while (aPtr < a.size() && bPtr < b.size()){
            int aCurr = a.get(aPtr);
            int bCurr = b.get(bPtr);
            if (aCurr == bCurr) {
                intersection.add(aCurr);
                aPtr++;
                bPtr++;
            } else if (aCurr > bCurr) {
                bPtr++;
            } else {
                aPtr++;
            }
        }
        return intersection;
    }

}
