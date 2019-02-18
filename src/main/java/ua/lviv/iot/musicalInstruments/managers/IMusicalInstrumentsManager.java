package ua.lviv.iot.musicalInstruments.managers;

import ua.lviv.iot.musicalInstruments.enums.TypeOfInstrument;
import ua.lviv.iot.musicalInstruments.models.MusicalInstrument;

import java.util.List;

public interface IMusicalInstrumentsManager {

  public List<MusicalInstrument> sortByPrice(List<MusicalInstrument> listInstruments,
                                             boolean descending);

  public List<MusicalInstrument> sortByWeight(List<MusicalInstrument> listInstruments,
                                              boolean descending);

  public List<MusicalInstrument> findByTypeOfInstrument(List<MusicalInstrument> listInstruments,
                                                        TypeOfInstrument typeOfInstrument);

  public List<MusicalInstrument> findByProducer(List<MusicalInstrument> listInstruments,
                                                String producer);

  public List<MusicalInstrument> createObjects(List<MusicalInstrument> instruments);
}