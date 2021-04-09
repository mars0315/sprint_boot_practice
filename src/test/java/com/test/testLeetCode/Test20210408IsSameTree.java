package com.test.testLeetCode;

public class Test20210408IsSameTree {
    public static void main(String[] args) {

    }
    
//     public static boolean isSymmetric(TreeNode root){
//         return check(root,root);
//     }
//
//     public static boolean check(TreeNode p,TreeNode q){
//         if (p == null&&q==null) {
//             return true;
//         }else if (p == null||q==null) {
//             return false;
//         }
//         return p.val==q.val&&check(p.left,q.right)&&check(p.right,q.left);
//     }
//
//
//     public static boolean isSameTree(TreeNode p,TreeNode q){
//         if (p == null&&q==null) {
//             return true;
//         }else if( p == null||q==null){
//             return false;
//         }else if (p.val != q.val) {
//             return false;
//         }else {
//             return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
//         }
//     }
// }
//
// //Definition for a binary tree node.
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//
//     TreeNode() {
//     }
//
//     TreeNode(int val) {
//         this.val = val;
//     }
//
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
}
