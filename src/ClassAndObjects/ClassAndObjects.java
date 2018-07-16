package ClassAndObjects;/*
 * Created by BASARAB EUGEN on 16.07.2018
 */

public class ClassAndObjects {
    public static void main(String[] args) {
        Person persona1 = new Person();
        persona1.name = "Alex";
        persona1.age = 30;
        System.out.println("My name " + persona1.name + " i have " + persona1.age + " years");
    }
}

class Person {
    String name;
    int age;
}