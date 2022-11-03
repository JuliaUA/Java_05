import java.util.Arrays;

public class SortArray {
    //12.Написать алгоритм SortArray, который принимает на вход массив целых чисел,
    // и сортирует элементы массива в порядке возрастания.
    public int[] sortArray(int[] array) {
        boolean isSorted = false;
        // пока у нас isSorted false мы будем выполнять условие
        while (!isSorted) {
        isSorted = true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                isSorted = false;
            }
        }
        }

        return array;
    }
}
