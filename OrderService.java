package patron_observer.marzo_2026_2;

public class OrderService {
    //interface de subject:
    private final OrderSubject orderSubject;

    public OrderService(OrderSubject orderSubject) {
        this.orderSubject = orderSubject;
    }

    public void shipOrder(Order order) {
        // lógica de negocio para “enviar” el pedido
        order.setStatus("ENVIADO");
        System.out.println("OrderService: Pedido " + order.getId() + " marcado como ENVIADO.");


        // se llama a la función de cada observer(Mail, Log, Stats) o sea 3 llamados:
        orderSubject.notifyOrderShipped(order);
    }
}

