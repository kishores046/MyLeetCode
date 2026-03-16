package BinaryTree;

import java.util.ArrayList;
import java.util.List;


 //Definition for a binary tree node.
//   class BinaryTree.TreeNode {
//      int val;
//      BinaryTree.TreeNode left;
//      BinaryTree.TreeNode right;
//      BinaryTree.TreeNode() {}
//      BinaryTree.TreeNode(int val) { this.val = val; }
//      BinaryTree.TreeNode(int val, BinaryTree.TreeNode left, BinaryTree.TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//  }
 
class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> list=new ArrayList<>();
       preorder(root,list);
       return list;
    }
    public void preorder(TreeNode node,List<Integer> list){
        if(node!=null){
            list.add(node.val);
            preorder(node.left,list);
            preorder(node.right,list);
        }
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
        List<Integer> result=new BinaryTreePreorderTraversal().preorderTraversal(root);
        System.out.println(result);
    }}   
    