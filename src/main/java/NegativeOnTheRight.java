public class NegativeOnTheRight {
    //Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел,
    // и возвращает массив,  в котором все негативные числа находятся во второй половине массива
    // (массив не должен быть отсортирован)
    public int[] negativeOnTheRight(int[] array) {
        //считаем количество негативных чисел в массиве
        int countNegative = 0;
        for(int i = 0; i < array.length; i ++ ) {
            if (array[i] < 0) {
                countNegative ++;
            }
        }
        //creating new array
        int[] newArray = new int[array.length];
        int indexNegativeNumber = array.length - countNegative;
        int indexPositiveNumber = 0;
        for(int i = 0; i < newArray.length; i++) {

            if (array[i] < 0) {
                newArray[indexNegativeNumber] = array[i];
                indexNegativeNumber ++ ;
            } else {
                newArray[indexPositiveNumber] = array[i];
                indexPositiveNumber ++;
            }
        }

        return newArray;

    }
}
