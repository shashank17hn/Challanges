package amazon;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }


    public void inOrderTraversal( TreeNode node){


        if(node.left != null){
            inOrderTraversal(node.left);
        }
        System.out.println(node.val);
        if(node.right != null){
            inOrderTraversal(node.right);
        }



    }

}

