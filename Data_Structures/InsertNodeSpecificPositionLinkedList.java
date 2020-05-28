

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        if (head == null) {
            head = new SinglyLinkedListNode(data);

        } else {
            SinglyLinkedListNode currentNode = head;
            for (int i =0; i< position-1; i++){
                currentNode = currentNode.next;
            }
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            if (position==0) head = newNode;
           
        }
        return head;


    }

