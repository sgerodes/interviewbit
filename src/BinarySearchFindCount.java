import java.util.List;

public class BinarySearchFindCount {
    public int findCount(final List<Integer> A, int B) {
        int leftIndex = binarySearchBorder(A, B, true);
        if (leftIndex == -1) return 0;
        int rightIndex = binarySearchBorder(A, B, false);
        return rightIndex - leftIndex + 1;
    }

    public int binarySearchBorder(List<Integer> list, Integer toFind, boolean leftBorder) {
        if (list.size() == 0 || !toFind.getClass().equals(list.get(0).getClass())) return -1;
        int low = 0;
        int high = list.size()-1;
        int mid;
        int last = list.size()-1;

        int offset = leftBorder ? -1 : 1;


        while (low < high){
            mid = (high - low) / 2 + low;

            boolean equals = list.get(mid).equals(toFind);
            boolean midIstheBorder = leftBorder ? mid == 0 : mid == last;
            boolean nextAfterMidIsDifferent = !midIstheBorder && list.get(mid + offset).compareTo(toFind) != 0;

            if ( equals ){
                if (midIstheBorder || nextAfterMidIsDifferent){
                    return mid;
                }
                if (leftBorder){
                    high = mid;
                }else {
                    low = mid == low ? mid + 1 : mid;
                }
                continue;
            }

            if (list.get(mid).compareTo(toFind) > 0) {
                high = mid;
            } else {
                low = mid == low ? mid + 1 : mid;
            }
        }
        return list.get(low).equals(toFind) ? low : -1;
    }
}
