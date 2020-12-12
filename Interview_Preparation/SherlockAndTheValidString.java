
    // Complete the isValid function below.
    static String isValid(String s) {
        
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        boolean isFirstChar = true;
        int count;
        int baseCount = 1;
        int peak = 0;

        for (int i = 0; i < chars.length; i++) {
            count = 1;

            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            if (isFirstChar) {
                baseCount = count;
                isFirstChar = false;
            }
            if (baseCount != count) {
                peak++;
            }
            if (peak > 1) return "NO";
           
        }
        return "YES";


    }