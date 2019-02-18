package ua.lviv.iot.musicalInstruments.models;

import ua.lviv.iot.musicalInstruments.enums.TypeOfInstrument;

public class MusicalInstrument {

  private double price;
  private double length;
  private String producer;
  private TypeOfInstrument typeOfInstrument;
  private double weight;

  public MusicalInstrument() {}

  public MusicalInstrument(double price, double length, String producer, TypeOfInstrument typeOfInstrument,
                           double weight) {
    this.price = price;
    this.length = length;
    this.producer = producer;
    this.typeOfInstrument = typeOfInstrument;
    this.weight = weight;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public String getProducer() {
    return producer;
  }

  public void setProducer(String producer) {
    this.producer = producer;
  }

  public TypeOfInstrument getTypeOfInstrument() {
    return typeOfInstrument;
  }

  public void setTypeOfInstrument(TypeOfInstrument typeOfInstrument) {
    this.typeOfInstrument = typeOfInstrument;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}