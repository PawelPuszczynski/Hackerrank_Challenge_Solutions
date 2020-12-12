// Complete the getMinimumCost function below.
    static int getMinimumCost(int k, int[] c) {
        
        Arrays.sort(c);

        int minCost = 0;
        int l = 0;

        for (int i = c.length - 1; i >= 0; ) {
            int j = k;
            while (i >= 0 && j > 0) {
                minCost += c[i] * (l + 1);
                i--;
                j--;
            }
            l++;
        }
        return minCost;


    }