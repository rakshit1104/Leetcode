class Solution {
    public void getInorder(TreeNode root,ArrayList<Integer>arr){
        if(root==null){
            return;
        }
        getInorder(root.left,arr);
        arr.add(root.val);
        getInorder(root.right,arr);
    }

    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer>arr=new ArrayList<>();
        getInorder(root,arr);

        int i = 0;
        int j = arr.size()-1;
        while(i < j){
            if(arr.get(i)+arr.get(j) == k){
                return true;
            } else if(arr.get(i)+arr.get(j) > k){
                j--;
            } else{
                i++;
            }

        }
        
    return false;  
    }
}