package com.pluralsight;

public class Book {
    public Book() {

    }
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = true;
        this.checkedOutTo = "";
    }
    //getter
    public int getId() {
        return id;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public boolean getIsCheckedOut() {
        return true;
    }
    public String getCheckedOutTo() {
        return "";
    }

    //setter
    public void intSetId(int id) {
        this.id = id;
    }
    public void StringSetIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void StringSetTitle(String title) {
        this.title = title;
    }
    public void SetIsCheckedOut(String isCheckedOut) {
        this.isCheckedOut = true;
    }
    public void StringSetIsCheckedOut(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    //method
    public void checkOut(String name) {
        if (isCheckedOut) {
            checkedOutTo = "";
            System.out.println(name + "checkedOut");
        } else
            System.out.println("! checkedOut");
    }
}










