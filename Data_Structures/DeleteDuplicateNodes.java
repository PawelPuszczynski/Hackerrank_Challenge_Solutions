

    // Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        if (head == null) {
            return null;
        } else {
            SinglyLinkedListNode tempHead = head;

            while (head.next != null) {
               
                if (head.data == head.next.data) {
                    SinglyLinkedListNode tempDuplicate = head.next;

                    while (tempDuplicate.data == head.data) {
                        if (tempDuplicate.next != null) {
                            tempDuplicate = tempDuplicate.next;
                        } else {
                            head.next = null;
                            return tempHead;
                        }
                    }
                    head.next = tempDuplicate;
                }
                head = head.next;
            }
            return tempHead;
        }

    }

