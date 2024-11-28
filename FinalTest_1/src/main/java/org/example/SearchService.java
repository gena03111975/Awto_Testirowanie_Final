package org.example;



import java.util.List;

public interface SearchService {
    List<LibraryItem> searchByInventoryNumber(String inventoryNumber);
    List<LibraryItem> searchByAuthor(String author);
}
