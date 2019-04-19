package ua.lviv.iot.musicalInstruments.services;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.musicalInstruments.models.Guitar;
import ua.lviv.iot.musicalInstruments.repositories.GuitarRepository;

import java.util.List;

@RestController
public class GuitarController {

    @Autowired
    GuitarRepository guitarRepository;

    @GetMapping("/guitars")
    public List<Guitar> getAllGuitars() {
        return (List<Guitar>) guitarRepository.findAll();
    }

    @PostMapping
    public Guitar createNewGuitar(@RequestBody Guitar guitar) {
        return guitarRepository.save(guitar);
    }

    @GetMapping("/guitars/{id}")
    public Guitar getOne(@PathVariable Integer id) throws NotFoundException {
        return guitarRepository.findById(id).
                orElseThrow(() -> new NotFoundException(id.toString()));
    }

    @PutMapping("/guitar/{id}")
    public Guitar guitarUpdate(@RequestBody Guitar newGuitar, @PathVariable Integer id)
            throws NotFoundException {

        Guitar guitar = guitarRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(id.toString()));

        guitar.setPrice(newGuitar.getPrice());
        guitar.setLength(newGuitar.getLength());
        guitar.setProducer(newGuitar.getProducer());
        guitar.setTypeOfGuitar(newGuitar.getTypeOfGuitar());
        guitar.setTypeOfInstrument(newGuitar.getTypeOfInstrument());
        guitar.setWeight(newGuitar.getWeight());
        guitar.setMaterialOfDeck(newGuitar.getMaterialOfDeck());
        guitar.setMaterialOfFingerBoard(newGuitar.getMaterialOfFingerBoard());
        guitar.setNumOfStrings(newGuitar.getNumOfStrings());

        return guitarRepository.save(guitar);
    }

    @DeleteMapping("/guitar/{id}")
    public void deleteGuitar(@PathVariable Integer id) {
        guitarRepository.deleteById(id);
    }
}

