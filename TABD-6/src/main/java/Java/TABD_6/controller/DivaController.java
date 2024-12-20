package Java.TABD_6.controller;

import Java.TABD_6.model.DivaModel;
import Java.TABD_6.service.DivaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/divas")
public class DivaController {

    @Autowired
    private DivaService divaService;

    @PostMapping
    public ResponseEntity<DivaModel> saveDiva(@RequestBody DivaModel diva) {
        DivaModel savedDiva = divaService.saveDiva(diva);
        return new ResponseEntity<>(savedDiva, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<DivaModel>> getAllDivas() {
        Iterable<DivaModel> divas = divaService.getAllDivas();
        return new ResponseEntity<>(divas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DivaModel> getDivaById(@PathVariable UUID id) {
        Optional<DivaModel> divaOptional = divaService.getDivaById(id);
        if (divaOptional.isPresent()) {
            return new ResponseEntity<>(divaOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDiva(@PathVariable UUID id) {
        Optional<DivaModel> divaOptional = divaService.getDivaById(id);
        if (divaOptional.isPresent()) {
            divaService.deleteDiva(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
