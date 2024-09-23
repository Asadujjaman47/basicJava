package stream_api.misc.g.count;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();

        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2, "Dell Laptop", 30000));
        productsList.add(new Product(3, "Lenovo Laptop", 28000));
        productsList.add(new Product(4, "Sony Laptop", 28000));
        productsList.add(new Product(5, "Apple Laptop", 90000));

        // count number of product based on the filter
        long count = productsList.stream()
                .filter(product -> product.price < 30000)
                .count();
        System.out.println(count);
    }

}
