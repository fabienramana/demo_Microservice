package fra.microservice.demo;

import org.springframework.data.repository.CrudRepository;

public interface CalculRepository extends CrudRepository<Calcul, Long> {
}
