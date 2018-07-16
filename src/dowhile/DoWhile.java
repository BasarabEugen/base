package dowhile;/*
 * Created by BASARAB EUGEN on 16.07.2018
 */

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        do {
            System.out.println("Enter number 5");
            i = scanner.nextInt();
        } while (i != 5);
        System.out.println("You enter 5");
    }
}
