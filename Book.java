package Chapter1;

import nada.*;
import java.util.ArrayList;
import java.util.List;

class Book {
    private String name;
    private int releaseYear;
    private String isbn;

    public Book(String name, int releaseYear, String isbn) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.isbn = isbn;
    }
     
    // getters and setters

    public  String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name + ", releaseYear=" + releaseYear + ", isbn=" + isbn ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public  String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public static List<Book> getBooks (){
          List<Book> bookList = new ArrayList<>();
     bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
     bookList.add(new Book("The Two Towers", 1954, "0345339711"));
     bookList.add(new Book("The Return of the King", 1955, "0618129111"));
     return bookList;
    }
}