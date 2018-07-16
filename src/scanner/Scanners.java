package scanner;/*
 * Created by BASARAB EUGEN on 16.07.2018
 */

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        System.out.println("Enter int number");
        Scanner scni = new Scanner(System.in);
        int i = scni.nextInt();
        System.out.println(i);
        System.out.println("Enter text");
        Scanner scnl = new Scanner(System.in);
        String l = scnl.nextLine();
        System.out.println(l);


    }
}
