package ClassAndObjects;/*
 * Created by BASARAB EUGEN on 16.07.2018
 */

public class ClassAndObjectsTest3 {
    public static void main(String[] args) {
        PersonaToReturn p1 = new PersonaToReturn();
        PersonaToReturn p2 = new PersonaToReturn();
        p1.name = "Bob";
        p2.name = "Lara";
        p1.age = 20;
        p2.age = 18;
        int year1 = p1.calculateToReturn();
        int year2 = p2.calculateToReturn();

        System.out.println("До пенсии "+ p1.name  + " осталось " + year1);
        System.out.println("До пенсии "+ p2.name  + " осталось " + year2);


    }
}

class PersonaToReturn {
    String name;
    int age;

    int calculateToReturn(){
        int years = 65 - age;
        return years;
    }
}
