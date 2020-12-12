// Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);
        HashMap<Character, Integer> ht1 = new HashMap<>();
        HashMap<Character, Integer> ht2 = new HashMap<>();

        for (int i = 0; i < aChars.length; i++) {
            int count = 1;
            while (i < aChars.length - 1 && aChars[i + 1] == aChars[i]) {
                count++;
                i++;
            }
            ht1.put(aChars[i], count);
        }
        for (int i = 0; i < bChars.length; i++) {
            int count = 1;
            while (i < bChars.length - 1 && bChars[i + 1] == bChars[i]) {
                count++;
                i++;
            }
            ht2.put(bChars[i], count);
        }
       
        for (Character c : ht1.keySet()) {
            if (ht2.containsKey(c)) {
                if (ht2.get(c) < ht1.get(c)) ht1.put(c, ht2.get(c));
            } else {
                ht1.put(c, 0);
            }
        }

        int intersectionChars = 0;
        for (Integer i : ht1.values()
        ) {
            intersectionChars += i;
        }

        return aChars.length + bChars.length - intersectionChars * 2;
        


    }
