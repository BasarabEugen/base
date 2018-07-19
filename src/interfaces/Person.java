package interfaces;/*
 * Created by BASARAB EUGEN on 18.07.2018
 */

public class Person implements Info{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is  " + this.name);
    }
}
