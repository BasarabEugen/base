package switch_;/*
 * Created by BASARAB EUGEN on 16.07.2018
 */

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scn.nextInt();
        switch (age){
            case 0:
                System.out.println("You boorn");
                break;
            case 7:
                System.out.println("You finished PlayGround");
                break;
            case 18:
                System.out.println("You finished scool");
                break;
                default:
                    System.out.println("LaVitaBelle");
        }
    }
}
