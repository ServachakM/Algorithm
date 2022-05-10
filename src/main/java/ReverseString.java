public class ReverseString {

    public String reverseString(String str){
        if(str != null && str.length() > 0){
            String strNew = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                strNew = strNew.concat(Character.toString(str.charAt(i)));
            }

            return strNew;
        }

        return "";
    }
}
