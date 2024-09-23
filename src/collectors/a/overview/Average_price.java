package collectors.a.overview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Average_price {
    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<>();

        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000));
        productsList.add(new Product(2,"Dell Laptop",30000));
        productsList.add(new Product(3,"Lenevo Laptop",28000));
        productsList.add(new Product(4,"Sony Laptop",28000));
        productsList.add(new Product(5,"Apple Laptop",90000));

        Double average = productsList.stream()
                .collect(Collectors.averagingDouble(p -> p.price));
        System.out.println("Average price is: " + average);
    }
}
