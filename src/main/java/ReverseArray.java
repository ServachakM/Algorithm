public class ReverseArray {

    public int[] reverseArray(int[] array){
       int[] result = {};
        if(array.length > 0){
            result = new int[array.length];
            int count = 0;
            for (int i = array.length - 1; i > -1; i--) {
               result[count] = array[i];
               count++;
            }
        }

        return result;
    }


}
