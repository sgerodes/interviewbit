import challenges.inteviewbit.JavaLists;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BinaryFindSpecidicValueTest {

    BinaryFindSpecidicValue sol = new BinaryFindSpecidicValue();
    Random rand = new Random();

    @Test
    void searchBunch3() {
        for (int i = 0; i < 1000; i++) {
            ArrayList<Integer> initial = JavaLists.generateRandomIntegerListWithUniqueValues(rand.nextInt(10)+2, - rand.nextInt(5), rand.nextInt(15) + 20);
            Collections.sort(initial);
            int target = initial.get(rand.nextInt(initial.size()-1));
            List<Integer> shifted = shift(initial, rand.nextInt(initial.size()));
            int expected = shifted.indexOf(target);
            try {
                assertEquals(expected, sol.search(shifted, target), errorMessage(shifted,expected, target));
            } catch (Exception e){
                System.out.println( errorMessage(shifted,expected, target));
                e.printStackTrace();
            }
        }
    }
    @Test
    void search() {
        ArrayList<Integer> shifted = JavaLists.fromStringWithCommaSeparatedToList("[101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100]");
        int target = 202;
        int expected = shifted.indexOf(target);

        assertEquals(expected, sol.search(shifted, target), errorMessage(shifted,expected, target));

    }

    private List<Integer> shift(List<Integer> initial, int shift) {
        return JavaLists.shiftRight(initial,shift);
    }


    private String errorMessage(List<Integer> initial, int expected, int target){
        return String.format("Expected: {%d}; Searched for {%d} in %s", expected, target, initial.toString());
    }
}