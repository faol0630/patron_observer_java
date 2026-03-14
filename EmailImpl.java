package patron_observer.marzo_2026_2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmailImpl implements ObserverInt {

    String Email;

    @Override
    public void updateStatus(String status) {
        System.out.println(status);
    }
}
