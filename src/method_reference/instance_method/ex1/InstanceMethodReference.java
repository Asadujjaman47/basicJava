package method_reference.instance_method.ex1;

public class InstanceMethodReference {
    public void saySomething() {
        System.out.println("Hello, this is non-static method.");
    }

    public static void main(String[] args) {
        InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object
        // Referring non-static method using reference
        Sayable sayable = methodReference::saySomething;

        // Calling interface method
        sayable.say();

        // Referring non-static method using anonymous object
        Sayable sayable2 = new InstanceMethodReference()::saySomething;
        sayable2.say();
    }
}
