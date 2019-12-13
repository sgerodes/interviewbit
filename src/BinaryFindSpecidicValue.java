import java.util.List;

public class BinaryFindSpecidicValue {
    public int search(final List<Integer> A, int B) {
        int minIndex = findMinIndex(A);
        int low = 0, high = A.size()-1;
        if (B > A.get(A.size()-1)){
            high = minIndex != 0 ? minIndex - 1 : minIndex;
        } else {
            low = minIndex;
        }
        return binarySearchIndexOfInteger(A,B,low,high) ;
    }

    private int binarySearchIndexOfInteger(List<Integer> list, Integer target, int low, int high) {
        int mid;

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

    private int findMinIndex(final List<Integer> list) {
        if (list.size() == 0 ) return Integer.MIN_VALUE;
        if (list.get(0) < list.get(list.size()-1) || list.size() == 1) return 0;
        int low = 0;
        int mid;
        int high = list.size()-1;

        while (low < high){
            mid = (high - low) / 2 + low;

            boolean conditionToReturn = mid != 0 && list.get(mid) < list.get(mid-1);
            boolean conditionToGoUp = mid == 0 || list.get(mid) > list.get(0);

            if (conditionToReturn) return mid;
            if (conditionToGoUp) low = mid == low ? mid + 1 : mid;
            else high = mid;
        }
        boolean conditionToReturn = list.get(low) < list.get(low-1);
        return conditionToReturn ? low : Integer.MIN_VALUE;
    }
}
