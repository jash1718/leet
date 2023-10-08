/* CONVERTED SORTED ARRAY TO BINARY SEARCH TREE. 
Given an integer array nums where the elements are sorted in ascending order, convert it to a 
height-balanced
binary search tree.*/
class Convert108 {
    public TreeNode sortedArrayToBST(int[] arr) {
        if (arr.length == 0)
            return null;
        return bst(arr, 0, arr.length - 1);
    }

    public TreeNode bst(int arr[], int i, int j) {
        if (i > j)
            return null;
        int mid = i + (j - i) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = bst(arr, i, mid - 1);
        node.right = bst(arr, mid + 1, j);
        return node;
    }
}