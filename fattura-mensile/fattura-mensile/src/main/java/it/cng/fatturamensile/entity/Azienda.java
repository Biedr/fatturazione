package it.cng.fatturamensile.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Azienda {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String nome;
  private int iva;

  private int tariffaOraria;
  @OneToMany
  private List<Lavoratore> lavoratori;
  private float totOreLavorate;
  private double importoTotale;

  public Azienda(){

  }
}
