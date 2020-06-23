package fra.microservice.demo;

import java.util.List;
import java.util.Optional;

public interface CalculService {
    List<Calcul> listAll();

    Optional<Calcul> getById(Long id);
    Calcul insert(Calcul calcul);
    void delete(Long id);
}
