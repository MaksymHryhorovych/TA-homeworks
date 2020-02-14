package com.epam.homework6;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int publishingYear;
    private int numOfPages;
    private int cost;

    public Book(int id, String name, String author, String publisher, int publishingYear, int numOfPages, int cost) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.numOfPages = numOfPages;
        this.cost = cost;
    }

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
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public int getNumOfPages() {
        return numOfPages;
    }
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public void view() {
        System.out.println("ID = " + id + "\nName = " + name + "\nAuthor = " + author + "\nPublisher = " + publisher
        + "\nPublishing year = " + publishingYear + "\n Number of pages = " + numOfPages + "\nCost = " + cost + "\n**********");
    }
}
