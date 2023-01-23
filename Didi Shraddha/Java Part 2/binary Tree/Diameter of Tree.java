// // Build a Tree from its Diameter of the Tree
// use recursion
// => max function 
// and height of Tree Function 

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
    
    public static int diameter(Node root){
        if(root == null)
            return 0;
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = height(root.left) + height(root.right) + 1;
        return Math.max(dia3, Math.max(dia1, dia2)); // two time use max() Fucntion 
        
    }

    public static void main(String [] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes); // represent all tree nodes
        
        System.out.println("Height of Tree : " + height(root));
        System.out.println("diameter of the Tree : " + diameter(root));
    }
}

// Output of the Program:
// Height of Tree : 3
// diameter of the Tree : 5
