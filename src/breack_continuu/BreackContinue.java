package breack_continuu;/*
 * Created by BASARAB EUGEN on 16.07.2018
 */

public class BreackContinue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 11) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("out");

        for (int j = 0; j < 15; j++) {
            if (j % 2 == 0) {
                continue;
            }
            System.out.println("this is not even numbers " + j);
        }
    }
}
