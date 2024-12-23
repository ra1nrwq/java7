import java.util.List;

public interface ICafe {
    void addMenuItem(MenuItem item);
    void removeMenuItem(String name);
    List<MenuItem> getMenuItems();
    Order createOrder(Customer customer, List<MenuItem> items);
}
