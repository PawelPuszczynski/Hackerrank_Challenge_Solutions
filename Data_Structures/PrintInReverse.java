

    // Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {
        Stack<Integer> intStack = new Stack<>();
            while (head !=null) {
                intStack.push(head.data);
                head = head.next;
            }
            while (!intStack.isEmpty()){
                System.out.println(intStack.pop());
            }
        
    }

