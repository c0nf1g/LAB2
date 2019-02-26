package ua.lviv.iot.musicalInstruments.managers;

import ua.lviv.iot.musicalInstruments.enums.TypeOfInstrument;
import ua.lviv.iot.musicalInstruments.models.MusicalInstrument;

import java.util.List;

public interface IMusicalInstrumentsManager {

  List<MusicalInstrument> sortByPrice(List<MusicalInstrument> listInstruments,
                                      boolean descending);

  List<MusicalInstrument> sortByWeight(List<MusicalInstrument> listInstruments,
                                       boolean descending);

  List<MusicalInstrument> findByType(List<MusicalInstrument> listInstruments,
                                     TypeOfInstrument typeOfInstrument);

  List<MusicalInstrument> findByProducer(List<MusicalInstrument> listInstruments,
                                         String producer);
}