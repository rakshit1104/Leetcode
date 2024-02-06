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
    public boolean findTarget(TreeNode root, int k) {
        BstIteratorInorder inorder = new BstIteratorInorder(root);
        BstIteratorInorderReverse inorderReverse = new BstIteratorInorderReverse(root);

        int l = inorder.next();
        int r = inorderReverse.next();

        while (l < r && inorder.hasNext() && inorderReverse.hasNext()) {
            if (l + r == k) {
                return true;
            } else if (l + r < k) {
                l = inorder.next();
            } else {
                r = inorderReverse.next();
            }
        }
        return false;
    }
}

class BstIteratorInorder {
    Stack<TreeNode> stack;
    BstIteratorInorder(TreeNode root) {
        stack = new Stack<>();
        pushIntoStack(root);
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
        TreeNode node = stack.pop();
        if (node != null)
            pushIntoStack(node.right);
        return stack.isEmpty() ? -1 : node.val;
    }
    private void pushIntoStack(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}

class BstIteratorInorderReverse {

    Stack<TreeNode> stack;
    BstIteratorInorderReverse(TreeNode root) {
        stack = new Stack<>();
        pushIntoStack(root);
    }
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
        TreeNode node = stack.pop();
        if (node != null)
            pushIntoStack(node.left);
        return stack.isEmpty() ? -1 : node.val;
    }

    private void pushIntoStack(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.right;
        }
    }
}