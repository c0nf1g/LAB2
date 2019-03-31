package ua.lviv.iot.musicalInstruments.repositories;

import org.springframework.data.repository.CrudRepository;

import ua.lviv.iot.musicalInstruments.models.MusicalInstrument;

public interface MusicalInstrumentRepository<T extends MusicalInstrument>
    extends CrudRepository<T, Integer> {
}
