// Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        if (magazine.length < note.length) {
            System.out.println("No");
            return;
        }

        if (Arrays.equals(magazine, note)) {
            System.out.println("Yes");
            return;
        }
        int matchesCount = 0;
        for (String s : note) {
            for (int j = 0; j < magazine.length; j++) {

                if (magazine[j] != null && s.equals(magazine[j])) {
                    matchesCount++;
                    magazine[j] = null;
                    break;
                }
            }
        }
        if (matchesCount == note.length) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }