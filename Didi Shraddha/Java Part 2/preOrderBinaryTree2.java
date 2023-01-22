// Build a Tree from its Preorder traversal

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
    // Preorder traversal
    public static void preorder(Node root){
        if(root == null)
            return; 
        // return -1;
        
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
        
    }

    public static void main(String [] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes); // represent all tree nodes
        // System.out.println(root.data);
        
        preorder(root);
    }
}


// Output of the Program::

1 2 4 5 3 6 
