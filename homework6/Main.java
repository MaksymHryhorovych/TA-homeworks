package com.epam.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num of books: ");

        Books books = new Books(scanner.nextInt());

        Book book1 = new Book(0,"The name of the rose","Umberto Eco",
                "San Diego : Harcourt Brace Jovanovich",1983,520,150);
        books.addNewBook(book1);

        Book book2 = new Book(1, "Fahrenheit 451", "Ray Douglas Bradbury",
                "Ballantine Books", 1953, 256, 200);
        books.addNewBook(book2);

        Book book3 = new Book(2, "The Martian Chronicles", "Ray Douglas Bradbury",
                "Doubleday", 1950, 222, 190);
        books.addNewBook(book3);

        Book book4 = new Book(3, "Chariots of the Gods?", "Erich von Daniken",
                "Putnam", 1968, 267, 450);
        books.addNewBook(book4);

        books.viewAllBooks();

        System.out.println("Enter increase percents: ");
        books.increaseCost(scanner.nextDouble());
        books.viewAllBooks();

        System.out.println("Enter decrease percents: ");
        books.decreaseCost(scanner.nextDouble());
        books.viewAllBooks();

        System.out.println("Enter author you want to find: ");
        scanner.nextLine();
        Books books1 = books.searchAuthor(scanner.nextLine());
        books1.viewAllBooks();

        System.out.println("Enter year: ");
        Books books2 = books.booksAfterYear(scanner.nextInt());
        books2.viewAllBooks();
    }
}
