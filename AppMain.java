package patron_observer.marzo_2026_2;

public class AppMain {

    public static void main(String[] args) {

        // 1) Crear el Subject (publisher de eventos)
        OrderSubject publisher = new OrderEventPublisher();

        // 2) Crear observers
        OrderObserver emailObserver = new EmailOrderObserver();
        OrderObserver logObserver = new LogOrderObserver();
        OrderObserver statsObserver = new StatsOrderObserver();

        // 3) Suscribir observers al subject
        publisher.addObserver(emailObserver);
        publisher.addObserver(logObserver);
        publisher.addObserver(statsObserver);

        // 4) Crear el servicio usando el subject
        OrderService orderService = new OrderService(publisher);

        // 5) Crear un pedido y enviarlo
        Order order = new Order("ORD-001");
        orderService.shipOrder(order); // esta función llama a cada observer


    }
}
