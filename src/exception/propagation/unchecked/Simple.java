package exception.propagation.unchecked;

// Java program to illustrate
// unchecked exception propagation
// without using throws keyword
public class Simple {
    void m() {
        int data = 50 / 0; // unchecked exception occurred
        // exception occurred to n()
    }

    void n() {
        m();
        // exception propagated to p()
    }

    void p() {
        try {
            n(); // exception handled
        }
        catch (Exception e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        Simple obj = new Simple();
        obj.p();
        System.out.println("Normal flow...");
    }
}
