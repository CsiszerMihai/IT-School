package session_16_frameworks_collections.practice;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Set<String> products = initializeSet();
        System.out.println(products);

        displayProducts(products);

        Set<String> newProducts = new HashSet<>();
        newProducts.add("P500");
        newProducts.add("P501");
        newProducts.add("P502");

        displayProducts(mergeProducts(products, newProducts));
    }

    public static Set<String> mergeProducts(Set<String> set1, Set<String> set2) {
        Set<String> mergedProducts = new HashSet<>(set1);
        set1.addAll(set2);

        return mergedProducts;
    }

    public static void displayProducts(Set<String> products) {
        for (String product : products) {
            System.out.print(product + " ");
        }
    }

    public static Set<String> initializeSet() {
        Set<String> products = new HashSet<>();
        products.add("P101");
        products.add("P102");
        products.add("P103");
        products.add("P104");
        products.add("P105");

        return products;
    }
}