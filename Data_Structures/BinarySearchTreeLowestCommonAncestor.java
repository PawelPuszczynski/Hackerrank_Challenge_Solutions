

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static Node lca(Node root, int v1, int v2) {
      Node tempLCA = root;
        while ((v1 < tempLCA.data && v2 < tempLCA.data)
                || (v1 > tempLCA.data && v2 > tempLCA.data)) {
            if (v1 < tempLCA.data) {
                tempLCA = tempLCA.left;
            } else {
                tempLCA = tempLCA.right;
            }
        }
        return tempLCA;
    }

