

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        List<Integer> sockList = new ArrayList<>();
        int sumOfPairs = 0;
        for (int i: ar) {
            sockList.add(i);
        }
        for (int i =0; i < sockList.size(); i++) {
            Integer tempSock = sockList.get(i);
            sockList.remove(i);
            i = 0; 
            if (sockList.contains(tempSock)) {
             sockList.remove(tempSock);
              sumOfPairs++;
                
                }
        }
        
        return sumOfPairs;

    }