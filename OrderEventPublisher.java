package patron_observer.marzo_2026_2;

import java.util.ArrayList;
import java.util.List;

public class OrderEventPublisher implements OrderSubject {

    private final List<OrderObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyOrderShipped(Order order) {
        for (OrderObserver observer : observers) {
            observer.onOrderShipped(order);
        }
    }
}

