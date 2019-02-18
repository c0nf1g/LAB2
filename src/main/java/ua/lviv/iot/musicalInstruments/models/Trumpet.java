package ua.lviv.iot.musicalInstruments.models;

import ua.lviv.iot.musicalInstruments.enums.Material;
import ua.lviv.iot.musicalInstruments.enums.TypeOfInstrument;
import ua.lviv.iot.musicalInstruments.enums.TypeOfTrumpet;

public class Trumpet extends MusicalInstrument {

  private Material material;
  private TypeOfTrumpet typeOfTrumpet;
  private int numOfHoles;

  public Trumpet() {
  }

  public Trumpet(double price, double length, String producer, TypeOfInstrument typeOfInstrument,
                 double weight, Material material, TypeOfTrumpet typeOfTrumpet, int numOfHoles) {
    super(price, length, producer, typeOfInstrument, weight);
    this.material = material;
    this.typeOfTrumpet = typeOfTrumpet;
    this.numOfHoles = numOfHoles;
  }

  public Material getMaterial() {
    return material;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

  public TypeOfTrumpet getTypeOfTrumpet() {
    return typeOfTrumpet;
  }

  public void setTypeOfTrumpet(TypeOfTrumpet typeOfTrumpet) {
    this.typeOfTrumpet = typeOfTrumpet;
  }

  public int getNumOfHoles() {
    return numOfHoles;
  }

  public void setNumOfHoles(int numOfHoles) {
    this.numOfHoles = numOfHoles;
  }
}