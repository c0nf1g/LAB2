package ua.lviv.iot.musicalInstruments.managers;

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
import ua.lviv.iot.musicalInstruments.models.Trumpet;

import static org.assertj.core.api.Assertions.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MusicalInstrumentWriterTest {

  private List<MusicalInstrument> testInstrumentList = new ArrayList<>(
      Arrays.asList(new MusicalInstrument(1234.3, 2345.8,
              "TestProducer1", TypeOfInstrument.STRING, 2.8),
          new MusicalInstrument(1234.1, 2345.5,
              "TestProducer2", TypeOfInstrument.WIND, 2.6),
          new MusicalInstrument(2456.6, 5385.9,
              "TestProducer3", TypeOfInstrument.PERCURSSION, 3.5))
  );

  private MusicalInstrumentWriter testWriter = new MusicalInstrumentWriter();

  @Test
  void writeToFile() {
    File actualFile = new File("src\\test\\resources\\actualFile.csv");
    File expectedFile = new File("src\\test\\resources\\expectedFile.csv");

    testWriter.setFileForWriting(expectedFile);
    testWriter.writeToFile(testInstrumentList);

    assertThat(actualFile).hasSameContentAs(expectedFile);
  }

  @Test
  void testGetterSetter() {
    PojoClass pojoclass = PojoClassFactory.getPojoClass(MusicalInstrumentWriter.class);
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