package de.codecentric.psd.worblehat.acceptancetests.step.business;

public class DemoBookFactory {

  private DemoBook book;

  private DemoBookFactory() {
    this.book = new DemoBook("A book title", "A book author", "1", "123456789X", "2013");
  }

  public static DemoBookFactory createDemoBook() {
    return new DemoBookFactory();
  }

  public DemoBookFactory withTitle(String title) {
    this.book.setTitle(title);
    return this;
  }

  public DemoBookFactory withAuthor(String author) {
    this.book.setAuthor(author);
    return this;
  }

  public DemoBookFactory withEdition(String edition) {
    this.book.setEdition(edition);
    return this;
  }

  public DemoBookFactory withISBN(String isbn) {
    this.book.setIsbn(isbn);
    return this;
  }

  public DemoBookFactory withYearOfPublication(String year) {
    this.book.setYearOfPublication(year);
    return this;
  }

  public DemoBook build() {
    return book;
  }
}
