package ua.lviv.iot.musicalInstruments.models;

import ua.lviv.iot.musicalInstruments.enums.Material;
import ua.lviv.iot.musicalInstruments.enums.TypeOfInstrument;
import ua.lviv.iot.musicalInstruments.enums.TypeOfTrumpet;

public class Trumpet extends MusicalInstrument {

  private Material material;
  private TypeOfTrumpet typeOfTrumpet;
  private int numOfHoles;

  public Trumpet(final MusicalInstrument instrument,
                 final Material material,
                 final TypeOfTrumpet typeOfTrumpet,
                 final int numOfHoles) {

    super(instrument.getPrice(),
          instrument.getLength(),
          instrument.getProducer(),
          instrument.getTypeOfInstrument(),
          instrument.getWeight());

    this.material = material;
    this.typeOfTrumpet = typeOfTrumpet;
    this.numOfHoles = numOfHoles;
  }

  public Material getMaterial() {
    return material;
  }

  public void setMaterial(final Material material) {
    this.material = material;
  }

  public TypeOfTrumpet getTypeOfTrumpet() {
    return typeOfTrumpet;
  }

  public void setTypeOfTrumpet(final TypeOfTrumpet typeOfTrumpet) {
    this.typeOfTrumpet = typeOfTrumpet;
  }

  public int getNumOfHoles() {
    return numOfHoles;
  }

  public void setNumOfHoles(final int numOfHoles) {
    this.numOfHoles = numOfHoles;
  }
}