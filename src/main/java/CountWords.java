public class CountWords {

    public static int countWords(String text, String word) {
        if (text != null && word != null) {
            text = text.toLowerCase();
            word = word.toLowerCase();
            text = text.replace(",", "").replace(".", "");
            String[] arr = text.split(" ");
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i].equals(word)){
                    count++;
                }
            }

            return count;
        }

        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        String text = "As of March 2022, version Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades";
        String text2 = "bvg nvj./,kj lkhliug  ,m;lklk java. bhgj hg";
        System.out.println(countWords(text, "version"));

    }


}
