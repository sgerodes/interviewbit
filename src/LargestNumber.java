import java.util.List;
import java.util.stream.Collectors;

public class LargestNumber {
    public String largestNumber(final List<Integer> A) {
        //check if we got a proper List
        if (A == null || A.size() < 1) return "";

        List<String> strings = A.stream()

                // first filter out all zeroes to avoid any leading zeroes
                .filter(i -> i != 0)

                // then convert the integers into strings
                .map(String::valueOf)

                // then sort based on what concatenation of every pair is bigger
                .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
                .collect(Collectors.toList());

        // if a List contained only zeroes than return "0"
        if (strings.size() == 0) return "0";

        //join the List
        return String.join("", strings);
    }
}
