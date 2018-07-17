package string;/*
 * Created by BASARAB EUGEN on 17.07.2018
 */

public class SB {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Hello");
        sb.append(" my");
        sb.append(" friend \n");


        sb.append("Hello").append(" my").append(" girlfriend");
        System.out.println(sb.toString());

        System.out.printf("This is a string,%s,%5d", "Nice", 15);
        System.out.printf("\n %.3f", 2.32254);
    }
}
