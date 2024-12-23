import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String phone;
    private List<Order> orderHistory;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.orderHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void addOrder(Order order) {
        orderHistory.add(order);
    }
}
