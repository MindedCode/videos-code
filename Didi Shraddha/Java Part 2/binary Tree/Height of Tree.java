// Build a Tree from its Height of tree

// use recursion 
// Math.max lib function
// left SubTree Greater 
// of right SubTree Greater

import java.util.*;

public class Main{
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
            
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
        
        idx++;
        
        if(nodes[idx] == -1)
            return null;
        
        Node newNode = new Node(nodes[idx]);
        
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        
        return newNode;
        }
    }
    
    public static int height(Node root){
        if(root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right); 
        int myHeight = Math.max(leftHeight, rightHeight) + 1; //using Math.Max lib function
        return myHeight;
    }

    public static void main(String [] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes); // represent all tree nodes
        
        System.out.println(height(root));
    }
}

Output of the Program:
3
