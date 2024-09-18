package generics.genericClass;

public class TestGenerics3 {
    public static void main(String[] args) {
        MyGen<Integer> m = new MyGen<Integer>();
        m.add(2);

//        m.add("asad"); // Compile time error
        System.out.println(m.get());
    }
}
