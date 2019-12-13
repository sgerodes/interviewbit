import challenges.inteviewbit.JavaLists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SearchMatrixTest {

    SearchMatrix sol = new SearchMatrix();

    @Test
    void searchMatrix() {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(JavaLists.fromStringWithCommaSeparatedToList("[3, 3, 11, 12, 14]"));
        matrix.add(JavaLists.fromStringWithCommaSeparatedToList("[16, 17, 30, 34, 35]"));
        matrix.add(JavaLists.fromStringWithCommaSeparatedToList("[45, 48, 49, 50, 52]"));
        matrix.add(JavaLists.fromStringWithCommaSeparatedToList("[56, 59, 63, 63, 65]"));
        matrix.add(JavaLists.fromStringWithCommaSeparatedToList("[67, 71, 72, 73, 79]"));
        matrix.add(JavaLists.fromStringWithCommaSeparatedToList("[80, 84, 85, 85, 88]"));
        matrix.add(JavaLists.fromStringWithCommaSeparatedToList("[88, 91, 92, 93, 94]"));
        int B = 94;
        int expected = 1;

        assertEquals(expected, sol.searchMatrix(matrix, B), errorMessage(matrix, B));

    }
    private String errorMessage( ArrayList<ArrayList<Integer>> matrix, int target){
        return String.format("Target. %s; Matrix: %s", target, matrix.toString());
    }
}