package ua.lviv.iot.musicalInstruments.models;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.rule.impl.GetterMustExistRule;
import com.openpojo.validation.rule.impl.SetterMustExistRule;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.musicalInstruments.enums.MaterialOfDeck;
import ua.lviv.iot.musicalInstruments.enums.MaterialOfFingerBoard;
import ua.lviv.iot.musicalInstruments.enums.TypeOfGuitar;
import ua.lviv.iot.musicalInstruments.enums.TypeOfInstrument;

import static org.junit.jupiter.api.Assertions.*;

class GuitarTest {

  private MusicalInstrument testInstrument = new MusicalInstrument(123.3, 1.2, "TestProd",
      TypeOfInstrument.STRING, 3.2);
  private Guitar testGuitar = new Guitar(testInstrument, 4, MaterialOfFingerBoard.ASH,
      TypeOfGuitar.ACUSTIC,  MaterialOfDeck.ALDER);

  @Test
  void guitarPrice() {
    assertEquals(123.3, testGuitar.getPrice());
  }

  @Test
  void guitarLength() {
    assertEquals(1.2, testGuitar.getLength());
  }

  @Test
  void guitarProducer() {
    assertEquals("TestProd", testGuitar.getProducer());
  }

  @Test
  void typeOfInstrument() {
    assertEquals(TypeOfInstrument.STRING, testGuitar.getTypeOfInstrument());
  }

  @Test
  void guitarWeight() {
    assertEquals(3.2, testGuitar.getWeight());
  }

  @Test
  void NumOfString() {
    assertEquals(4, testGuitar.getNumOfStrings());
  }

  @Test
  void MaterialOfFingerBoard() {
    assertEquals(MaterialOfFingerBoard.ASH, testGuitar.getMaterialOfFingerBoard());
  }

  @Test
  void typeOfGuitar() {
    assertEquals(TypeOfGuitar.ACUSTIC, testGuitar.getTypeOfGuitar());
  }

  @Test
  void materialOfDeck() {
    assertEquals(MaterialOfDeck.ALDER, testGuitar.getMaterialOfDeck());
  }

  @Test
  void testGetterSetter() {
    PojoClass pojoclass = PojoClassFactory.getPojoClass(Guitar.class);
    Validator validator = ValidatorBuilder
        .create()
        .with(new SetterMustExistRule())
        .with(new GetterMustExistRule())
        .with(new SetterTester())
        .with(new GetterTester())
        .build();
    validator.validate(pojoclass);
  }
}

