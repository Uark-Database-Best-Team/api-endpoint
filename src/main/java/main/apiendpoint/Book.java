package main.apiendpoint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer isbn;
  private Integer edition;
  private String title;
  private Integer year;
  private String publisher;
  private String authors;

  public Integer getId() {
    return isbn;
  }

  public void setId(Integer id) {
    this.isbn = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getEdition() {
    return edition;
  }

  public void setEdition(Integer edition) {
    this.edition = edition;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public String authors() {
    return authors;
  }

  public void setAuthors(String authors) {
    this.authors = authors;
  }
}