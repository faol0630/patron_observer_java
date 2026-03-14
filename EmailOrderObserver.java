package patron_observer.marzo_2026_2;

public class EmailOrderObserver implements OrderObserver {

    @Override
    public void onOrderShipped(Order order) {
        System.out.println("[EMAIL] Pedido " + order.getId() + " enviado. Mandando email al cliente.");
    }
}

