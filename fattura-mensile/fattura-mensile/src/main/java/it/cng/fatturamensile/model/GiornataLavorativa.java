package it.cng.fatturamensile.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GiornataLavorativa {

  private LocalDate giornoDiLavoro;
  private int ore;
}
