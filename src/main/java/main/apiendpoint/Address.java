package main.apiendpoint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer addressId;
  private Integer zip;
  private String state;
  private String city;
  private String street;

  public Integer getAddressId() {
    return this.addressId;
  }

  public void setAddressId(Integer addressId) {
    this.addressId = addressId;
  }

  public Integer getZip() {
    return this.zip;
  }

  public void setZip(Integer zip) {
    this.zip = zip;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return this.street;
  }

  public void setAddressId(String street) {
    this.street = street;
  }
}