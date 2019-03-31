package ua.lviv.iot.musicalInstruments.repositories;

import ua.lviv.iot.musicalInstruments.models.Guitar;

import javax.transaction.Transactional;

@Transactional
public interface GuitarRepository extends MusicalInstrumentRepository<Guitar>{

}
