import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    static final Map<String, Integer> subtractions = new HashMap<String, Integer>(){{
        put("IV", 4);
        put("IX", 9);
        put("XL", 40);
        put("XC", 90);
        put("CD", 400);
        put("CM", 900);
    }};
    static final Map<String, Integer> additive = new HashMap<String, Integer>(){{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};


    public int romanToInt(String A) {
        int subs = 0;
        for (Map.Entry<String, Integer> entry: subtractions.entrySet()) {
            int length = A.length();
            A = A.replace(entry.getKey(), "");
            subs += (length - A.length()) /entry.getKey().length() * entry.getValue();
        }
        if (A.length() > 0) subs += Arrays.stream(A.split("")).mapToInt(additive::get).sum();
        return subs;
    }
}
