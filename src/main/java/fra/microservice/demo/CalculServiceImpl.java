package fra.microservice.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CalculServiceImpl implements CalculService {

    private CalculRepository calculRepository;

    @Override
    public List<Calcul> listAll(){
        List<Calcul> calculs = new ArrayList<>();
        calculRepository.findAll().forEach(calculs::add);
        return calculs;
    }

    @Override
    public Optional<Calcul> getById(Long id) {
        return calculRepository.findById(id);
    }

    @Override
    public Calcul insert(Calcul calcul) {
        calculRepository.save(calcul);
        return calcul;
    }

    @Override
    public void delete(Long id){
        calculRepository.deleteById(id);
    }

}
