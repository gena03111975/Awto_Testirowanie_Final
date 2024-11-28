package org.example;



abstract class AbstractLibrary implements LibraryItem {
    private String author;
    private  String inventoryNumber;

    public AbstractLibrary(String author, String inventoryNumber){
        this.author = author;
        this.inventoryNumber = inventoryNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }
}
