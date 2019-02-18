package ua.lviv.iot.musicalInstruments.managers;

import ua.lviv.iot.musicalInstruments.enums.TypeOfInstrument;
import ua.lviv.iot.musicalInstruments.models.MusicalInstrument;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MusicalInstrumentsManager implements IMusicalInstrumentsManager {

  private List<MusicalInstrument> instruments;

  public MusicalInstrumentsManager(List<MusicalInstrument> instruments) {
    this.instruments = instruments;
  }

  public static void main(String[] args) {

    List<MusicalInstrument> instruments = new ArrayList<>();

    MusicalInstrumentsManager manager = new MusicalInstrumentsManager(instruments);

    manager.createObjects(instruments);

    manager.sortByPrice(instruments, false).forEach(instrument ->
        System.out.println(instrument.getPrice()));

    System.out.println("\n");

    manager.sortByPrice(instruments, true).forEach(instrument ->
        System.out.println(instrument.getPrice()));

    System.out.println("\n");

    manager.sortByWeight(instruments, false).forEach(instrument ->
        System.out.println(instrument.getWeight()));

    System.out.println("\n");

    manager.sortByWeight(instruments, true).forEach(instrument ->
        System.out.println(instrument.getWeight()));

    System.out.println("\n");

    manager.findByTypeOfInstrument(instruments, TypeOfInstrument.STRING).forEach(instrument ->
        System.out.println(instrument.getTypeOfInstrument()));

    System.out.println("\n");

    manager.findByProducer(instruments, "Yamaha").forEach(instrument ->
        System.out.println(instrument.getProducer()));
  }

  public List<MusicalInstrument> sortByPrice(List<MusicalInstrument> listInstruments,
                                             boolean descending) {

    if (descending) {
      listInstruments.sort((instrumentOne, instrumentTwo) ->
          (int) (instrumentTwo.getPrice() - instrumentOne.getPrice()));
    } else {
      listInstruments.sort((instrumentOne, instrumentTwo) ->
          (int) (instrumentOne.getPrice() - instrumentTwo.getPrice()));
    }

    return listInstruments;
  }

  public List<MusicalInstrument> sortByWeight(List<MusicalInstrument> listInstruments,
                                              boolean descending) {

    if (descending) {
      listInstruments.sort((instrumentOne, instrumentTwo) ->
          (int) (instrumentOne.getWeight() - instrumentTwo.getWeight()));
    } else {
      listInstruments.sort((instrumentOne, instrumentTwo) ->
          (int) (instrumentTwo.getWeight() - instrumentOne.getWeight()));
    }

    return listInstruments;
  }

  public List<MusicalInstrument> findByTypeOfInstrument(List<MusicalInstrument> listInstruments,
                                                        TypeOfInstrument typeOfInstrument) {

    List<MusicalInstrument> instrumentsOfSameType = listInstruments.stream()
        .filter(instrument -> instrument.getTypeOfInstrument().equals(typeOfInstrument))
        .collect(Collectors.toList());

    return instrumentsOfSameType;
  }

  public List<MusicalInstrument> findByProducer(List<MusicalInstrument> listInstruments,
                                                String producer) {

    List<MusicalInstrument> instrumentsOfSameProducer = listInstruments.stream()
        .filter(instrument -> instrument.getProducer().equals(producer))
        .collect(Collectors.toList());

    return instrumentsOfSameProducer;
  }

  public List<MusicalInstrument> createObjects(List<MusicalInstrument> instruments) {

    instruments.add(new MusicalInstrument(3000.00, 120.00, "Yamaha",
        TypeOfInstrument.STRING, 4.3));
    instruments.add(new MusicalInstrument(5300.00, 230.00, "OrchestraMusic",
        TypeOfInstrument.WIND, 6.3));
    instruments.add(new MusicalInstrument(4500.00, 140.00, "Rainsong",
        TypeOfInstrument.STRING, 5.3));
    instruments.add(new MusicalInstrument(2100.00, 30.00, "Yamaha",
        TypeOfInstrument.PERCURSSION, 0.5));
    instruments.add(new MusicalInstrument(6700, 210.00, "SaxMusic",
        TypeOfInstrument.WIND, 5.5));

    return instruments;
  }

  public List<MusicalInstrument> getInstruments() {
    return instruments;
  }

  public void setInstruments(List<MusicalInstrument> instruments) {
    this.instruments = instruments;
  }
}
