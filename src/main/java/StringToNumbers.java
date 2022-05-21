public class StringToNumbers {

    public String stringToNumbers(String str){

        if(str != null){
            str =str.trim();
            String strNew = "";
            if(str.length() > 0){
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                        strNew = strNew + str.charAt(i);
                    }
                }

                return strNew;
            }
        }

        return "";
    }
}
