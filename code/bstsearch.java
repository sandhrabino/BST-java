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
    public boolean search(int val) 

    {
        return search(root, val);
    }
    private boolean search(Node r, int val) 
    {
        boolean found = false;
        while ((r != null) && !found) 
        {
            int rval = r.key;
            if (val < rval)
                r = r.left;
            else if (val > rval)
                r = r.right;
            else 
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
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
