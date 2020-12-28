package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {

        Book first = new Book("first");
        Book second = new Book("second");
        Book third = new Book("third");
        Book four = new Book("Clean code");

        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = four;

        for (int i = 0; i < books.length; i++) {
            Book currentBook = books[i];
            System.out.println(currentBook.getName());
        }

        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;

        for (int i = 0; i < books.length; i++) {
            Book currentBook = books[i];
            if (currentBook.equals(four)) {
                System.out.println(currentBook.getName());
            }
        }

    }
}
