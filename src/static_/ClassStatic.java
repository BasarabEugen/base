package static_;/*
 * Created by BASARAB EUGEN on 17.07.2018
 */

public class ClassStatic {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 21);
        Human h2 = new Human("Vasea", 28);
        h1.printCountHuman();
        h2.printCountHuman();
    }
}

class Human {
    private String name;
    private int age;
    public static int countHuman;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countHuman++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printCountHuman() {
        System.out.println("Count of human: " + countHuman);
    }
}
