package java_utils;

import java.util.Arrays;

public class Utils {
    //печатать номер задания
    static int taskNumber = 1;

    public static void printTaskNumber() {
        System.out.println();
        System.out.println("************** Task # " + taskNumber + " ***************");
        System.out.println();
        taskNumber++;
    }

    //печатать номер тест кейса
    static int tcNumber = 1;

    public static void printTСNumber() {
        System.out.print("Test Case #  " + tcNumber + "\t\t-----   ");
        tcNumber++;
    }

    //проверка результатов в int
    public static String verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            return "\u001B[32m" + "Pass" + "\u001B[0m";
        } else return "\u001B[31m" + "Fail" + "\u001B[0m";
    }

    //проверка результатов в double
    public static String verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            return "\u001B[32m" + "Pass" + "\u001B[0m";
        } else return "\u001B[31m" + "Fail" + "\u001B[0m";
    }

    //проверка результатов в String
    public static String verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            return "\u001B[32m" + "Pass" + "\u001B[0m";
        } else return "\u001B[31m" + "Fail" + "\u001B[0m";
    }

    public static void printTestResults(int expectedResult, int actualResult) {
        System.out.println(verifyEquals(expectedResult, actualResult));
    }

    public static void printTestResults(double expectedResult, double actualResult) {
        System.out.println(verifyEquals(expectedResult, actualResult));
    }

    public static void printTestResults(String expectedResult, String actualResult) {
        System.out.println(verifyEquals(expectedResult, actualResult));
    }


    public static String buildSequence(int start, int end, int step) {
        if (step >= 0) {
            String result = "";
            if (start <= end) {
                for (int i = start; i <= end; i++) {
                    if (i % step == 0) {
                        result += i + " ";
                    }
                }
            } else {
                for (int i = start; i >= end; i--) {
                    if (i % step == 0) {
                        result += i + " ";
                    }
                }
            }

            return result;
        } else {

            return "Error";
        }
    }

    //Написать метод, который создает и печатает массив четных положительных чисел, значения которых не больше 6.
    // Заполняем значения и печатаем с помощью цикла for. Длина массива - l.
    public static int[] createArray(int l) {
        int[] array = new int[l];
        for (int i = 0; i < l; i++) {
            int randomNumber = (int) (Math.random() * 7);
            if (randomNumber % 2 == 0) {
                array[i] = randomNumber;
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    //22.Написать метод, который принимает на вход массив int, и печатает  среднее значение всех элементов массива.
    // Проверить работу метода, если параметр на вход - массив catsAges
    public static double findAverageNumberInArray(int[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }

        return average / (array.length);
    }

    //23.Создать массив всех нечетных отрицательных чисел в промежутке от (-1000 до -900).
    public static int[] createArray() {
//        int arrayLength=0;
//        for (int i=-1000; i<(-900);i++){
//            if((Math.abs(i))%2==1) {
//                arrayLength++;
//            }
//        }
//        System.out.println("Array length is " + arrayLength);
        int[] array = new int[50];
        int number = -999;
        int lastNumber = -900;
        for (int i = 0; i < array.length && number < lastNumber; i++) {
            array[i] = number;
            number += 2;
        }

        return array;
    }

    //24.Создать массив из 10 случайных положительных целых чисел в промежутке от 100 до 200.
    public static int[] createArrayRandomInt() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101 + 100);
        }

        return array;
    }

    //25.Написать метод, который принимает на вход массив int[] array и число int number.
    // Метод проверяет, содержится ли число number в массиве array.
    // При первом же нахождении числа number, метод печатает “yes”.
    // При каждом нахождении чисел на 1 больше числа number,  или на 1 меньше числа number, метод печатает “maybe”.
    // Метод печатает “no”, если не находит ни одного числа, соответствующего условиям.
    // Непонятное условие. Где написано, что выводить при повторном нахождении числа?
    public static void checkNumberInArray(int[] array, int number) {
        boolean isNumberInArray = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number && !isNumberInArray) {
                System.out.print("yes" + " ");
                isNumberInArray = true;
            } else if (array[i] == (number + 1) || array[i] == (number - 1) || array[i] == number) {
                System.out.print("maybe" + " ");
            } else {
                System.out.print("no" + " ");
            }
        }
    }

    //26.Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 24.
    public static void create2Arrays(int[] array) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        int[] arrayEven = new int[countEven];
        int[] arrayOdd = new int[countOdd];
        int j = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayEven[j] = array[i];
                j++;
            } else {
                arrayOdd[k] = array[i];
                k++;
            }
        }
        System.out.println("Массив четных " + Arrays.toString(arrayEven));
        System.out.println("Массив нечетных " + Arrays.toString(arrayOdd));
    }

    public static int[] sortArray(int[] array) {
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
