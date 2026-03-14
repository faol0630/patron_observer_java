package patron_observer.marzo_2026_2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Log implements ObserverInt{

    String logName;

    @Override
    public void updateStatus(String status) {
        Date date = new Date();
        System.out.println(date + "/ Status: " + status);
    }
}
