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
        mytree.insert(90);
        mytree.insert(10);
        System.out.println("Left Nodes Only : ");
        System.out.println("No of nodes not having Left Subchild: "+mytree.traverseLeft());
//        int elementToSearch=89;
//        System.out.println(elementToSearch +" present ? : "+mytree.search(elementToSearch));
//        System.out.println("In Order Traversal of tree :");
//        mytree.traverseInOrder();
//        System.out.println("Pre Order Traversal of tree :");
//        mytree.traversePreOrder();
//        System.out.println("Post Order Traversal of tree :");
//        mytree.traversePostOrder();
//        System.out.println("Total no of nodes : "+mytree.count());
    }
}


