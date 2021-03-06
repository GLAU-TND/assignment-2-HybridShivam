/*
 *  Created by IntelliJ IDEA.
 *  User: HybridShivam
 */
package problem1.main;
import problem1.mybst.MyBinarySearchTree;

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
        System.out.println("PreOrder Traversal : ");
        mytree.traversePreOrder();
        System.out.println("Left children Only : ");
        //traverseLeft() methods prints all left children as well as returns the no of nodes not having left a child
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


