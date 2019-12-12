import challengeTester.interviewBit.TreeNode;

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */

public class ValidBST {
    public int isValidBST(TreeNode A) {
        return A != null && isValidBSTBoolean(A) ? 1 : 0;
    }

    public boolean isValidBSTBoolean(TreeNode A) {
        boolean isValid = true;
        if (A.left != null){
            if (A.left.val >= A.val) return false;
            else isValid = isValidBSTBoolean(A.left);
        }
        if (A.right != null){
            if (A.right.val >= A.val) return false;
            else isValid &= isValidBSTBoolean(A.right);
        }
        return isValid;
    }
}