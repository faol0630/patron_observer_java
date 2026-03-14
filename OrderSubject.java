package patron_observer.marzo_2026_2;

// subject

public interface OrderSubject {
    void addObserver(OrderObserver observer);
    void removeObserver(OrderObserver observer);
    void notifyOrderShipped(Order order);
}

