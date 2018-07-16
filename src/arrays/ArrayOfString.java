package arrays;/*
 * Created by BASARAB EUGEN on 16.07.2018
 */

public class ArrayOfString {
    public static void main(String[] args) {
        {
            int[] numbers = new int[5];
            numbers[0] = 10;
            System.out.println(numbers[0]);
            System.out.println(numbers[1]);
        }
        {
            int[] num1 = {1, 2, 3};
            int sum = 0;
            for (int x : num1) {
                sum = sum + x;
            }
            System.out.println("sum " + sum);
        }

        String[] str = new String[3];
        str[0] = "HELLO ";
        str[1] = "BYE";
        str[2] = "Java";

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println();
        for (String string : str) {
            System.out.println(string);
        }

    }
}
