import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ATOI {
    private static final char minus = '-';
    private static final char plus = '+';

    private static final Map<String, Integer> atoi = new HashMap<String, Integer>(){{
        put("0", 0);
        put("1", 1);
        put("2", 2);
        put("3", 3);
        put("4", 4);
        put("5", 5);
        put("6", 6);
        put("7", 7);
        put("8", 8);
        put("9", 9);
    }};

    public int atoi(final String A) {
        String trim = A.trim();
        if (trim.length() == 0 || !isDigitOrSign(trim.charAt(0))) return 0;
        int i = 0;
        while (i < trim.length() && isDigitOrSign(trim.charAt(i))){
            i++;
        }
        String purified = trim.substring(0, i);
        if (purified.length() == 1 && isSign(purified.charAt(0))) return 0;
        if (purified.length() > String.valueOf(Integer.MIN_VALUE).length()) {
            return purified.charAt(0) == minus? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        long l = parseLong(purified);
        if (l > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (l < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)l;
    }


    private boolean isDigitOrSign(char c){
        return Character.isDigit(c) || isSign(c);
    }

    private boolean isSign(char c){
        return c == minus || c == plus;
    }

    private long parseLong(String longString){
        boolean neg = false;
        if (isSign(longString.charAt(0))) {
            neg = longString.charAt(0) == minus;
            longString = longString.substring(1);
        }
        List<Integer> ints = Arrays.stream(longString.split("")).map(atoi::get).collect(Collectors.toList());
        long ans = 0;
        for (int i = 0; i < ints.size(); i++) {
            ans += ints.get(i) * Math.pow(10, (ints.size()-i-1));
        }
        return neg ? -ans : ans;
    }


}
