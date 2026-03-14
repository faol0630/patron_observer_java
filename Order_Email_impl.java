package patron_observer.marzo_2026_2;

import java.util.ArrayList;
import java.util.List;

public class Order_Email_impl implements Order_int {

    List<ObserverInt> emailList = new ArrayList<>();

    @Override
    public void subscribe(ObserverInt observerInt) {
        emailList.add(observerInt);
    }

    @Override
    public void unsubscribe(ObserverInt observerInt) {
        emailList.remove(observerInt);
    }

    @Override
    public void notify(String status) {
        for(ObserverInt observerInt : emailList){
            observerInt.updateStatus(status);
        }
    }
}
