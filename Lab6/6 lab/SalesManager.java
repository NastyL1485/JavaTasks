import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class Sales {
    private LinkedList<Product> soldProducts;

    public SalesManager() {
        this.soldProducts = new LinkedList<>();
    }

    public void addSale(Product product) {
        soldProducts.add(product);
    }

    public void displaySales() {
        System.out.println("Список проданных товаров:");
        for (Product product : soldProducts) {
            System.out.println(product.getName() + " - " + product.getPrice() + " руб.");
        }
    }

    public double calculateTotalSales() {
        double totalSales = 0;
        for (Product product : soldProducts) {
            totalSales += product.getPrice();
        }
        return totalSales;
    }

    public String findMostPopularProduct() {
        Map<String, Integer> productFrequency = new HashMap<>();

        for (Product product : soldProducts) {
            String productName = product.getName();
            productFrequency.put(productName, productFrequency.getOrDefault(productName, 0) + 1);
        }

        return soldProducts.stream().max((Comparator.comparing(Product::getPrice))).get().getName();
    }

    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager();


        salesManager.addSale(new Product("Товар1", 50.0));
        salesManager.addSale(new Product("Товар2", 30.0));
        salesManager.addSale(new Product("Товар1", 50.0));

        salesManager.displaySales();

        double totalSales = salesManager.calculateTotalSales();
        System.out.println("Общая сумма продаж: " + totalSales + " руб.");

        String mostPopularProduct = salesManager.findMostPopularProduct();
        System.out.println("Наиболее популярный товар: " + mostPopularProduct);
    }
}