package oop.abstraction.Interface.ex2;

public class Triangle implements Polygon{

    private int a, b, c;
    private double s, area;

    // initialize sides of a triangle
    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }

    // calculate the area of a triangle
    public void getArea() {
        s = (double) (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of the triangle is " + area);
    }
}
