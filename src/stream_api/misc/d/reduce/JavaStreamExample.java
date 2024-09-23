package stream_api.misc.d.reduce;

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
        Double totalPrice = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0, (sum, price) -> sum + price); // accumulating price

        System.out.println(totalPrice);

        // More precise code
        double totalPrice2 = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0, Double::sum); // // accumulating price, by referring method of Double class

        System.out.println(totalPrice2);
    }
}
