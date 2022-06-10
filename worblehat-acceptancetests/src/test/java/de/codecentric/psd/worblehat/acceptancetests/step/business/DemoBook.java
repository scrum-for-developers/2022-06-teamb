package de.codecentric.psd.worblehat.acceptancetests.step.business;

public class DemoBook {

  private String title;
  private String author;
  private String edition;

  private String isbn;
  private String yearOfPublication;

  public DemoBook(
      String title, String author, String edition, String isbn, String yearOfPublication) {
    this.title = title;
    this.author = author;
    this.edition = edition;
    this.isbn = isbn;
    this.yearOfPublication = yearOfPublication;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getEdition() {
    return edition;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getYearOfPublication() {
    return yearOfPublication;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setEdition(String edition) {
    this.edition = edition;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public void setYearOfPublication(String yearOfPublication) {
    this.yearOfPublication = yearOfPublication;
  }
}
