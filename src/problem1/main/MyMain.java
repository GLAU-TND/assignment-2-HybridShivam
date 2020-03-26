/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
import problem1.mybst.MyBinarySearchTree;
// executable class

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree mytree=new MyBinarySearchTree();
        mytree.insert(12);
        mytree.insert(13);
        mytree.insert(14);
        mytree.insert(11);
        mytree.insert(16);
        int elementToSearch=16;
        System.out.println(elementToSearch +" present ?:"+mytree.search(elementToSearch));
        mytree.traversePreOrder(mytree.getRoot());
        System.out.println("In Order Traversal of tree :");
        //mytree.traverseInOrder(mytree.getRoot());
        //mytree.traverseInOrder(mytree.getRoot());
        System.out.println("Node Count is "+mytree.getfullCount(mytree.getFirstNode()));
    }
}


