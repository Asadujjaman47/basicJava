package lambda_Expression.a.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionExample10 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        // Adding Products
        list.add(new Product(1, "HP Laptop", 2500f));
        list.add(new Product(2, "HP Laptop", 300f));
        list.add(new Product(3, "Dell Mouse", 2500f));

        System.out.println("Sorting on the basisi of name...");

        // implementing lambda expression
        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });

        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }
    }
}
