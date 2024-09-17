package oop.abstraction.abstractClass;

public class Main {

    public static void main(String[] args) {

        MotorBike m1 = new MountainBike();
        m1.brake();

        SportsBike s1 = new SportsBike();
        s1.brake();
    }
}
