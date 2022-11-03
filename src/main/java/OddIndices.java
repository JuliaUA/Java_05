public class OddIndices {
    //2.Написать алгоритм OddIndices, который принимает массив целых чисел,
    // и возвращает массив значений нечетных индексов
    public int[] oddIndices(int[] array) {
        int[] arrayOddIndices = new int[(array.length)/2];
        if(!array.equals(null)) {
            int j = 0;
            for (int i = 0; i < array.length && j<arrayOddIndices.length; i ++) {
                if(i%2 != 0) {
                    arrayOddIndices[j] = array[i];
                    j++;
                }
            }
        } else {
            arrayOddIndices = null;
        }

        return arrayOddIndices;
    }
}
