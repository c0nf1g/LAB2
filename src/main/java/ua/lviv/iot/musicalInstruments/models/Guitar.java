package ua.lviv.iot.musicalInstruments.models;

import ua.lviv.iot.musicalInstruments.enums.MaterialOfDeck;
import ua.lviv.iot.musicalInstruments.enums.MaterialOfFingerBoard;
import ua.lviv.iot.musicalInstruments.enums.TypeOfGuitar;
import ua.lviv.iot.musicalInstruments.enums.TypeOfInstrument;

public class Guitar extends MusicalInstrument {

  private int numOfStrings;
  private MaterialOfFingerBoard materialOfFingerBoard;
  private TypeOfGuitar typeOfGuitar;
  private MaterialOfDeck materialOfDeck;

  public Guitar() { }

  public Guitar(double price, double length, String producer, TypeOfInstrument typeOfInstrument,
                double weight, int numOfStrings, MaterialOfFingerBoard materialOfFingerBoard,
                TypeOfGuitar typeOfGuitar, MaterialOfDeck materialOfDeck) {
    super(price, length, producer, typeOfInstrument, weight);
    this.numOfStrings = numOfStrings;
    this.materialOfFingerBoard = materialOfFingerBoard;
    this.typeOfGuitar = typeOfGuitar;
    this.materialOfDeck = materialOfDeck;
  }


  public int getNumOfStrings() {
    return numOfStrings;
  }

  public void setNumOfStrings(int numOfStrings) {
    this.numOfStrings = numOfStrings;
  }

  public MaterialOfFingerBoard getMaterialOfFingerBoard() {
    return materialOfFingerBoard;
  }

  public void setMaterialOfFingerBoard(MaterialOfFingerBoard materialOfFingerBoard) {
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

  public void setMaterialOfDeck(MaterialOfDeck materialOfDeck) {
    this.materialOfDeck = materialOfDeck;
  }
}