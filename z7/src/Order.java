import java.util.List;

public class Order {
    private static int idCounter = 1;
    private int orderId;
    private List<MenuItem> items;

    public Order(List<MenuItem> items) {
        this.orderId = idCounter++;
        this.items = items;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public double getTotalPrice() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
