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
import ua.lviv.iot.musicalInstruments.enums.Material;
import ua.lviv.iot.musicalInstruments.enums.TypeOfInstrument;
import ua.lviv.iot.musicalInstruments.enums.TypeOfTrumpet;

import static org.junit.jupiter.api.Assertions.*;

class TrumpetTest {
  private MusicalInstrument testInstrument = new MusicalInstrument(7.3, 4.3, "TestProducer",
      TypeOfInstrument.WIND, 5.3);
  private Trumpet testTrumpet = new Trumpet(testInstrument, Material.CUPRUM, TypeOfTrumpet.BASSOON, 7);

  @Test
  void getHeaders() {
    String testAttributeString = "price,length,producer,typeOfInstrument,weight," +
        "material,typeOfTrumpet,numOfHoles";

    assertEquals(testTrumpet.getHeaders(), testAttributeString);
  }

  @Test
  void toCSV() {
    String testAttributeString = "7.3,4.3,TestProducer,WIND,5.3,CUPRUM,BASSOON,7";

    assertEquals(testTrumpet.toCsv(), testAttributeString);
  }

  @Test
  void trumpetPrice() {
    assertEquals(7.3, testTrumpet.getPrice());
  }

  @Test
  void trumpetLength() {
    assertEquals(4.3, testTrumpet.getLength());
  }

  @Test
  void trumpetProducer() {
    assertEquals("TestProducer", testTrumpet.getProducer());
  }

  @Test
  void typeOfInstrument() {
    assertEquals(TypeOfInstrument.WIND, testTrumpet.getTypeOfInstrument());
  }

  @Test
  void trumpetWeight() {
    assertEquals(5.3, testTrumpet.getWeight());
  }

  @Test
  void Material() {
    assertEquals(Material.CUPRUM, testTrumpet.getMaterial());
  }

  @Test
  void typeOfTrumpet() {
    assertEquals(TypeOfTrumpet.BASSOON, testTrumpet.getTypeOfTrumpet());
  }

  @Test
  void numOfHoles() {
    assertEquals(7, testTrumpet.getNumOfHoles());
  }

  @Test
  void testGetterSetter() {
    PojoClass pojoclass = PojoClassFactory.getPojoClass(Trumpet.class);
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