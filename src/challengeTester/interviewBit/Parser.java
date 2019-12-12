package challengeTester.interviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Parser {

    public static ArrayList<Integer> fromStringWithCommaSeparatedToList(String listRepr) {
        // Format like  "[3, 5, 4, 2]"
        if (isEmptyRepr(listRepr)) return new ArrayList<>();
        return Arrays.stream(purifyFromBrackets(listRepr)
                .replace(" ", "")
                .split(","))
                .map(Integer::valueOf).collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Integer> fromStringWithSpaceSeparatedToList(String listRepr) {
        // Format like  "[3 5 4 2]"
        if (isEmptyRepr(listRepr)) return new ArrayList<>();
        return Arrays.stream(purifyFromBrackets(listRepr)
                .split(" "))
                .map(Integer::valueOf).collect(Collectors.toCollection(ArrayList::new));
    }

    private static boolean isEmptyRepr(String s){
        return purifyFromBrackets(s).isEmpty();
    }

    private static String purifyFromBrackets(String s){
        return s.replace("[", "").replace("]","");
    }
}