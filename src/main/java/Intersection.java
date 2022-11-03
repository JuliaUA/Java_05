import java.util.Arrays;

public class Intersection {
    //Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел
    // и возвращает массив общих элементов.
    public int[] intersection(int[] firstArray, int[] secondArray) {
        if (firstArray != null && secondArray != null) {
            int lengthNewArray=0;
            for (int i = 0; i < firstArray.length; i++) {
                for (int j = 0; j < secondArray.length; j++) {
                    if (firstArray[i] == secondArray[j]) {
                        lengthNewArray ++;
                    }
                }
            }
            int[] newArray = new int[lengthNewArray];
            int k = 0;
            for (int i = 0; i < firstArray.length; i++) {
                for (int j = 0; j < secondArray.length; j++) {
                    if (firstArray[i] == secondArray[j]) {
                        newArray[k] = firstArray[i];
                        k ++;
                    }
                }
            }

            return newArray;
        } else {

            return new int[]{};
        }
    }
}
