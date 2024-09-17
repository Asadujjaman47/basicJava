package oop.abstraction.Interface.ex1;

public class A6 implements printable{

    @Override
    public void print() {
        System.out.println("Hello from A6");
    }

    public static void main(String[] args) {
        A6 obj = new A6();
        obj.print();
    }
}
