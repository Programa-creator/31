package ua.hillel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderRepository {
    private static List<Order> orders = new ArrayList<>();
    private static int currentId = 1;

    public Order getById(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public List<Order> getAll() {
        return orders;
    }

    public void add(Order order) {
        order.setId(currentId);
        order.setDate(new Date());
        orders.add(order);
        currentId++;
    }
}

