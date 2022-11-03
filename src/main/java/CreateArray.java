import org.checkerframework.checker.units.qual.C;

import java.util.Arrays;

public class CreateArray {
    //Методы и тесты из заданий 1-4 писать в классах - CreateArray и CreateArrayTest.
    //В голубой папке java создать класс CreateArray, написать в этом классе метод createIntArray(), который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел.
    //Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
    public int[] createIntArray(int one, int two, int three, int four, int five) {
        return new int[]{one, two, three, four, five};
    }

    //Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double, и возвращает массив из этих же чисел
    // Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}4
    public double[] createDoubleArray(double one, double two, double three, double four, double five) {

        return new double[]{one, two, three, four, five};
    }

    //Написать метод createStringArray(), который принимает на вход 5 слов, и возвращает массив из этих слов
    //Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
    public String[] createStringArray(String one, String two, String three, String four, String five) {

        return new String[]{one, two, three, four, five};
    }
    //4я задача только для тех, кто хочет разобраться с методом класса String split()
    //Написать метод createArrayFromText(), который принимает на вход предложение из нескольких слов
    // и возвращает массив из этих слов.
    //Например,
    // createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
    public String[] createArrayFromText(String text) {

        return text.split(" ");
    }
    //В классе CreateArray написать метод createIntArrayFromText(),
    // который принимает на вход строку чисел (н-р, “3 4 1 8 10 12.3”)
    // и возвращает массив типа int[] из этих чисел. (vожно использовать split() или toCharArray())
    public int[] createIntArrayFromText(String text) {
        String[] arrayString = text.split(" ");
        int[] arrayInt = new int[arrayString.length];
        for(int i = 0; i < arrayString.length; i ++ ){
            arrayInt[i] = (int) Double.parseDouble(arrayString[i]);
        }

        return arrayInt;
    }
}
