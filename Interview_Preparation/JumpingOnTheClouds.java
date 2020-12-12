
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        if (c.length == 2) return 1;
        int jumps = 0;
        int i = 0;

        while (i < c.length - 2) {
            if (c[i + 2] == 0) {
                i += 2;

            } else {
                i++;
            }
            jumps++;
        }
        if (i == c.length - 2) jumps++;
        
        return jumps;

    }

