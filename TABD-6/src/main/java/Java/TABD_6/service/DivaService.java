package Java.TABD_6.service;
import Java.TABD_6.model.DivaModel;
import Java.TABD_6.repository.DivaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class DivaService {

    @Autowired
    private DivaRepository divaRepository;

    public DivaModel saveDiva(DivaModel user) {
        return divaRepository.save(user);
    }

    public Iterable<DivaModel> getAllDivas() {
        return divaRepository.findAll();
    }

    public Optional<DivaModel> getDivaById(UUID id) {
        return divaRepository.findById(id);
    }

    public void deleteDiva(UUID id) {
        divaRepository.deleteById(id);
    }
}
