import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchMatrix {


    public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
        if (A.isEmpty() || A.get(0).isEmpty()) return 0;

        int rowIndex = binarySearchRow(A, B);
        if ( rowIndex == -1) return 0;

        int elementIndex = binarySearchIndexOfInteger(A.get(rowIndex), B);
        return elementIndex != -1 ? 1 : 0;
    }

    public int binarySearchRow(ArrayList<ArrayList<Integer>> list, Integer B) {
        int low = 0, high = list.size() - 1, mid;

        while(low <= high) {
            mid = (low + high) / 2;

            int onTheRow = isOnTheRow(list, mid, B);
            boolean conditionFound = onTheRow == 0;
            if(conditionFound) return mid;

            boolean conditionGoUp = onTheRow > 0;
            if(conditionGoUp) low = mid + 1;
            else high = mid - 1;

        }
        return -1;
    }

    public int binarySearchIndexOfInteger(List<Integer> list, Integer target) {
        int low = 0, high = list.size() - 1, mid;

        while(low <= high) {
            mid = (low + high) / 2;

            boolean conditionFound = list.get(mid).equals(target);
            if(conditionFound) return mid;

            boolean conditionGoUp = list.get(mid).compareTo(target) < 0;
            if(conditionGoUp) low = mid + 1;
            else high = mid - 1;

        }
        return -1;
    }

    private int isOnTheRow(ArrayList<ArrayList<Integer>> A, int i, int B) {
        ArrayList<Integer> row = A.get(i);
        if (B < row.get(0)) return -1;
        else if (B > row.get(row.size()-1) ) return 1;
        else return 0;
    }
}
