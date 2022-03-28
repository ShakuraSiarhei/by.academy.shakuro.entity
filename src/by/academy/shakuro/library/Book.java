package by.academy.shakuro.library;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int numberOfPages;
    private int price;
    private String typeOfBind;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfBind() {
        return typeOfBind;
    }

    public void setTypeOfBind(String typeOfBind) {
        this.typeOfBind = typeOfBind;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", typeOfBind='" + typeOfBind + '\'' +
                '}';
    }
}
