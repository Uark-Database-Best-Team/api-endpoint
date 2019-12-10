package main.apiendpoint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer orderId;
  // private String creationDate;
  // private String orderStatus;
  // private Integer shippingAddressId;
  // private Integer billingAddressId;
  // private Float price;
  // private Integer creditCardId;
  // private Integer customerId;
  // private Integer employeeId;

  public Integer getOrderId() {
    return this.orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  // public String getCreationDate() {
  // return this.creationDate;
  // }

  // public void setCreationDate(String creationDate) {
  // this.creationDate = creationDate;
  // }

  // public String getOrderStatus() {
  // return this.orderStatus;
  // }

  // public void setOrderStatus(String orderStatus) {
  // this.orderStatus = orderStatus;
  // }

  // public Integer getShippingAddressId() {
  // return this.shippingAddressId;
  // }

  // public void setShippingAddressId(Integer shippingAddressId) {
  // this.shippingAddressId = shippingAddressId;
  // }

  // public Integer getBillingAddressId() {
  // return this.billingAddressId;
  // }

  // public void setBillingAddressId(Integer billingAddressId) {
  // this.billingAddressId = billingAddressId;
  // }

  // public Float getPrice() {
  // return this.price;
  // }

  // public void setPrice(Float price) {
  // this.price = price;
  // }

  // public Integer getCreditCardId() {
  // return this.creditCardId;
  // }

  // public void setCreditCardId(Integer creditCardId) {
  // this.creditCardId = creditCardId;
  // }

  // public Integer getCustomerId() {
  // return this.customerId;
  // }

  // public void setCustomerId(Integer customerId) {
  // this.customerId = customerId;
  // }

  // public Integer getEmployeeId() {
  // return this.employeeId;
  // }

  // public void setEmployeeId(Integer employeeId) {
  // this.employeeId = employeeId;
  // }

}