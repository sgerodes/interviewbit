package challenges.inteviewbit.binarysearch;

import challenges.inteviewbit.collections.ListNode;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch <T extends Comparable<T>>{

    public static int binarySearchIndexOfInteger(ArrayList<Integer> list, Integer toFind) {
        return new BinarySearch<Integer>().binarySearchIndexOfObject(list, toFind);
    }

    public int binarySearchIndexOfObjectOld(ArrayList<T> list, T target) {
        if (list.size() == 0 || !target.getClass().equals(list.get(0).getClass())) return -1;
        int low = 0;
        int mid;
        int high = list.size()-1;

        while (low < high){
            mid = (high - low) / 2 + low;
            if (list.get(mid).equals(target)) return mid;
            if (list.get(mid).compareTo(target) > 0) high = mid;
            else low = mid == low ? mid + 1 : mid;
        }
        return list.get(low).equals(target) ? low : -1;
    }

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
//            boolean conditionFound = ;//TODO FILL CONDITION
//            if(conditionFound) return mid;
//
//            boolean conditionGoUp = ; //TODO FILL CONDITION
//            if(conditionGoUp) low = mid + 1;
//            else high = mid - 1;
//
//        }
//        return -1; //TODO If search Failed
//    }
}
