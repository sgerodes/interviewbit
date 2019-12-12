package challenges.inteviewbit.binarysearch;

import java.util.List;

public class BinarySearch <T extends Comparable<T>>{

    public int binarySearchIndexOfObject(List<T> list, T target) {
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

    int binarySearch(int[] Arr, int target) {
        int low = 0, high = Arr.length-1, mid;

        while(low <= high) {
            mid = (low + high) / 2;

            boolean conditionFound = Arr[mid] == target;
            if(conditionFound) return mid;

            boolean conditionGoUp = Arr[mid] < target;
            if(conditionGoUp) low = mid + 1;
            else high = mid - 1;
        }

        return -1;
    }


//    public int binarySearchTemplate(List<T> list) {
//        int low = 0, high = list.size() - 1, mid;
//
//        while(low <= high) {
//            mid = (low + high) / 2;
//
//            boolean conditionFound = ;//TO DO FILL CONDITION
//            if(conditionFound) return mid;
//
//            boolean conditionGoUp = ; //TO DO FILL CONDITION
//            if(conditionGoUp) low = mid + 1;
//            else high = mid - 1;
//
//        }
//        return -1; //TO DO If search Failed
//    }
}
