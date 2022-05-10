public class StringToLettersAndSpaces {

    public String stringToLettersAndSpaces(String str) {

        if (str != null) {

            if (str.length() > 0) {
                String strNew = "";
                char[] arr = str.toCharArray();

                for (int i = 0; i < arr.length; i++) {
                    if ((arr[i] > 64 && arr[i] < 91)
                            || (arr[i] > 96 && arr[i] < 123) || arr[i] == 32) {
                        strNew = strNew + arr[i];
                    }
                }

                return  strNew;
            }
        }

        return "";
    }
}
