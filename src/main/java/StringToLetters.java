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
                return  strNew;
            }
        }

        return "";
    }


//    public static void main(String[] args) {
//
//        System.out.println(stringToLetters("   1 bghj 1255vgh 12365 cghnn   "));
//        System.out.println(stringToLetters(" 12365479k  "));
//        System.out.println(stringToLetters(" 12KJKGHGFDHDTG3652345678#$%^&*()h(*&^%479k  "));
//    }
}
