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
        mytree.insert(50);
        mytree.insert(30);
        mytree.insert(20);
        mytree.insert(40);
        mytree.insert(70);
        mytree.insert(60);
        mytree.insert(80);
        int elementToSearch=16;
        //System.out.println(elementToSearch +" present ?:"+mytree.search(elementToSearch));
        //mytree.traversePreOrder(mytree.getRoot());
        System.out.println("In Order Traversal of tree :");
        mytree.traverseInOrder();
        //mytree.traverseInOrder(mytree.getRoot());
        //mytree.traverseInOrder(mytree.getRoot());
        //System.out.println("Node Count is "+mytree.getfullCount(mytree.getFirstNode()));
    }
}


