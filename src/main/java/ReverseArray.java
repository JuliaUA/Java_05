public class ReverseArray {
    //11. Написать алгоритм ReverseArray, который принимает на вход массив целых чисел,
    // и возвращает “перевернутый” массив.
    public int[] reverseArray(int[] array) {
        int newArrayLength = array.length;
        int[] newArray = new int[newArrayLength];
        for (int i = 0; i< array.length; i ++) {
            newArray[newArrayLength-1] = array[i];
            newArrayLength --;
        }

        return newArray;
    }
}
