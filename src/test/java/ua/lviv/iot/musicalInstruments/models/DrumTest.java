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
import ua.lviv.iot.musicalInstruments.enums.TypeOfDrum;
import ua.lviv.iot.musicalInstruments.enums.TypeOfInstrument;
import ua.lviv.iot.musicalInstruments.enums.TypeOfUse;
import ua.lviv.iot.musicalInstruments.enums.Wood;

import static org.junit.jupiter.api.Assertions.*;

class DrumTest {

  private MusicalInstrument testInstrument = new MusicalInstrument(3.1, 3.2, "TestProd",
      TypeOfInstrument.PERCURSSION, 0.2);
  private Drum testDrum = new Drum(testInstrument, Wood.BIRCH, TypeOfDrum.FUSION, TypeOfUse.HANDS);

  @Test
  void drumPrice() {
    assertEquals(3.1, testDrum.getPrice());
  }

  @Test
  void drumLength() {
    assertEquals(3.2, testDrum.getLength());
  }

  @Test
  void drumProducer() {
    assertEquals("TestProd", testDrum.getProducer());
  }

  @Test
  void typeOfInstrument() {
    assertEquals(TypeOfInstrument.PERCURSSION, testDrum.getTypeOfInstrument());
  }

  @Test
  void drumWeight() {
    assertEquals(0.2, testDrum.getWeight());
  }

  @Test
  void Wood() {
    assertEquals(Wood.BIRCH, testDrum.getWood());
  }

  @Test
  void typeOfDrum() {
    assertEquals(TypeOfDrum.FUSION, testDrum.getTypeOfDrum());
  }

  @Test
  void typeOfUse() {
    assertEquals(TypeOfUse.HANDS, testDrum.getTypeOfUse());
  }

  @Test
  void testGetterSetter() {
    PojoClass pojoclass = PojoClassFactory.getPojoClass(Drum.class);
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