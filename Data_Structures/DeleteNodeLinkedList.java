

    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        
        if (position == 0) {
            head = head.next;
            
        } else {
            SinglyLinkedListNode currentNode = head;
            for (int i =0; i< position-1; i++){
                currentNode = currentNode.next;
            }
            if (currentNode.next.next == null){
                currentNode.next = null;
            } else
            currentNode.next = currentNode.next.next;

        }

        return head;
    }

