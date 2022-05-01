public class OddEven {

    public String oddEven(long a) {

        if (a <= Integer.MAX_VALUE && a >= Integer.MIN_VALUE) {
            if (a % 2 != 0) {

                return  "Odd";
            } else {

                return  "Even";
            }
        }

        return  "Undefined";
    }


}
