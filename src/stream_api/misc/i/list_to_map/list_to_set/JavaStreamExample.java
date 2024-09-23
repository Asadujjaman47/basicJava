package stream_api.misc.i.list_to_map.list_to_set;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
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

        // Converting product List into Map
        Map<Integer, String> productPriceMap = productsList.stream()
                .collect(Collectors.toMap(p-> p.id, p-> p.name));

        System.out.println(productPriceMap);
    }

}
