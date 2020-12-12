

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        char [] chars = s.toCharArray();
        int alt = 0;
        int valleyCount = 0;
        for (int i = 0; i< n-1; i++) {
            if (alt == 0 && chars[i] =='D') valleyCount++;
            if (chars[i] == 'U'){
                alt++;
            } else {
                alt--;
            }
        }
        return valleyCount;
    }