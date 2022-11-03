public class PeakElement {
    //10.Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и возвращает
    // значения пиковых элементов (элементы, которые больше своих соседей).
    public int[] peakElement(int[] array) {
        int lengthNewArray = 0;
        for(int i = 0; i < array.length; i ++) {
            if (i == 0 && array[i] > array[i+1]) {
                lengthNewArray ++;
            } else if (i > 0 && i < (array.length - 1) && array[i] > array[i-1] && array[i] > array[i+1]) {
                lengthNewArray++;
            } else if (i == (array.length-1) && array[i] > array[i - 1]) {
                lengthNewArray++;
            }
        }
        int[] newArray = new int[lengthNewArray];
        int k = 0;
        for(int i = 0; i < array.length; i ++) {
            if (i == 0 && array[i] > array[i+1]) {
                newArray[k] = array[i];
                k ++;
            } else if (i > 0 && i < (array.length - 1) && array[i] > array[i-1] && array[i] > array[i+1]) {
                newArray[k] = array[i];
                k ++;
            } else if (i == (array.length-1) && array[i] > array[i - 1]) {
                newArray[k] = array[i];
            }
        }

    return newArray;
    }
}
