package ua.lviv.iot.musicalInstruments.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.rule.impl.GetterMustExistRule;
import com.openpojo.validation.rule.impl.SetterMustExistRule;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;
import ua.lviv.iot.musicalInstruments.enums.TypeOfInstrument;

class MusicalInstrumentTest {

  private MusicalInstrument testInstrument = new MusicalInstrument(2312.1, 2.3, "TestProducer",
      TypeOfInstrument.WIND, 3.2);

  @Test
  void getHeaders() {
    String testAttributeString = "price,length,producer,typeOfInstrument,weight";

    assertEquals(testInstrument.getHeaders(), testAttributeString);
  }

  @Test
  void toCSV() {
    String testAttributeString = "2312.1,2.3,TestProducer,WIND,3.2";

    assertEquals(testInstrument.toCsv(), testAttributeString);
  }

  @Test
  void price() {
    assertEquals(2312.1, testInstrument.getPrice());
  }

  @Test
  void length() {
    assertEquals(2.3, testInstrument.getLength());
  }

  @Test
  void producer()
  {
    assertEquals("TestProducer", testInstrument.getProducer());
  }

  @Test
  void typeOfInstrument() {
    assertEquals(TypeOfInstrument.WIND, testInstrument.getTypeOfInstrument());
  }

  @Test
  void guitarWeight() {
    assertEquals(3.2, testInstrument.getWeight());
  }

  @Test
  void testGetterSetter() {
    PojoClass pojoclass = PojoClassFactory.getPojoClass(MusicalInstrument.class);
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