package stream_api.misc.e.sum_collectors_method;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {
    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<>();

        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2,"Dell Laptop",30000));
        productsList.add(new Product(3,"Lenevo Laptop",28000));
        productsList.add(new Product(4,"Sony Laptop",28000));
        productsList.add(new Product(5,"Apple Laptop",90000));

        // Using Collector's method to sum the prices.
        double totalPrice = productsList.stream()
                .collect(Collectors.summingDouble(product -> product.price));

        System.out.println("Total price: " + totalPrice);
    }
}
