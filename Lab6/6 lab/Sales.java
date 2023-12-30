import java.util.ArrayList;
import java.util.Scanner;

public static class Sales {
    private static ArrayList<String> salesList;

    public Sales() {
        this.salesList = new ArrayList<>();
    }

    public static void add(String product) {
        salesList.add(product);
    }

    public void allSales() {
        for (String i : salesList) {
            System.out.println(i);
        }
    }

    public void amountOfSales() {
        System.out.println(salesList.size());
    }

    public void mostPopular() {
        String word = "";
        int count = 0;
        int maxCount = 0;
        if (salesList.size() == 0) {
            System.out.println("None");
        }
        for (String i : salesList) {
            for (String j : salesList) {
                if (i.equals(j)) {
                    count += 1;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                word = i;
            }
            count = 0;
        }
        System.out.println(word);
    }

    public static void main(String[] args) {
        Sales sales = new Sales();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String product = scanner.nextLine().trim();

            if (product.equalsIgnoreCase("Stop")) {
                break;
            }
            Sales.add(product);
        }
        sales.allSales();
        sales.amountOfSales();
        sales.mostPopular();
    }
}