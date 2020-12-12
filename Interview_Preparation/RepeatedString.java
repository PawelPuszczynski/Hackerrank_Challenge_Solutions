// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
         
        if (s.equals("a")) return n;

        long result;
        int numOfAsReg = 0;
        int numOfAsRemainder = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                numOfAsReg++;
                if (i < n % s.length()) numOfAsRemainder++;
            }
        }
        result = (numOfAsReg * (n / s.length())) + numOfAsRemainder;

        return result;


    }