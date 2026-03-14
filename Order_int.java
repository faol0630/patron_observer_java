package patron_observer.marzo_2026_2;

// subject
public interface Order_int {

    void subscribe(ObserverInt observerInt);
    void unsubscribe(ObserverInt observerInt);
    void notify(String status);
}
