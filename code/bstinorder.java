package bst;

public class Bst {
	Node root; 
    Bst() {  
        root = null;  
    }
    void insert(int key) {
        root = insRec(root, key);
     }
    Node insRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key){
        	root.left = insRec(root.left, key);
        	}
        else if (key > root.key) {
        	root.right = insRec(root.right, key);
        	}
    return root; 
    }
    void inorder()  {
        inorderRec(root);
     }

     void inorderRec(Node root) {
         if (root!=null) {
             inorderRec(root.left);
             System.out.println(root.key);
             inorderRec(root.right);
         }
     } 
}



public class Node {
        int key;
        Node left, right;
 
        public Node(int item) {
            key = item;
            left = right = null; 
        }
}


