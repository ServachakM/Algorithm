public class PeakElement {

    public static int[] peakElement(int[] array) {

        int[] result = {};
        int count = 0;

        if (array.length > 0) {
            if (array[0] > array[1] || array[array.length - 1]
                    > array[array.length - 2]) {
                count++;
            }
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    count++;
                }
            }
            if (count == 0) {

                return result;
            }
            result = new int[count];
            count = 0;
            for (int i = 0; i < array.length; ) {
                if (i == 0) {
                    if (array[i] > array[i + 1]) {
                        result[count] = array[i];
                        count++;
                        i++;
                    } else {
                        i++;
                    }
                } else if (i < array.length - 1 && array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    result[count] = array[i];
                    count++;
                    i++;
                } else if (i == array.length - 1) {
                    if (array[array.length - 1] > array[array.length - 2] && count < result.length) {
                        result[count] = array[array.length - 1];
                    }
                }
            }

            return result;
        }

        return result;
    }

    public int[] peakElement2(int[] arr) {
        int[] arr2 = new int[arr.length];
        int counter = 0;
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    if (arr[i] > arr[i + 1]) {
                        arr2[counter] = arr[i];
                        counter++;
                    }
                } else if (i == arr.length - 1) {
                    if (arr[i] > arr[i - 1]) {
                        arr2[counter] = arr[i];
                        counter++;
                    }
                } else if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                    arr2[counter] = arr[i];
                    counter++;
                }
            }
            int[] result = new int[counter];
            for (int i = 0; i < result.length; i++) {
                result[i] = arr2[i];
            }

            return result;
        }

        return new int[]{};
    }


    public static int getMaxValue(int index1, int index2) {
        return (index1 > index2) ? index1 : index2;
    }

    public static int getMaxValueNew(int index1, int index2) {
        return (index1 > index2) ? index1 : 0;
    }

    public int[] peakInNeighbourElement(int array[]) {
        int[] peakArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            if (i == 0) {
                if (getMaxValueNew(array[i], array[i + 1]) > 0) {
                    peakArray[i] = getMaxValueNew(array[i], array[i + 1]);
                }
            } else if (i > 0 && i < array.length - 1) {
                if (getMaxValueNew(array[i], array[i - 1]) > 0) {
                    peakArray[i] = getMaxValueNew(getMaxValue(array[i - 1], array[i]), array[i + 1]);
                }
            } else if (i == array.length - 1) {
                peakArray[i] = getMaxValueNew(array[i], array[i - 1]);
            }
        }
        return peakArray;
    }

    public int[] getElements(int array[]) {

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                counter++;
            }
        }

        int elements[] = new int[counter];
        counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                elements[counter] = array[i];
                counter++;
            }
        }
        return elements;
    }

}


