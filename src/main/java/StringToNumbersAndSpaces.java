public class StringToNumbersAndSpaces {

    public String stringToNumbersAndSpaces(String str){

        if(str != null){
            String strNew = "";
            if(str.length() > 0){
                for (int i = 0; i < str.length(); i++) {
                    if(str.charAt(i) > 47 && str.charAt(i) < 58
                            || str.charAt(i) == 32){
                        strNew = strNew + (str.charAt(i));
                    }

                }

                return strNew;
            }
        }

        return "";
    }
}
