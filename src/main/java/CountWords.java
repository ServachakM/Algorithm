public class CountWords {

    public int countWords(String text, String word) {
        if (text != null && word != null) {
            text = text.toLowerCase().replace(",", "").
                    replace(".", "");
            word = word.toLowerCase();

            String[] arr = text.split(" ");
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(word)) {
                    count++;
                }
            }

            return count;
        }

        return Integer.MIN_VALUE;
    }
}