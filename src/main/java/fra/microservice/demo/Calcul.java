package fra.microservice.demo;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Calcul {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;
    public String expression;
    public double result;

    public LocalDateTime beginValidity;
    public LocalDateTime endValidity;
}
