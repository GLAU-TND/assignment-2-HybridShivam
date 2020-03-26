/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree

import problem1.node.TreeNode;

import java.util.Queue;
import java.util.LinkedList;

public class MyBinarySearchTree {
    private TreeNode root;
    //private TreeNode firstNode;

    public MyBinarySearchTree(){
        root=null;
    }

//    public TreeNode getFirstNode() {
//        return firstNode;
//    }

    public TreeNode getRoot() {
        return root;
    }


    public void insert(int data){
        root=insertRecursive(root,data);
    }

    TreeNode insertRecursive(TreeNode root,int data){
        if(root==null){
            root=new TreeNode(data);
            return root;
        }
        else{
            if(root.getData()>=data){
                root.setLeft(insertRecursive(root.getLeft(),data));
            }
            else if(root.getData()<data){
                root.setRight(insertRecursive(root.getRight(),data));
            }
            return root;
        }
    }


    public void traverseInOrder()  {
        traverseInOrderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void traverseInOrderRec(TreeNode root) {
        if (root != null) {
            traverseInOrderRec(root.getLeft());
            System.out.println(root.getData());
            traverseInOrderRec(root.getRight());
        }
    }

    public void traversePreOrder()  {
        traversePreOrderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void traversePreOrderRec(TreeNode root) {
        if (root != null) {
            traverseInOrderRec(root.getLeft());
            System.out.println(root.getData());
            traverseInOrderRec(root.getRight());
        }
    }
//    public void insert(int data) {
//        TreeNode node = new TreeNode(data);
//        if (root == null) {
//            root = node;
//            firstNode = node;
//        } else {
//            TreeNode temp = root;
//            TreeNode parent = null;
//            while (temp != null) {
//                //to get location
//                parent = temp;
//                if (node.getData() <= temp.getData()) {
//                    temp = temp.getLeft();
//                } else {
//                    temp = temp.getRight();
//                }
//                if (node.getData() <= parent.getData()) {
//                    //adding element
//                    parent.setLeft(node);
//                } else {
//                    parent.setRight(node);
//                }
//            }
//        }
//    }

    public boolean search(int data) {
        boolean response = false;
        TreeNode temp = root;
        while (temp != null) {
            if (temp.getData() == data) {
                response = true;
                break;
            } else {
                if (data <= temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
        }
        return response;
    }

//    public void traversePreOrder(TreeNode node) {
//        if (node == null) {
//            return;
//        } else {
//            System.out.println(node.getData());
//            traversePreOrder(node.getLeft());
//            traversePreOrder(node.getRight());
//        }
//    }
//
//    public void traverseInOrder(TreeNode node) {
//        if (node == null) {
//
//        } else {
//            traversePreOrder(node.getLeft());
//            System.out.println(node.getData());
//            traversePreOrder(node.getRight());
//        }
//    }

/*    public int nodeCount()
    {
        if (root==null)
            return 0;
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(root);

        int count=0;
        while (!queue.isEmpty())
        {

            Node temp = queue.poll();
            if (temp.getLeft()!=null && temp.getRight()!=null)
                count++;

            if (temp.getLeft()!= null)
            {
                queue.add(temp.getLeft());
            }

            if (temp.getRight()!= null)
            {
                queue.add(temp.getRight());
            }
        }
        return count;
    }*/

    public int getfullCount(TreeNode root) {
        if (root == null)
            return 0;
        int count = 0;
        if (root.getLeft() != null && root.getRight() != null)
            count++;

        count += (getfullCount(root.getLeft()) + getfullCount(root.getRight()));
        return count;
    }
}
