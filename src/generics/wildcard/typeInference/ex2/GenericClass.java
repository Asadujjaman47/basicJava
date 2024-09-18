package generics.wildcard.typeInference.ex2;

public class GenericClass <X>{
    <T> GenericClass (T t) {
        System.out.println(t);
    }
}
