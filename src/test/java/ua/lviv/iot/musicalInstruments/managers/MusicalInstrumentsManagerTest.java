package ua.lviv.iot.musicalInstruments.managers;

import static org.junit.jupiter.api.Assertions.*;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.rule.impl.GetterMustExistRule;
import com.openpojo.validation.rule.impl.SetterMustExistRule;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.musicalInstruments.enums.TypeOfInstrument;
import ua.lviv.iot.musicalInstruments.models.MusicalInstrument;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MusicalInstrumentsManagerTest {

  private MusicalInstrumentsManager testManager = new MusicalInstrumentsManager();

  private List<MusicalInstrument> actualInstrumentList = new ArrayList<>(
      Arrays.asList(new MusicalInstrument(1234.3, 2345.8,
              "TestProducer1,", TypeOfInstrument.STRING, 2.8),
                    new MusicalInstrument(1234.1, 2345.5,
                        "TestProducer2,", TypeOfInstrument.WIND, 2.6),
                    new MusicalInstrument(2456.6, 5385.9,
                        "TestProducer3,", TypeOfInstrument.PERCURSSION, 3.5))
      );

  @Test
  void sortByPriceIncrease() {
    List<MusicalInstrument> expectedInstrumentList = new ArrayList<>();

    expectedInstrumentList.add(new MusicalInstrument(1234.1, 0, null,
        null, 0));
    expectedInstrumentList.add(new MusicalInstrument(1234.3, 0, null,
        null, 0));
    expectedInstrumentList.add(new MusicalInstrument(2456.6, 0, null,
        null, 0));

    for(int item = 0; item < expectedInstrumentList.toArray().length; item++){
      assertEquals(expectedInstrumentList.get(item).getPrice(),
          (testManager.sortByPrice(actualInstrumentList,
              false).get(item).getPrice()), 0.1);
    }
  }

  @Test
  void sortByPriceDecrease() {
    List<MusicalInstrument> expectedInstrumentList = new ArrayList<>();

    expectedInstrumentList.add(new MusicalInstrument(2456.6, 0, null,
        null, 0));
    expectedInstrumentList.add(new MusicalInstrument(1234.3, 0, null,
        null, 0));
    expectedInstrumentList.add(new MusicalInstrument(1234.1, 0, null,
        null, 0));

    for(int item = 0; item < expectedInstrumentList.toArray().length; item++){
      assertEquals(expectedInstrumentList.get(item).getPrice(),
          (testManager.sortByPrice(actualInstrumentList,
              true).get(item).getPrice()), 0.1);
    }
  }

  @Test
  void sortByWeightIncrease() {
    List<MusicalInstrument> expectedInstrumentList = new ArrayList<>();

    expectedInstrumentList.add(new MusicalInstrument(0, 0, null,
        null, 2.6));
    expectedInstrumentList.add(new MusicalInstrument(0, 0, null,
        null, 2.8));
    expectedInstrumentList.add(new MusicalInstrument(0, 0, null,
        null, 3.5));

    for(int item = 0; item < expectedInstrumentList.toArray().length; item++){
      assertEquals(expectedInstrumentList.get(item).getWeight(),
          (testManager.sortByWeight(actualInstrumentList,
              false).get(item).getWeight()), 0.1);
    }
  }

  @Test
  void sortByWeightDecrease() {
    List<MusicalInstrument> expectedInstrumentList = new ArrayList<>();

    expectedInstrumentList.add(new MusicalInstrument(0, 0, null,
        null, 3.5));
    expectedInstrumentList.add(new MusicalInstrument(0, 0, null,
        null, 2.8));
    expectedInstrumentList.add(new MusicalInstrument(0, 0, null,
        null, 2.6));

    for(int item = 0; item < expectedInstrumentList.toArray().length; item++){
      assertEquals(expectedInstrumentList.get(item).getWeight(),
          (testManager.sortByWeight(actualInstrumentList,
              true).get(item).getWeight()), 0.1);
    }
  }

  @Test
  void findByTypeOfInstrumentString() {
    actualInstrumentList = testManager.findByType(actualInstrumentList, TypeOfInstrument.STRING);

    for(int item = 0; item < actualInstrumentList.toArray().length; item++) {
      assertEquals(TypeOfInstrument.STRING,
          actualInstrumentList.get(item).getTypeOfInstrument());
    }
  }

  @Test
  void findByTypeOfInstrumentWind() {
    actualInstrumentList = testManager.findByType(actualInstrumentList, TypeOfInstrument.WIND);

    for(int item = 0; item < actualInstrumentList.toArray().length; item++) {
      assertEquals(TypeOfInstrument.WIND,
          actualInstrumentList.get(item).getTypeOfInstrument());
    }
  }

  @Test
  void findByTypeOfInstrumentPercurssion() {
    actualInstrumentList = testManager.findByType(actualInstrumentList, TypeOfInstrument.PERCURSSION);

    for(int item = 0; item < actualInstrumentList.toArray().length; item++) {
      assertEquals(TypeOfInstrument.PERCURSSION,
          actualInstrumentList.get(item).getTypeOfInstrument());
    }
  }

  @Test
  void MusicalInstrumentsManager() {
    MusicalInstrumentsManager testManager = new MusicalInstrumentsManager(actualInstrumentList);

    assertEquals(actualInstrumentList, testManager.getInstruments());
  }

  @Test
  void testGetterSetter() {
    PojoClass pojoclass = PojoClassFactory.getPojoClass(MusicalInstrumentsManager.class);
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