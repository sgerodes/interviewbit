import java.util.ArrayList;

public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
        if (A.isEmpty() || A.get(0).isEmpty()) return 0;
        int up = 0;
        int down = A.size()-1;
        int vertMid = (up + down) / 2;
        int left = 0;
        int right = A.get(0).size()-1;
        int horizMid = (left + right) / 2;
        while (up != down){
            int coefficient = isOnTheRow(A, vertMid, B);
            if (coefficient == 0) break;
            if (coefficient < 0){
                down = vertMid;
            } else {
                up = vertMid+1;
            }
            vertMid = (up + down) / 2;
        }
        ArrayList<Integer> row = A.get(vertMid);
        while (left != right){
            int coefficient = B - row.get(horizMid);
            if (coefficient == 0) break;
            if (coefficient < 0){
                left = horizMid + 1;
            } else {
                right = horizMid;
            }
            horizMid = (left + right) / 2;
        }
        return A.get(vertMid).get(horizMid) == B ? 1 : 0;
    }

    private int isOnTheRow(ArrayList<ArrayList<Integer>> A, int vertMid, int B) {
        if (A.get(vertMid).get(0) > B) return -1;
        else if (A.get(vertMid).get(A.get(vertMid).size()-1) < B) return 1;
        else return 0;
    }
}
