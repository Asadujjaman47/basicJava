package oop.inheritance;

public class Main {

    public static void main(String[] args) {

        // create an object of the subclass
        Dog dog = new Dog();

        // access field of subclass
        dog.name = "Husky";
        dog.display();

        // call method of superclass
        // using object of subclass
        dog.eat();
    }
}
