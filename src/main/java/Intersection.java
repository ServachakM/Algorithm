import java.util.Arrays;

public class Intersection {

    public int[] intersection(int[] array, int[] array2) {
        int[] result = {};
        int count = 0;
        if(array.length > 0 && array2.length > 0) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array[i] == array2[j]) {
                        count++;
                    }
                }
            }
        } else {
            return new int[]{Integer.MIN_VALUE};
        }
        result = new int[count];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j] && array[i] != Integer.MAX_VALUE) {
                    if (count < array.length && count < array2.length) {
                        result[count] = array[i];
                        count++;
                    }
                }
            }
        }
        return result;
    }

    public int[] intersection2(int[] arr, int[] arr2){
        int[] result = new int[arr.length * arr2.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr[i] == arr2[j] && result[k] != arr[i]){
                    result[k] = arr[i];
                } else {
                    result[k] = Integer.MAX_VALUE;
                }
                k++;
            }
        }

        k = 0;
        Arrays.sort(result);

        for (int i = 0; i < result.length - 1; i++) {
            if(result[i] != Integer.MAX_VALUE) {
               if( result[i] != result[i + 1]){
                   k++;
               }
           }
        }

        int[] res = new int[k];
        k = 0;
        for (int i = 0; i < result.length - 1; i++) {
            if(result[i] != Integer.MAX_VALUE) {
                if( result[i] != result[i + 1]){
                    res[k] = result[i];
                    k++;
                }
            }
        }

        return res;
    }

    public int[] intersection3(int[] arr, int[] arr2){

        if(arr.length > 0 && arr2.length > 0){
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                   if(arr[i] == arr[j]){
                       arr[j] = Integer.MIN_VALUE;
                   }
                }
            }

            for (int i = 0; i < arr2.length; i++) {
                for (int j = i + 1; j < arr2.length ; j++) {
                    if(arr2[i] == arr2[j]){
                        arr2[j] = Integer.MIN_VALUE;
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if(arr2[j] == arr[i] && arr[i] != Integer.MIN_VALUE && arr2[j] != Integer.MIN_VALUE){
                        count++;
                    }
                }
            }
            if(count > 0){
                int[] result = new int[count];
                count = 0;
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr2.length; j++) {
                        if(arr2[j] == arr[i] && arr[i] != Integer.MIN_VALUE
                                && arr2[j] != Integer.MIN_VALUE){
                            if(count < result.length) {
                                result[count] = arr[i];
                                count++;
                            }
                        }
                    }
                }

                return result;
            } else {

                return new int[]{};
            }
        } else {

            return new int[]{Integer.MAX_VALUE};
        }
    }


}