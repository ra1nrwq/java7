import java.util.*;

public class Cafe implements ICafe {
    private List<MenuItem> menuItems;
    private Map<Integer, Customer> customers;

    public Cafe() {
        menuItems = new ArrayList<>();
        customers = new HashMap<>();
    }

    @Override
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    @Override
    public void removeMenuItem(String name) {
        menuItems.removeIf(item -> item.getName().equalsIgnoreCase(name));
    }

    @Override
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Order createOrder(Customer customer, List<MenuItem> items) {
        Order order = new Order(items);
        customer.addOrder(order);
        return order;
    }
}
