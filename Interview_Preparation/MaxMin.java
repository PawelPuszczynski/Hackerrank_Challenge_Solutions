// Complete the maxMin function below.
    static int maxMin(int k, int[] arr) {
        
        Arrays.sort(arr);

        int unfairMin = Integer.MAX_VALUE;
        int unfair;

        for (int i = 0; i <= arr.length - k; i++) {
            unfair = arr[i + k - 1] - arr[i];
            if (unfair < unfairMin) unfairMin = unfair;
        }

        return unfairMin;
    }
