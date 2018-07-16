package if_;/*
 * Created by BASARAB EUGEN on 16.07.2018
 */

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();

        if(i < 15){
            System.out.println(i + " < 15");
        } else if(i>15){
            System.out.println(i + " > 15");
        }else{
            System.out.println(i + " = 15");
        }
    }
}
