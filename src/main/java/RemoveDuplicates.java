public class RemoveDuplicates {

    public static String removeDuplicates(String str) {
        if (str != null && str.length() > 0) {
            str = str.trim().toLowerCase();

            String newString = "";
            String strNew = "" + str.charAt(0);
            char[] arrNew = strNew.toCharArray();

            int k = 0;
            while (k < str.length()) {
                newString += str.charAt(k);
                strNew = newString;
                for (int i = k; i < str.length(); i++) {
                    if (strNew.charAt(k) != str.charAt(i)) {
                        strNew = strNew + str.charAt(i);
//                      strNew = newString + str.charAt(i);
                    }
                }

                str = strNew;
                k++;
            }
        }

        return str;
    }

    public String removeDuplicates2(String str) {
        if (str != null && str.length() > 0) {
            str = str.trim().toLowerCase();
            String strNew = "";
            char[] arr = str.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        arr[j] = 'D';
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] > 96 && arr[i] < 123) && arr[i] != 'D') {
                    strNew += arr[i];
                }
            }

            return strNew;
        }

        return "";
    }
}