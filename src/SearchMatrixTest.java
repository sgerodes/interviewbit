import challenges.inteviewbit.Parser;
import challenges.inteviewbit.collections.ListNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SearchMatrixTest {

    SearchMatrix sol = new SearchMatrix();

    @Test
    void searchMatrix() {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(Parser.fromStringWithCommaSeparatedToList("[3, 3, 11, 12, 14]"));
        matrix.add(Parser.fromStringWithCommaSeparatedToList("[16, 17, 30, 34, 35]"));
        matrix.add(Parser.fromStringWithCommaSeparatedToList("[45, 48, 49, 50, 52]"));
        matrix.add(Parser.fromStringWithCommaSeparatedToList("[56, 59, 63, 63, 65]"));
        matrix.add(Parser.fromStringWithCommaSeparatedToList("[67, 71, 72, 73, 79]"));
        matrix.add(Parser.fromStringWithCommaSeparatedToList("[80, 84, 85, 85, 88]"));
        matrix.add(Parser.fromStringWithCommaSeparatedToList("[88, 91, 92, 93, 94]"));
        int B = 94;
        int expected = 1;

        assertEquals(expected, sol.searchMatrix(matrix, B), errorMessage(matrix, B));

    }
    private String errorMessage( ArrayList<ArrayList<Integer>> matrix, int target){
        return String.format("Target. %s; Matrix: %s", target, matrix.toString());
    }
}