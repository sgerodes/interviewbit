import challenges.inteviewbit.binarysearch.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class BinaryFindMin {

    public int findMin(final List<Integer> list) {
        if (list.size() == 0 ) return Integer.MIN_VALUE;
        if (list.get(0) < list.get(list.size()-1) || list.size() == 1) return list.get(0);
        int low = 0;
        int mid;
        int high = list.size()-1;

        while (low < high){
            mid = (high - low) / 2 + low;

            boolean conditionToReturn = mid != 0 && list.get(mid) < list.get(mid-1);
            boolean conditionToGoUp = mid == 0 || list.get(mid) > list.get(0);

            if (conditionToReturn) return list.get(mid);
            if (conditionToGoUp) low = mid == low ? mid + 1 : mid;
            else high = mid;
        }
        boolean conditionToReturn = list.get(low) < list.get(low-1);
        return conditionToReturn ? list.get(low) : Integer.MIN_VALUE;
    }
}
