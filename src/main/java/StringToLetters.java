public class StringToLetters {

    public String stringToLetters(String str) {

        if (str != null) {
            str = str.trim();
            if (str.length() > 0) {
                String strNew = "";
                char[] arr = str.toCharArray();

                for (int i = 0; i < arr.length; i++) {
                    if ((arr[i] > 64 && arr[i] < 91) || (arr[i] > 96 && arr[i] < 123)) {
                        strNew = strNew + arr[i];
                    }
                }

                // strNew = str.replaceAll("[0-9]","");
                return strNew;
            }
        }

        return "";
    }
}



