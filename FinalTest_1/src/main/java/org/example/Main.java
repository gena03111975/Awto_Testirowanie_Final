package org.example;



import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(new Book("Автор 1", "INV001", "Книга 1", 250));
        libraryItems.add(new Magazine("Автор 2", "INV002", "Журнал 1", "Выпуск 1"));
        libraryItems.add(new Letter("Автор 3", "INV003", "Получатель 1"));
        libraryItems.add(new Microfilm("Автор 4", "INV004", "Описание микрофильма1"));
        libraryItems.add(new Book("Автор 2", "INV005", "Книга 2", 25));
        libraryItems.add(new Magazine("Автор 1", "INV006", "Журнал 2", "Выпуск 2"));
        libraryItems.add(new Letter("Автор 1", "INV007", "Получатель 2"));
        libraryItems.add(new Microfilm("Автор 1", "INV008", "Описание микрофильма2"));

        SearchService searchService = new LibrarySearchService(libraryItems);

        String searchNumber = "INV001";
        System.out.println("Результаты поиска '" + searchNumber + "' -> ");
        List<LibraryItem> foundByInventoryNumber = searchService.searchByInventoryNumber(searchNumber);
        for (LibraryItem item : foundByInventoryNumber) {
            System.out.println(item.getInventoryNumber() + ": " + item.getAuthor() + foundByInventoryNumber);
        }
        System.out.println();

        String searchAuthor = "Автор 1";
        System.out.println("Результаты поиска '" + searchAuthor + "' -> ");
        List<LibraryItem> foundByAuthor = searchService.searchByAuthor(searchAuthor);
        for (LibraryItem item : foundByAuthor) {
            System.out.println(item.getInventoryNumber() + ": " + item.getAuthor() + foundByAuthor);
        }
    }
}