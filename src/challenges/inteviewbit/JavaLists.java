package challenges.inteviewbit;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaLists {

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

    public static ArrayList<Integer> generateRandomIntegerListWithUniqueValues(int length, int minVAl, int maxVal){
        if (maxVal-minVAl < length) throw new RuntimeException("Cant create a list with unique values");
        List<Integer> unique = new ArrayList<>();
        for (int i = minVAl; i < maxVal; i++) {
            unique.add(i);
        }
        Collections.shuffle(unique);
        ArrayList<Integer> trimmed = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            trimmed.add(unique.get(i));
        }
        return trimmed;
    }

    public static List<Integer> shiftRight(List<Integer> initial, int shift) {
        List<Integer> newValues = new ArrayList<>(initial);
        Collections.rotate(newValues, shift);
        return newValues;
    }

    public static ArrayList<Integer> listIntersection(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> aClone = new ArrayList<>(a);
        ArrayList<Integer> bClone = new ArrayList<>(b);
        Collections.sort(aClone);
        Collections.sort(bClone);

        ArrayList<Integer> intersection = new ArrayList<>();
        int aPtr = 0, bPtr = 0;
        while (aPtr < aClone.size() && bPtr < bClone.size()){
            int aCurr = aClone.get(aPtr);
            int bCurr = bClone.get(bPtr);
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