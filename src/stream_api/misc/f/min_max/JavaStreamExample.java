package stream_api.misc.f.min_max;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();

        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2, "Dell Laptop", 30000));
        productsList.add(new Product(3, "Lenovo Laptop", 28000));
        productsList.add(new Product(4, "Sony Laptop", 28000));
        productsList.add(new Product(5, "Apple Laptop", 90000));

        // max() method to get max Product price
        Product productA = productsList.stream()
                .max((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
        System.out.println(productA.price);

        // min() method to get min Product price
        Product productB = productsList.stream()
                .min((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
        System.out.println(productB.price);
    }

}
