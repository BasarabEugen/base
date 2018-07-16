package arrays;/*
 * Created by BASARAB EUGEN on 16.07.2018
 */

public class Array {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {   // проход по масиву
            array1[i] = i + 1;                      // заполнения массива
        }
        for (int i = 0; i < array1.length; i++) {   // проход по масиву
            System.out.println(array1[i]);          // вывод на печать
        }

        int[] array2 = {3, 2, 8, 6, 5};
        System.out.println("Array2");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }
}
