package com.cardealer.cardealer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Cars {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idcars;

  private Long id_car_owner;
  private String producent;
  private String model;
  private String production_year;
  private Integer engine_capacity;
  private String engine_type;
  private BigDecimal price;
  private String petrol_type;
  private String country_of_origin;
  private String vin;

}
