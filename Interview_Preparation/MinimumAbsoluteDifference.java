// Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {
        
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = Math.abs(arr[i] - arr[i + 1]);
            if (temp < min) min = temp;
        }
        return min;

    }