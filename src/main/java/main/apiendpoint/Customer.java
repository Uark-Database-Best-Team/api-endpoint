package main.apiendpoint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Customer {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer customerId;
  private Integer accountId;
  private Integer phone;
  private String name;
  private String email;
  private String password;
  private Integer addressId;

  public Integer getCustomerId() {
    return this.customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public Integer getAccountId() {
    return this.accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public Integer getPhone() {
    return this.phone;
  }

  public void setPhone(Integer phone) {
    this.phone = phone;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getAddressId() {
    return this.addressId;
  }

  public void setAddressId(Integer addressId) {
    this.addressId = addressId;
  }
}