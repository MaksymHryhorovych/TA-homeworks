package com.epam.homework6;

public class Books {
    private int positionCounter = 0;
    private int arrayLength;
    private Book[] books;

    public Books(int arrayLength) {
        this.books = new Book[arrayLength];
        this.arrayLength = arrayLength;
    }

    public Book[] getBooks() {
        return books;
    }
    public void setBooks(Book[] books) {
        this.books = books;
    }
    public int getArrayLength() {
        return arrayLength;
    }
    public void setArrayLength(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    public void addNewBook (Book book) {
        this.books[positionCounter++] = book;
    }

    public void viewAllBooks () {
        if (books.length == 0) {
            System.out.println("Books not found");
        } else {
            for (Book book : books) {
                boolean test;
                test = book == null;
                if (!test) {
                    book.view();
                } else {
                    break;
                }
            }
        }
    }

    public void increaseCost(double percent) {
        for (Book book : books) {
            boolean test;
            test = book == null;
            if (!test) {
                double oldCost = book.getCost();
                double change = (percent / 100) * oldCost;
                double newCost = oldCost + change;
                book.setCost((int)newCost);
            } else {
                break;
            }
        }
    }

    public void decreaseCost(double percent) {
        for (Book book : books) {
            boolean test;
            test = book == null;
            if (!test) {
                double oldCost = book.getCost();
                double change = (percent / 100) * oldCost;
                double newCost = oldCost - change;
                book.setCost((int)newCost);
            } else {
                break;
            }
        }
    }

    public Books searchAuthor(String searchingAuthor) {
        Books searchedBooks = new Books(arrayLength);
        for (Book book : books) {
            boolean test;
            test = book == null;
            if (!test) {
                String currentAuthor = book.getAuthor();
                if (currentAuthor.equalsIgnoreCase(searchingAuthor)) {
                    searchedBooks.addNewBook(book);
                }
            } else {
                break;
            }
        }
        return searchedBooks;
    }

    public Books booksAfterYear(int searchingYear) {
        Books searchedBooks = new Books(arrayLength);
        for (Book book : books) {
            boolean test;
            test = book == null;
            if (!test) {
                int currentYear = book.getPublishingYear();
                if (currentYear >= searchingYear) {
                    searchedBooks.addNewBook(book);
                }
            } else {
                break;
            }
        }
        return searchedBooks;
    }
}
