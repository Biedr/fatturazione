package it.cng.fatturamensile.entity;

import it.cng.fatturamensile.model.GiornataLavorativa;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Lavoratore {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer lavoratoreId;
  private String nome;
  @Transient
  private List<GiornataLavorativa> giornataLavorativa;

  public Lavoratore(){
  }

}
