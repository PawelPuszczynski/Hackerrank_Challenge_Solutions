    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();

            int tempResult = 0;
            int result = 0;
            int maxInt = 0;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                if (deque.isEmpty() || (!deque.contains(num))) maxInt++;
            deque.addLast(num);

            if (deque.size() == m) {

                tempResult = maxInt;
              
                int first = (int) deque.peekFirst();
                deque.removeFirst();
                if (!deque.contains(first))  maxInt--;

            }
            if (tempResult>result) result = tempResult;

            }
             System.out.println(result);
        }
    }



