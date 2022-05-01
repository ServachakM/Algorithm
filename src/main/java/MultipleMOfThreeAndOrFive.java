public class MultipleMOfThreeAndOrFive {

    public String multipleMOfThreeAndOrFive(int m){
        String good = "Good Number";
        String bad = "Bad Number";
        String poor = "Poor Number";
        String nothing = "-1";

        if(m % 3 == 0 && m % 5 == 0){

            return good;
        } else if(m % 3 == 0){

            return bad;
        } else if(m % 5 == 0){

            return poor;
        } else {

            return nothing;
        }
    }

 }
