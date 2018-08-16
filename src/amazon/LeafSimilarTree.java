package amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/*
Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a leaf value sequence.



        For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

        Two binary trees are considered leaf-similar if their leaf value sequence is the same.

        Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.


        3N
      /   \
     5L   1R
    / \   / \
  6L  2R 9L 8R
      / \
     7L 4R
*/





public class LeafSimilarTree {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.right = new TreeNode(1);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(8);


        TreeNode root2 = new TreeNode(3);
        root2.right = new TreeNode(1);
        root2.left = new TreeNode(5);
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(2);
        root2.left.right.left = new TreeNode(7);
        root2.left.right.right = new TreeNode(4);
        root2.right.left = new TreeNode(9);
        root2.right.right = new TreeNode(8);

        //root.inOrderTraversal(root);
        System.out.println(leafSimilar(root, root2));



    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1 = traversal(root1 , list1);
        list2 = traversal(root2 , list2);

        if(list1.equals(list2))
            return true;
        else return false;

       /* for(int i=0; i<list1.size();i++){
            if(list1.get(i) != list2.get(i)){
                return false;
            }
        }*/

    }

    public static List<Integer> traversal(TreeNode root , List<Integer> list){

        if(root.left == null && root.right == null){
             list.add(root.val);
             //return list;
        }
        if(root.left != null){
            traversal(root.left , list);
           // return list;
        }
        if(root.right != null){
             traversal(root.right , list);
            // return list
        }
        return list;
    }
}
