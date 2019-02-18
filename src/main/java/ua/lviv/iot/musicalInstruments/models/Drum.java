package ua.lviv.iot.musicalInstruments.models;

import ua.lviv.iot.musicalInstruments.enums.TypeOfDrum;
import ua.lviv.iot.musicalInstruments.enums.TypeOfInstrument;
import ua.lviv.iot.musicalInstruments.enums.TypeOfUse;
import ua.lviv.iot.musicalInstruments.enums.Wood;

public class Drum extends MusicalInstrument {

  private Wood wood;
  private TypeOfDrum typeOfDrum;
  private TypeOfUse typeOfUse;

  public Drum() {
  }

  public Drum(double price, double length, String producer, TypeOfInstrument typeOfInstrument,
              double weight, Wood wood, TypeOfDrum typeOfDrum, TypeOfUse typeOfUse) {
    super(price, length, producer, typeOfInstrument, weight);
    this.wood = wood;
    this.typeOfDrum = typeOfDrum;
    this.typeOfUse = typeOfUse;
  }

  public Wood getWood() {
    return wood;
  }

  public void setWood(Wood wood) {
    this.wood = wood;
  }

  public TypeOfDrum getTypeOfDrum() {
    return typeOfDrum;
  }

  public void setTypeOfDrum(TypeOfDrum typeOfDrum) {
    this.typeOfDrum = typeOfDrum;
  }

  public TypeOfUse getTypeOfUse() {
    return typeOfUse;
  }

  public void setTypeOfUse(TypeOfUse typeOfUse) {
    this.typeOfUse = typeOfUse;
  }
}