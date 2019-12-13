import com.sun.org.apache.xml.internal.security.utils.XalanXPathAPI;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PowerRemainder {
    public int pow(int x, int n, int d) {
        if (n == 0) return 1 % d;
        if (x == 0 || n == 1) return (x + d) % d;

        long lx = x;
        LinkedList<Integer> pFactorsOfN = primeFactors(n);
        while (pFactorsOfN.size() > 0 && pFactorsOfN.get(0) < 21){
            int pFactor = pFactorsOfN.pollFirst();
            lx = ((long)Math.pow(lx, pFactor)) % d;
        }
        n = pFactorsOfN.stream().reduce(1, (a,b) -> a*b);
        while (n > 1){
            lx = (lx * x) % d;
            n--;
        }
        return (int)lx % d;
    }
    public int powFactorisation(int x, int n, int d) {
        if (n == 0) return 1 % d;
        if (x == 0) return 0;
        long lx = x;
        while (n > 1 && n%2 == 0){
                lx = (lx * lx) % d;
                n = n>>1;
        }
        while ( n > 1 && n%3 == 0){
            lx = (lx * lx * lx);
            lx = lx %d;
            n /= 3;
        }
        while ( n > 1 && n%5 == 0){
            lx = (lx * lx * lx * lx* lx) % d;
            n /= 5;
        }
        lx = ((long)Math.pow(x, n - 1) * lx);

        return (int)lx % d;
    }

    public int powInt(int x, int n, int d) {
        return ((int)Math.pow(x, n) % d + d) % d;
    }

    public int powLong(int x, int n, int d){
        return (int)(((long)Math.pow(x, n) % d + d) % d);
    }

    public int powBig(int x, int n, int d){
        BigInteger D = BigInteger.valueOf(d);
        return BigInteger.valueOf(x).pow(n).remainder(D).add(D).remainder(D).intValue();
    }

    public int powAlternating(int x, int n, int d) {
        double solution = x;


        while (n > 0){
            solution =  (solution * x) % d;
            --n;
        }

        return (int)(solution + d) % d;
    }

    public int powFromInterviewBit(int x, int n, int d) {
        long ans = 1;
        if(x==0 && n==0)
        {
            if(d!=1)
                return 1;
            else
                return 0;
        }
        if(x==0)
            return 0;
        long a = x;
        int b = n;

        while(b>0)
        {
            if((b&1)==1)
                ans = (ans*a);
            if(ans<0)
                ans = d - (-1*x)%d;
            else
                ans = ans%d;

            b = b>>1;
            a = (a*a)%d;
        }

        return (int)ans;
    }

    public static LinkedList<Integer> primeFactors(int n) {
        if (n < 2) throw new IllegalArgumentException("Cant factorise numbers less than 2. Given:{" + n + "}");
        LinkedList<Integer> primeFactors = new LinkedList<>();
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
