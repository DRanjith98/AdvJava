package com.java.collections;



public class BinarySearchTree {

public class Node{
int data;
Node left;
Node right;
}

public Node createNewNode( int data) {
Node n = new Node();
n.data = data;
n.left=null;
n.right=null;

return n;

}

public Node insert(Node node,int data) {
if(node == null) {
return createNewNode(data);
}

if(data < node.data) {
node.left = insert(node.left,data);
}
else if(data > node.data) {
node.right = insert(node.right,data);
}
return node;
}


public void postorder(Node node)
    {
        if (node == null)
            return;
 
       postorder(node.left);
       postorder(node.right);  
       System.out.print(node.data + " ");
    }
 
 
public void inorder(Node node)
    {
        if (node == null)
            return;
 
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
 
   
public void preorder(Node node)
    {
        if (node == null)
            return;
     
        System.out.print(node.data + " ");
        preorder(node.left);      
        preorder(node.right);
    }
 
}
























