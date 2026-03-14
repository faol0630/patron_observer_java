package patron_observer.marzo_2026_2;

import java.util.ArrayList;
import java.util.List;

public class Order_Log_Impl implements Order_int{

    List<ObserverInt> logList = new ArrayList<>();

    @Override
    public void subscribe(ObserverInt observerInt) {
        logList.add(observerInt);
    }

    @Override
    public void unsubscribe(ObserverInt observerInt) {
        logList.remove(observerInt);
    }

    @Override
    public void notify(String status) {
        for (ObserverInt observerInt: logList){
            observerInt.updateStatus(status);
        }
    }
}
