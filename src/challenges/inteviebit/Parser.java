package challenges.inteviebit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Parser {

    static Random random = new Random();

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

    public static ArrayList<Integer> generateRandomIntegerList(int length, int minVAl, int maxVal){
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            lst.add(random.nextInt(maxVal-minVAl) + minVAl);
        }
        return lst;
    }
}