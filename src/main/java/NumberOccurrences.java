import java_utils.Utils;
import org.checkerframework.checker.units.qual.A;

import java.util.Arrays;

public class NumberOccurrences {
    //15.Написать алгоритм NumberOccurrences,  который принимает на вход массив целых чисел,
    // и возвращает массив пар
    //{число, сколько раз число встречается в массиве}
//Test Data:
//{3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} →
//{{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}
    public static void main(String[] args) {
        NumberOccurrences nm = new NumberOccurrences();
        int[] array = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
        nm.numberOccurrences(array);
    }

    public int[][] numberOccurrences(int[] array) {
        int[] sortedArray = Utils.sortArray(array);
        System.out.println(Arrays.toString(sortedArray));
        int countPairs = 1;
        for(int i = 0; i < array.length-1; i ++) {
            if(array[i] != array[i+1]) {
                countPairs++;
                System.out.println("pairs occurs " + countPairs);
            }
        }
        int[][] newArray = new int[countPairs][2];
        int countElement = 1;
        int j = 0;
        for(int i = 0; i < array.length - 1; i ++ ) {
            if(array[i] == array[i+1]) {
                newArray[j][0] = array[i];
                newArray[j][1] = countElement;
                System.out.println("newArray[" + j + " ][0]" + newArray[j][0]);
                System.out.println("newArray[" + j + "][1]" + newArray[j][1]);
                countElement++;
                j++;

            }
        }
        return newArray;
        }

}
