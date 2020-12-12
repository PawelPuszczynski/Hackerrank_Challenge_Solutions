// Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] > o2[1]) return 1;
                if (o1[1] < o2[1]) return -1;
                return Integer.compare(o1[0], o2[0]);
            }
        };
        Arrays.sort(contests, comparator);

        int sum = 0;
        int i = 0;
        while (i<contests.length && contests[i][1] == 0) {
            sum += contests[i][0];
            i++;
                    }
        while (i < contests.length - k) {
            sum -= contests[i][0];
            i++;
                    }
        while (i < contests.length) {
            sum += contests[i][0];
            i++;
                }
        
        return sum;


    }
