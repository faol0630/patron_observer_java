package patron_observer.marzo_2026_2;

public class StatsOrderObserver implements OrderObserver {

    private int totalEnviados = 0;

    @Override
    public void onOrderShipped(Order order) {
        totalEnviados++;
        System.out.println("[STATS] Contador de pedidos enviados: " + totalEnviados);
    }
}

