package collectors.a.overview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Data_as_a_List {
    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<>();

        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000));
        productsList.add(new Product(2,"Dell Laptop",30000));
        productsList.add(new Product(3,"Lenevo Laptop",28000));
        productsList.add(new Product(4,"Sony Laptop",28000));
        productsList.add(new Product(5,"Apple Laptop",90000));

        List<Double> productPriceList = productsList.stream()
                                        .map(x -> x.price)  // fetching price
                                        .collect(Collectors.toList());  // collecting as list

        System.out.println(productPriceList);
    }
}
