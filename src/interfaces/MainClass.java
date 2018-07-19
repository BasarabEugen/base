package interfaces;/*
 * Created by BASARAB EUGEN on 18.07.2018
 */

public class MainClass {
    public static void main(String[] args) {
        Info info1 = new Animal(2);
        Info info2 = new Person("Vasea");

        Animal animal = new Animal(1);
        Person person = new Person("Bob");
        animal.sleep();
        person.sayHello();
        animal.showInfo();
        person.showInfo();
        info1.showInfo();
        info2.showInfo();
    }
}
