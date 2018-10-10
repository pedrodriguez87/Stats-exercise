package tech.bts.javareview.simpleprogram.products;

import tech.bts.javareview.simpleprogram.classes.util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisplayProducts {

    public static void main(String[] args) {

        Product p1 = new Product("iphone",20,true);
        Product p2 = new Product("macbook",30,true);
        Product p3 = new Product("iwatch",40,false);

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        int columnWidth = 20;

        // Crea una lista cerrada con 3 productos directamente.
        List<String> fieldNames = Arrays.asList("Name", "Price", "Available");

        String title = "";
        for (String fieldName : fieldNames) {
            title += StringUtil.padRight(fieldName,columnWidth);
        }

        String dots = StringUtil.repeat("-", columnWidth * fieldNames.size());

        System.out.println(title);
        System.out.println(dots);

        for (Product product : products) {

            String productline = StringUtil.padRight(product.getName(),columnWidth)
                    + StringUtil.padRight("" + product.getPrice(), columnWidth)
                    + StringUtil.padRight("" + product.isAvailable(), columnWidth);
            System.out.println(productline);

            System.out.println(dots);
        }

    }
}
