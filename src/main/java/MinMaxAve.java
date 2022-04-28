public class MinMaxAve {

    public int[] minMaxAve(int[] array, int start, int end){
        if(array.length > 0 && start >= 0 && end < array.length
                && start <= end){
            int min = Integer.MAX_VALUE;
            for (int i = start; i <= end; i++) {
                if(min > array[i]){
                    min = array[i];
                }
            }
           int max = min;
            for (int i = start; i <= end; i++) {
                if(max < array[i]){
                    max = array[i];
                }
            }
            int ave = 0;

            for (int i = start; i <= end ; i++) {
                if(array[i] == Integer.MAX_VALUE || array[i] == Integer.MIN_VALUE){
                   return new int[]{};
                }

//              if(array[i] == Integer.MAX_VALUE) {
//                  ave = Integer.MAX_VALUE;
//
//              } else if(ave == Integer.MIN_VALUE) {
//                  ave = Integer.MIN_VALUE;
//                  break;
//              } else{

                  ave += array[i];
            }
            ave = ave / ((end - start) + 1);

            return new int[]{min, max, ave};
        }
        return new int[]{};
    }


}
