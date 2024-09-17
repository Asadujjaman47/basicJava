package oop.abstraction.Interface.ex2;

public class Main {

    public static void main(String[] args) {
        Triangle t1 = new Triangle(2, 3, 4);

        // calls the method of the Triangle class
        t1.getArea();

        // calls the method of Polygon
        t1.getPerimeter(2, 3, 4);
    }
}
