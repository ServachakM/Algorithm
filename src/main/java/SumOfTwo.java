public class SumOfTwo {

    public int[][] sumOfTwo(int[] array, int n) {

        int countI = 0;
        int countJ = 2;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {

                    if (array[i] + array[j] == n) {
                        countI++;
                    }
                }
            }

            int[][] resultNew = new int[countI][countJ];

            countI = 0;
            countJ = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {

                    if (array[i] + array[j] == n) {
                        resultNew[countI][countJ] = array[i];
                        countJ++;
                        resultNew[countI][countJ] = array[j];
                        countI++;
                        countJ = 0;
                    }
                }
            }

            return resultNew;
        }

        return new int[][]{};
    }
}
