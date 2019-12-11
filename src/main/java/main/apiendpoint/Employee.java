package main.apiendpoint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer employeeID;
  private Integer salary;
  private boolean isManager;
  private Integer addressId;
  private String name;

  public Integer getId() {
    return employeeID;
  }

  public void setId(Integer id) {
    this.employeeID = id;
  }

  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }

  public Integer getAddressId() {
    return addressId;
  }

  public void setAddressId(Integer ai) {
    this.addressId = ai;
  }

  public String getName() {
    return name;
  }

  public void setName(String n) {
    this.name = n;
  }

  public boolean getIsManager() {
    return isManager;
  }

  public void setIsManager(boolean im) {
    this.isManager= im;
  }
}