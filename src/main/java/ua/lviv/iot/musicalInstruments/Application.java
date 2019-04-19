package ua.lviv.iot.musicalInstruments;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.musicalInstruments.enums.MaterialOfDeck;
import ua.lviv.iot.musicalInstruments.enums.MaterialOfFingerBoard;
import ua.lviv.iot.musicalInstruments.enums.TypeOfGuitar;
import ua.lviv.iot.musicalInstruments.enums.TypeOfInstrument;
import ua.lviv.iot.musicalInstruments.models.Guitar;
import ua.lviv.iot.musicalInstruments.models.MusicalInstrument;
import ua.lviv.iot.musicalInstruments.repositories.GuitarRepository;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public CommandLineRunner musicalInstrumentBean(GuitarRepository repository) {
    return (args) -> {
      repository.save(new Guitar(new MusicalInstrument(333.0, 34.1, "yamaha",
              TypeOfInstrument.STRING, 2.3), 6, MaterialOfFingerBoard.ASH,
              TypeOfGuitar.ELECTRIC, MaterialOfDeck.ALDER));
      repository.save(new Guitar(new MusicalInstrument(333.0, 44.1, "zero",
              TypeOfInstrument.STRING, 2.7), 9, MaterialOfFingerBoard.ASH,
              TypeOfGuitar.ELECTRIC, MaterialOfDeck.ALDER));
      repository.save(new Guitar(new MusicalInstrument(433.0, 54.1, "zeeeero",
              TypeOfInstrument.STRING, 2.7), 9, MaterialOfFingerBoard.ASH,
              TypeOfGuitar.ELECTRIC, MaterialOfDeck.ALDER));
    };
  }
}