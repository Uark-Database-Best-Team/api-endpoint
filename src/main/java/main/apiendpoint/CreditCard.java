package main.apiendpoint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class CreditCard {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer creditCardId;
  private Integer number;
  private Integer ccv;
  private String expirationDate;
  private String name;

  public Integer getCreditCardId() {
    return this.creditCardId;
  }

  public void setCreditCardId(Integer creditCardId) {
    this.creditCardId = creditCardId;
  }

  public Integer getNumber() {
    return this.number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public Integer getCCV() {
    return this.ccv;
  }

  public void setState(Integer ccv) {
    this.ccv = ccv;
  }

  public String getExpirationDate() {
    return this.expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}