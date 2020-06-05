

    // Complete the reverse function below.

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
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
       while (head != null) {
                DoublyLinkedListNode tempNext = head.next;
                if (head.prev == null) {
                    if (head.next == null) return head;
                    head.next = null;
                } else {
                    if (head.next == null) {
                        head.next = head.prev;
                        head.prev = null;
                        return head;
                    } else {
                        head.next = head.prev;
                        head.prev = tempNext;
                    }
                }
                head = tempNext;
            }
             return null;


    }

