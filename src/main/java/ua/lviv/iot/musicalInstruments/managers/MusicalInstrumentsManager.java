package ua.lviv.iot.musicalInstruments.managers;

import ua.lviv.iot.musicalInstruments.enums.TypeOfInstrument;
import ua.lviv.iot.musicalInstruments.models.MusicalInstrument;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MusicalInstrumentsManager implements IMusicalInstrumentsManager {

  private List<MusicalInstrument> instruments;

  public MusicalInstrumentsManager() { }

  public MusicalInstrumentsManager(final List<MusicalInstrument> instruments) {
    this.instruments = instruments;
  }

  public List<MusicalInstrument> sortByPrice(final List<MusicalInstrument> listInstruments,
                                             final boolean descending) {

    if (descending) {
      Collections.sort(listInstruments, (instrumentOne, instrumentTwo) ->
          new Double(instrumentTwo.getPrice()).compareTo(instrumentOne.getPrice()));
    } else {
      Collections.sort(listInstruments, (instrumentOne, instrumentTwo) ->
          new Double(instrumentOne.getPrice()).compareTo(instrumentTwo.getPrice()));
    }

    return listInstruments;
  }

  public List<MusicalInstrument> sortByWeight(final List<MusicalInstrument> listInstruments,
                                              final boolean descending) {

    if (descending) {
      Collections.sort(listInstruments, (instrumentOne, instrumentTwo) ->
          new Double(instrumentTwo.getWeight()).compareTo(instrumentOne.getWeight()));
    } else {
      Collections.sort(listInstruments, (instrumentOne, instrumentTwo) ->
          new Double(instrumentOne.getWeight()).compareTo(instrumentTwo.getWeight()));
    }

    return listInstruments;
  }

  public List<MusicalInstrument> findByType(final List<MusicalInstrument> listInstruments,
                                            final TypeOfInstrument typeOfInstrument) {

    List<MusicalInstrument> instrumentsOfSameType = listInstruments.stream()
        .filter(instrument -> instrument.getTypeOfInstrument().equals(typeOfInstrument))
        .collect(Collectors.toList());

    return instrumentsOfSameType;
  }

  public List<MusicalInstrument> findByProducer(final List<MusicalInstrument> listInstruments,
                                                final String producer) {

    List<MusicalInstrument> instrumentsOfSameProducer = listInstruments.stream()
        .filter(instrument -> instrument.getProducer().equals(producer))
        .collect(Collectors.toList());

    return instrumentsOfSameProducer;
  }

  public List<MusicalInstrument> getInstruments() {
    return instruments;
  }

  public void setInstruments(final List<MusicalInstrument> instruments) {
    this.instruments = instruments;
  }
}
