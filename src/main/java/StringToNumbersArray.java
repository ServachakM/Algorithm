public class StringToNumbersArray {

    public int[] stringToNumbers(String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > 0) {
                int count = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                        count++;
                    }

                }

                int[] result = new int[count];
                count = 0;

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                        result[count] = Integer.parseInt(
                                Character.toString(str.charAt(i)));
                        count++;
                    }
                }

                return result;
            }
        }

        return new int[]{};
    }
}
