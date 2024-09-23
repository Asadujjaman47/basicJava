package stream_api.misc.c.filtering;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample {
    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<>();

        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2,"Dell Laptop",30000));
        productsList.add(new Product(3,"Lenevo Laptop",28000));
        productsList.add(new Product(4,"Sony Laptop",28000));
        productsList.add(new Product(5,"Apple Laptop",90000));

        // This is more compact approach for filtering data
        productsList.stream()
                .filter(product -> product.price == 30000)
                .forEach(product -> System.out.println(product.name));
    }
}
