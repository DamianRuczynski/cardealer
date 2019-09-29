package com.cardealer.cardealer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class cars {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idCars;

  private Long idCarOwner;
  private String producent;
  private String model;
  private String productionYear;
  private Integer engineCapacity;
  private String engineType;
  private BigDecimal price;
  private String petrolType;
  private String countryOfOrigin;
  private String vin;

}
