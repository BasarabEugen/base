package final_;/*
 * Created by BASARAB EUGEN on 17.07.2018
 */

public class FinalClass {
    public static void main(String[] args) {
        double m = 50;
        System.out.println(m * Test.G);
    }
}

class Test {
    public static final double G = 9.80665;
}