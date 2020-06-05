

    // Complete the sortedInsert function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        if (head == null) {
            return null;
        }
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if (head.next == null) {

            return newNode.data >= head.data ? head : newNode;
        } else {
            DoublyLinkedListNode currentNode = head;
            if (newNode.data <= currentNode.data) {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            } else {
                while (currentNode != null) {
                    if (currentNode.next == null) {
                         currentNode.next= newNode;
                         newNode.prev = currentNode;
                         return  head;
                    }
                    if (newNode.data > currentNode.next.data) {
                        currentNode = currentNode.next;
                    } else {
                        newNode.next = currentNode.next;
                        currentNode.next = newNode;
                        newNode.prev = currentNode;
                        currentNode.next.prev = newNode;
                        return head;
                    }
                }
            }
        }
        return head;
    }

