package ua.lviv.iot.musicalInstruments.models;

import ua.lviv.iot.musicalInstruments.enums.TypeOfDrum;
import ua.lviv.iot.musicalInstruments.enums.TypeOfUse;
import ua.lviv.iot.musicalInstruments.enums.Wood;

public class Drum extends MusicalInstrument {

  private Wood wood;
  private TypeOfDrum typeOfDrum;
  private TypeOfUse typeOfUse;

  public Drum(final MusicalInstrument instrument, final Wood wood,
              final TypeOfDrum typeOfDrum, final TypeOfUse typeOfUse) {
    super(instrument.getPrice(),
          instrument.getLength(),
          instrument.getProducer(),
          instrument.getTypeOfInstrument(),
          instrument.getWeight());

    this.wood = wood;
    this.typeOfDrum = typeOfDrum;
    this.typeOfUse = typeOfUse;
  }

  public Wood getWood() {
    return wood;
  }

  public void setWood(final Wood wood) {
    this.wood = wood;
  }

  public TypeOfDrum getTypeOfDrum() {
    return typeOfDrum;
  }

  public void setTypeOfDrum(final TypeOfDrum typeOfDrum) {
    this.typeOfDrum = typeOfDrum;
  }

  public TypeOfUse getTypeOfUse() {
    return typeOfUse;
  }

  public void setTypeOfUse(final TypeOfUse typeOfUse) {
    this.typeOfUse = typeOfUse;
  }
}