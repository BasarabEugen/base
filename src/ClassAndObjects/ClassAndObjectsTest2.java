package ClassAndObjects;/*
 * Created by BASARAB EUGEN on 16.07.2018
 */

public class ClassesAndObjectsTest2 {
    public static void main(String[] args) {
        PersonaNonGrata p1 = new PersonaNonGrata();
        PersonaNonGrata p2 = new PersonaNonGrata();
        p1.name = "Bob";
        p2.name = "Lara";
        p1.age = 20;
        p2.age = 18;
        p1.speak();
        p2.sayHello();
    }
}

class PersonaNonGrata {
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 1; i++) {
            System.out.println("My name " + name + " i have " + age + " years");
        }
    }

    void sayHello() {
        System.out.println("Hello");
    }
}
