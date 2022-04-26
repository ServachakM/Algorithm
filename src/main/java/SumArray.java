public class SumArray {

    public int sumArray(int[] array){
        int sum = 0;
        if(array.length > 0){
            for (int i = 0; i < array.length; i ++) {
                sum += array[i];
            }
        } else {
            return Integer.MIN_VALUE;
        }

        return sum;
    }



}
