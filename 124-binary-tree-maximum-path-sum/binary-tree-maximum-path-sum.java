/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxPathSum(TreeNode root) {
        int arr[] = new int[1];
        arr[0] = Integer.MIN_VALUE;
        max(root, arr);
        return arr[0];
    }

    private static int max(TreeNode root, int[] arr) {

        if (root == null) return 0;

        int leftsum = max(root.left, arr);
        if (leftsum < 0) leftsum = 0;
        int rightsum = max(root.right, arr);
        if (rightsum < 0) rightsum = 0;


        arr[0] = Math.max(arr[0], leftsum + rightsum + root.val);
        return Math.max(leftsum, rightsum) + root.val;
    }
}