package patron_observer.marzo_2026_2;

public class LogOrderObserver implements OrderObserver {

    @Override
    public void onOrderShipped(Order order) {
        System.out.println("[LOG] Pedido " + order.getId() + " ha cambiado a estado: " + order.getStatus());
    }
}

