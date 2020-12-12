// Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);

        int countMax = 0;
        int l = prices.length;

        for (int i = 0; i < l; i++) {
            if (prices[i] > k) continue;
            int count = 1;
            int sum = prices[i];
            int j = i + 1;

            while (j < l && sum + prices[j] <= k) {
                sum += prices[j];
                count++;
                j++;
            }

            if (count > countMax) countMax = count;
        }

        return countMax;



    }
