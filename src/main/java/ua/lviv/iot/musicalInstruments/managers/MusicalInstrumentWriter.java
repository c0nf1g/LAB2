package ua.lviv.iot.musicalInstruments.managers;

import ua.lviv.iot.musicalInstruments.models.MusicalInstrument;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import java.util.List;

public class MusicalInstrumentWriter {
  private File fileForWriting;

  public MusicalInstrumentWriter() { }

  public void writeToFile(final List<MusicalInstrument> listOfInstruments) {
    try (FileOutputStream fos = new FileOutputStream(this.fileForWriting);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bufWriter = new BufferedWriter(osw)) {

        for (MusicalInstrument instrument : listOfInstruments) {
          bufWriter.write(instrument.getHeaders());
          bufWriter.newLine();
          bufWriter.write(instrument.toCsv());

          if (instrument != listOfInstruments.get(listOfInstruments
              .toArray()
              .length - 1)) {
            bufWriter.newLine();
          }
        }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public File getFileForWriting() {
    return fileForWriting;
  }

  public void setFileForWriting(final File fileForWriting) {
    this.fileForWriting = fileForWriting;
  }
}
