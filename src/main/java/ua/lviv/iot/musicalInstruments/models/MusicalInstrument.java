package ua.lviv.iot.musicalInstruments.models;

import ua.lviv.iot.musicalInstruments.enums.TypeOfInstrument;

public class MusicalInstrument {

  private double price;
  private double length;
  private String producer;
  private TypeOfInstrument typeOfInstrument;
  private double weight;

  public MusicalInstrument(final double price,
                           final double length,
                           final String producer,
                           TypeOfInstrument typeOfInstrument,
                           double weight) {

    this.price = price;
    this.length = length;
    this.producer = producer;
    this.typeOfInstrument = typeOfInstrument;
    this.weight = weight;
  }

  public MusicalInstrument() {
  }

  public String getHeaders() {
    return "price" + "," +
        "length" + "," +
        "producer" + "," +
        "typeOfInstrument" + "," +
        "weight";
  }

  public String toCsv() {
    return price + "," +
        length + "," +
        producer + "," +
        typeOfInstrument + "," +
        weight;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(final double price) {
    this.price = price;
  }

  public double getLength() {
    return length;
  }

  public void setLength(final double length) {
    this.length = length;
  }

  public String getProducer() {
    return producer;
  }

  public void setProducer(final String producer) {
    this.producer = producer;
  }

  public TypeOfInstrument getTypeOfInstrument() {
    return typeOfInstrument;
  }

  public void setTypeOfInstrument(final TypeOfInstrument typeOfInstrument) {
    this.typeOfInstrument = typeOfInstrument;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(final double weight) {
    this.weight = weight;
  }
}