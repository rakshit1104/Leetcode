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
    public TreeNode bstFromPreorder(int[] preOrder) {
        return bstFromPreOrder(preOrder, Integer.MAX_VALUE, new int[]{0});
    }

    public static TreeNode bstFromPreOrder(int[] preOrder, int bound, int[] i){
        if(i[0] == preOrder.length || preOrder[i[0]] > bound) return null;
        TreeNode root = new TreeNode(preOrder[i[0]++]);
        root.left = bstFromPreOrder(preOrder, root.val, i);
        root.right = bstFromPreOrder(preOrder, bound, i);
        return root;
    }
}