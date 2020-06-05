

    // Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        int listLength = 0;
        SinglyLinkedListNode currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.next;
            listLength++;
            
        }
        if (head.next == null) {
            
            return head.data;

        } else {
            for (int i = 0; i < (listLength - positionFromTail-1); i++) {
                head = head.next;
            }
        }
        
        return head.data;

        


    }

