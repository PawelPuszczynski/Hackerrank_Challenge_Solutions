// Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        
        String shorterString;
        String longerString;

        if (s1.length() <= s2.length()) {
            shorterString = s1;
            longerString = s2;
        } else {
            shorterString = s2;
            longerString = s1;
        }
        Set<Character> shortSet = new HashSet<>();
        for (int i =0; i<shorterString.length(); i++) {
            shortSet.add(shorterString.charAt(i));
        }
        Set<Character> longSet = new HashSet<>();
        for (int i =0; i<longerString.length(); i++) {
            longSet.add(longerString.charAt(i));
        }

        for (Character c: longSet
             ) {
            if (!shortSet.add(c)) {
                return "YES";
            }
        }
        return "NO";


    }