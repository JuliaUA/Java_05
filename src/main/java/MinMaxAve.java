public class MinMaxAve {
    //8.Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и
    // 2 значения индексов. Алгоритм возвращает массив, который содержит минимальное значение,
    // максимальное значение,  и среднее среди всех значений между 2-мя индексами.

    public int[] minMaxAve(int[] array, int firstIndex, int secondIndex) {
        if(array.length >= 2 && firstIndex >= 0 && secondIndex >= 0 && firstIndex < secondIndex) {
            int[] arrayMinMaxAve = new int[3];
            int min = array[firstIndex];
            int max = array[secondIndex];
            int amount = 0;
            //int average = 0;
            for (int i = firstIndex; i <= secondIndex; i ++) {
                if(array[i] < min) {
                  min = array[i];
                }
                if(array[i] > max) {
                    max = array[i];
               }
                amount += array[i];
            }
            arrayMinMaxAve[0] = min;
            arrayMinMaxAve[1] = max;
            arrayMinMaxAve[2] = amount/(secondIndex-firstIndex+1);
            return arrayMinMaxAve;
        } else {

            return null;
        }
    }
}
