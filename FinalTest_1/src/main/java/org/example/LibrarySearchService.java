package org.example;



import java.util.ArrayList;
import java.util.List;

public class LibrarySearchService implements SearchService{
    private List<LibraryItem> libraryItems;

    public LibrarySearchService(List<LibraryItem> libraryItems) {
        this.libraryItems = libraryItems;
    }

    @Override
    public List<LibraryItem> searchByInventoryNumber(String inventoryNumber) {
        List<LibraryItem> result = new ArrayList<>();
        for (LibraryItem item : libraryItems){
            if (item.getInventoryNumber().equalsIgnoreCase(inventoryNumber)){
                result.add(item);
            }
        }
        if (result.size() == 0){
            System.out.println("Издание не найдено");
        }
        return result;
    }

    @Override
    public List<LibraryItem> searchByAuthor(String author) {
        List<LibraryItem> result = new ArrayList<>();
        for (LibraryItem item : libraryItems){
            if (item.getAuthor().equalsIgnoreCase(author)){
                result.add(item);
            }
        }
        if (result.size() == 0){
            System.out.println("Издание не найдено");
        }
        return result;
    }
}
