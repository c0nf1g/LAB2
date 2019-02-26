package ua.lviv.iot.musicalInstruments.models;

import ua.lviv.iot.musicalInstruments.enums.MaterialOfDeck;
import ua.lviv.iot.musicalInstruments.enums.MaterialOfFingerBoard;
import ua.lviv.iot.musicalInstruments.enums.TypeOfGuitar;

public class Guitar extends MusicalInstrument {

  private int numOfStrings;
  private MaterialOfFingerBoard materialOfFingerBoard;
  private TypeOfGuitar typeOfGuitar;
  private MaterialOfDeck materialOfDeck;

  public Guitar(final MusicalInstrument instrument, final int numOfStrings,
                final MaterialOfFingerBoard materialOfFingerBoard,
                final TypeOfGuitar typeOfGuitar,
                final MaterialOfDeck materialOfDeck) {

    super(instrument.getPrice(),
          instrument.getLength(),
          instrument.getProducer(),
          instrument.getTypeOfInstrument(),
          instrument.getWeight());

    this.numOfStrings = numOfStrings;
    this.materialOfFingerBoard = materialOfFingerBoard;
    this.typeOfGuitar = typeOfGuitar;
    this.materialOfDeck = materialOfDeck;
  }

  public int getNumOfStrings() {
    return numOfStrings;
  }

  public void setNumOfStrings(final int numOfStrings) {
    this.numOfStrings = numOfStrings;
  }

  public MaterialOfFingerBoard getMaterialOfFingerBoard() {
    return materialOfFingerBoard;
  }

  public void setMaterialOfFingerBoard(final MaterialOfFingerBoard materialOfFingerBoard) {
    this.materialOfFingerBoard = materialOfFingerBoard;
  }

  public TypeOfGuitar getTypeOfGuitar() {
    return typeOfGuitar;
  }

  public void setTypeOfGuitar(TypeOfGuitar typeOfGuitar) {
    this.typeOfGuitar = typeOfGuitar;
  }

  public MaterialOfDeck getMaterialOfDeck() {
    return materialOfDeck;
  }

  public void setMaterialOfDeck(final MaterialOfDeck materialOfDeck) {
    this.materialOfDeck = materialOfDeck;
  }
}