

    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
          if (llist == null) {
            
            llist = new SinglyLinkedListNode(data);
           
            return llist;
        } else {
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            newNode.next = llist;
           
            return newNode;
        }


    }

