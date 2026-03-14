package patron_observer.marzo_2026_2;

public class AppMain {

    public static void main(String[] args) {

        int ordersTotal = 0;

        ObserverInt email1 = new EmailImpl("luis@mail.net");
        ObserverInt email2 = new EmailImpl("maria@net.com");
        ObserverInt email3 = new EmailImpl("juan@mail.net");

        ObserverInt log1 = new Log("Log1");

        Order_int order = new Order_Email_impl();
        order.subscribe(email1);
        order.subscribe(email2);
        order.subscribe(email3);

        order.notify("Shipped!");

        Order_int orderLog = new Order_Log_Impl();
        orderLog.subscribe(log1);
        orderLog.notify("Shipped!");
        System.out.println("Total ordenes: " + ++ordersTotal);

        order.notify("Order two, shipped!");
        orderLog.notify("Order two, shipped!");
        System.out.println("Total ordenes: " + ++ordersTotal);


    }
}
