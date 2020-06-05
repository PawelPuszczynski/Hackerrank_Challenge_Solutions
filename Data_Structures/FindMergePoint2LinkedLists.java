

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1.next == null) return head1.data;
        if (head2.next == null) return head2.data;
        while (head1 != null) {
            SinglyLinkedListNode currentH2 = head2;
            while(currentH2 != null) {

                if (head1.next == currentH2.next) {
                    return head1.next.data;
                } else {
                    currentH2 = currentH2.next;
                }
            }
            head1 = head1.next;
        }
        return -1;


    }

