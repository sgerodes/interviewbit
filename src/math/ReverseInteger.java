package math;

public class ReverseInteger {
    public int reverse(int A) {
        boolean negative = A < 0;
        A = Math.abs(A);
        String initial = String.valueOf(A);
        StringBuilder reversed = new StringBuilder();
        if ( negative) reversed.append("-");
        for (int i = initial.length()-1; i >= 0; i--) {
            reversed.append(initial.charAt(i));
        }

        int num;
        try {
            num = Integer.parseInt(reversed.toString());;
        } catch (java.lang.NumberFormatException e){
            return 0;
        }
        return num;
    }
}
