

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if (head == null) {
            head = new SinglyLinkedListNode(data);
           
        }
        else {
            SinglyLinkedListNode currentNode = head;

            while (currentNode.next != null) {
               currentNode = currentNode.next;
            }

            currentNode.next = new SinglyLinkedListNode(data);
           
        }
        
        return head;

    }

