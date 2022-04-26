public class OddIndices {
    
    public int[] oddIndices(int[] array){

        int count = 0;
        if(array.length > 0){
            for (int i = 0; i < array.length; i++) {
                if(i % 2 != 0){
                    count++;
                }
            }
        } else {
            return new int[]{};
        }
        int[] arrayResult = new int[count];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                if (count < arrayResult.length) {
                    arrayResult[count] = array[i];
                    count++;
                }
            }
        }
        return arrayResult;
    }

//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(oddIndices(new int[]{})));
//    }




}
