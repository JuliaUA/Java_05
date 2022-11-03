public class ManipulationsWithArrays {
    //Для заданий 5-9 необходимо писать методы в классе ManipulationsWithArrays,
    // а тестовые методы в классе ManipulationsWithArraysTest
    //Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
    // Метод возвращает массив тех же чисел, умноженных на number
    //Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
    public int[] multiplуArrayByNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i ++) {
            array[i] = array[i] * number;
        }

        return array;
    }
    //Написать метод toDoubleArray(), который принимает на вход массив целых чисел,  и возвращает массив типа double[] из тех же чисел
    //Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
    public double[] toDoubleArray(int[] array) {
        double[] newArray = new double[array.length];
        if(array != null) {
            for (int i = 0; i < array.length; i ++) {
            newArray[i] = array[i];
            }
        } else {

            newArray = null;
        } return newArray;
    }
    //Написать метод toIntArray(), который принимает на вход массив типа double[],  и возвращает массив типа int[] из тех же чисел
    //Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}
    public int[] toIntArray(double[] array) {
        int[] newArray = new int[array.length];
        if(array != null) {
            for (int i = 0; i < array.length; i ++) {
                newArray[i] = (int) array[i];
            }
        } else {

            newArray = null;
        } return newArray;
    }

    //Написать метод toStringArray(), который принимает на вход массив целых чисел,
    // и возвращает массив типа String[] из тех же чисел (желательно не использовать метод .toString(),
    // нужно переводить вручную)
    //Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
    public String[] toStringArray(int[] array) {
        String[] newArray = new String[array.length];
        if(array != null) {
            for (int i = 0; i < array.length; i ++) {
                newArray[i] = String.valueOf(array[i]);
            }
        } else {

            newArray = null;
        } return newArray;
    }

    //Перегрузить метод toStringArray() параметром double[]. Этот метод должен возвращать массив типа String[]
    // (желательно не использовать метод .toString(), нужно переводить вручную)
    //Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}
    public String[] toStringArray(double[] array) {
        String[] newArray = new String[array.length];
        if(array != null) {
            for (int i = 0; i < array.length; i ++) {
                newArray[i] = String.valueOf(array[i]);
            }
        } else {

            newArray = null;
        } return newArray;
    }
}
