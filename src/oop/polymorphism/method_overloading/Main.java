package oop.polymorphism.method_overloading;

public class Main {

    public static void main(String[] args) {
        Pattern d1 = new Pattern();

        // call method without any argument
        d1.display();
        System.out.println("\n");

        // call method with a single argument
        d1.display('#');
        System.out.println("\n");
    }
}
