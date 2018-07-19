package interfaces;/*
 * Created by BASARAB EUGEN on 18.07.2018
 */

public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep(){
        System.out.println("i sleeping ");
    }

    @Override
    public void showInfo() {
        System.out.println("ID is"+ this.id);
    }
}
