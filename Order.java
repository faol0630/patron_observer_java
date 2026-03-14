package patron_observer.marzo_2026_2;

import lombok.Getter;
import lombok.Setter;

//modelo de dominio
@Getter
@Setter
public class Order {

    private String id;
    private String status; // "CREADO", "ENVIADO", etc.

    public Order(String id) {
        this.id = id;
        this.status = "CREADO";
    }

}

