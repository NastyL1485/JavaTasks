import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addItem(new Item("Товар 1", 100));
        warehouse.addItem(new Item("Товар 2", 50));
        warehouse.addItem(new Item("Товар 3", 80));
        warehouse.addItem(new Item("Товар 4", 120));
        warehouse.addItem(new Item("Товар 5", 150));
        warehouse.addItem(new Item("Товар 6", 10));
        warehouse.addItem(new Item("Товар 7", 130));
        warehouse.addItem(new Item("Товар 8", 70));

        Worker worker1 = new Worker("w1", warehouse);
        Thread workerThread1 = new Thread(worker1);
        workerThread1.start();

        Worker worker2 = new Worker("w2", warehouse);
        Thread workerThread2 = new Thread(worker2);
        workerThread2.start();

        Worker worker3 = new Worker("w3", warehouse);
        Thread workerThread3 = new Thread(worker3);
        workerThread3.start();
    }
}

class Item {
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}

class Warehouse {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public Item removeItem() {
        if (items.isEmpty()) {
            return null;
        }
        return items.remove(0);
    }
}

class Worker extends Thread {
    private String name;
    private Warehouse warehouse;

    public Worker(String name, Warehouse warehouse) {
        this.name = name;
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        int currentWeight = 0;
        List<String> currentItems = new ArrayList<>();
        while (true) {
            Item item = warehouse.removeItem();
            if (item == null) {
                break;
            }
            if (currentWeight + item.getWeight() <= 150) {
                currentItems.add(item.getName());
                currentWeight += item.getWeight();
            } else {
                // Перемещение товаров на другой склад и начало разгрузки
                System.out.println(name + " переносит товары: " + currentItems);
                try {
                    Thread.sleep(2000); // Имитация времени на перенос
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name + " разгружает товары: " + currentItems);
                currentWeight = 0;
                currentItems.clear();
                currentItems.add(item.getName());
                currentWeight += item.getWeight();
            }
        }
        if (!currentItems.isEmpty()) {
            // Перемещение оставшихся товаров на другой склад и начало разгрузки
            System.out.println(name + " переносит оставшиеся товары: " + currentItems);
            try {
                Thread.sleep(2000); // Имитация времени на перенос
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " разгружает оставшиеся товары: " + currentItems);
        }
    }
}
