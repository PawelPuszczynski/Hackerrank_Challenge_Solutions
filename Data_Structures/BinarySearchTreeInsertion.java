

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root,int data) {
         
        Node tempRoot = root;
        if (root == null) {
            root = new Node(data);
            return root;
        } else {

            while (root.left != null || root.right != null){
                if (data < root.data) {
                    if(root.left!=null){
                        root = root.left;
                    } else {
                        root.left = new Node(data);
                        return tempRoot;
                    }
                } else {
                    if (root.right!=null){
                        root = root.right;
                    } else {
                        root.right = new Node(data);
                        return tempRoot;
                    }
                }
            }
            Node newNode = new Node(data);
           
            if (data < root.data) {
                root.left = newNode;
            } else {
                root.right = newNode;
            }
          
        }
        return  tempRoot;
    }

