public class StartsWithLetter {

    public String startsWithLetter(String text, String letter) {
        if (text != null && letter != null) {
            if (text.length() > 0 && letter.length() > 0) {
                text = text.replace(",", "").replace
                        (".", "").replace("\n", " ");
                String[] arr = text.split(" ");
                String result = "";
                for (int i = 0; i < arr.length; i++) {
                    if (letter.compareToIgnoreCase
                            (Character.toString(arr[i].charAt(0))) == 0) {
                        result = result.concat(arr[i]).concat(" ");
                    }
                }

                return result;
            }
        }

        return "";
    }
}
