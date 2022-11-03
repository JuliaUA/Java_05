public class OddEvenValuesInArray {
    //Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел,
    // и возвращает количество четных чисел в этом массиве
    public int countEvenValuesInArray(int[] array) {
        int counter = 0;
        if (array != null) {
            for(int i = 0; i < array.length; i++) {
                if(array[i]%2 == 0) {
                    counter ++;
                }
            }
        }

        return counter;
    }
    //Написать метод countOddValuesInArray(), который принимает на вход массив целых чисел,
    // и возвращает количество нечетных чисел в этом массиве
    public int countOddValuesInArray(int[] array) {
        int counter = 0;
        if (array != null) {
            for(int i = 0; i < array.length; i++) {
                if(array[i]%2 != 0) {
                    counter ++;
                }
            }
        }

        return counter;
    }
    //В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(),
    // который принимает на вход массив целых чисел и число number.
    // Метод возвращает значение true, если все элементы массива больше number, иначе возвращает false
    public boolean areValuesGreaterThanNumber(int[] array, int number) {
        boolean result = false;
        for(int i = 0; i < array.length; i ++) {
            if(array[i] > number) {
                result = true;
            } else {
                result = false;
                break;
            }
        }

        return result;
    }
    //В классе OddEvenElementsInArray написать метод countOddEvenValuesInArray(),
    // который принимает на вход массив целых чисел и возвращает массив int[2],
    // который содержит количество четных и нечетных элементов входящего массива
    public int[] countOddEvenValuesInArray(int[] array) {
    return new int[]{};
    }
     //
    //В классе OddEvenElementsInArray написать метод createOddEvenArray(),
    // который принимает массив целых случайных чисел, и возвращает двумерный массив
    // (массив четных и массив нечетных чисел)
}
