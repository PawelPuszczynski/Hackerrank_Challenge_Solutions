// Complete the substrCount function below.
    static long substrCount(int n, String s) {
        long patternCount = 0;
        int offset;

        Pattern pattern = Pattern.compile("([a-z])((\\1)+)");
        Pattern pattern2 = Pattern.compile("([a-z])(\\1*)(?!\\1)([a-z])(\\1)(\\2)");

        Matcher matcher = pattern.matcher(s);
        Matcher matcher2 = pattern2.matcher(s);

        while (matcher.find()) {
            int multiplication = 1;
            int length = matcher.end() - matcher.start();

            for (int i = 1; i < length; i++) {
                patternCount += multiplication;
                multiplication++;
            }
        }
        for (int i = 0; i < s.length(); i = offset) {
            matcher2.region(i, matcher2.regionEnd());
            if (matcher2.find()) {
                offset = matcher2.start() + 1;
                matcher2.reset();
                patternCount++;
            } else break;
        }
        return s.length() + patternCount;


    }