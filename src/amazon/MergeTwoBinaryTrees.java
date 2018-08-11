package amazon;



/*

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

}


Input:
	Tree 1                     Tree 2
          1                         2
         / \                       / \
        3   2                     1   3
       /                           \   \
      5                             4   7
Output:
Merged tree:
	     3
	    / \
	   4   5
	  / \   \
	 5   4   7
*/


public class MergeTwoBinaryTrees {

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2){
         if(t1 == null || t2 == null){
             return t1 == null ? t2 : t1;
         }

         TreeNode node = new TreeNode(t1.val + t2.val);
         node.left = mergeTrees(t1.left , t2.left);
         node.right = mergeTrees(t1.right, t2.right);
         return node;


    }


    /*Input:
    Tree 1                     Tree 2
            1                         2
           / \                       / \
          3   2                     1   3
         /                           \   \
        5                             4   7
    Output:
    Merged tree:
            3
           / \
          4   5
         / \   \
        5   4   7*/

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);

        root1.inOrderTraversal(root1);
        System.out.println(" ------------------");
        root2.inOrderTraversal(root2);


        System.out.println(" ------------------");

        TreeNode node = mergeTrees(root1, root2);

        node.inOrderTraversal(node);

    }



}
