import java_utils.Utils;

public class KthLargest {
    //Написать алгоритм KthLargest, который принимает на вход массив целых чисел и число k,
    // и возвращает k-тый максимальный элемент.
    public int kthLargest(int[] array, int numberK) {
    if(numberK > 0 && array.length >= numberK) {
        int[] sortedArray = Utils.sortArray(array);
        int result = sortedArray[sortedArray.length-numberK];
        return result;
    } else {
        return 0;
    }
    }
}
