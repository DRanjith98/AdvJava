package com.java.main;

import com.java.collections.BinarySearchTree;
import com.java.collections.BinarySearchTree.Node;


public class program {

	
	public static void main(String args[]) {
		
		BinarySearchTree BST = new BinarySearchTree();
		Node root = null;
		
		root = BST.insert(root,5);
		root = BST.insert(root,3);
		root = BST.insert(root,2);
		root = BST.insert(root,4);
		root = BST.insert(root,7);
		root = BST.insert(root,6);
		root = BST.insert(root,8);
		
		
		System.out.println("Preorder traversal : "); 
		BST.preorder(root); 
  
        System.out.println("\nInorder traversal : "); 
        BST.inorder(root); 
  
        System.out.println("\nPostorder traversal : "); 
        BST.postorder(root);
		
	}
}
