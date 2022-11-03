public class SumOfTwo {
    //Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,
    // и число n. Алгоритм  возвращает пары элементов, которые в сумме дают число n.
    public int[][] sumOfTwo(int[] array, int numberN) {
        int countPairs = 0;
        for(int i = 0; i < array.length-1; i ++) {
            for(int j = 1; j < array.length; j++)
            if ((array[i] + array[j])  == numberN && (i < j)) {
                countPairs ++;
            }
        }
        int[][] newArray = new int[countPairs][2];
        int k = 0;
        for(int i = 0; i < (array.length-1) || k < countPairs ; i ++) {
            for(int j = 1; j < array.length; j++)
                if ((array[i] + array[j]) == numberN && (i < j)) {
                    newArray[k][0] = array[i];
                    newArray[k][1] = array[j];
                    k ++;
                }
        } return newArray;
    }
}
