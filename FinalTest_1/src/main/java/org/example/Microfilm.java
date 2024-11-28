package org.example;



public class Microfilm extends AbstractLibrary{
    private String description;

    public Microfilm(String author, String inventoryNumber, String description) {
        super(author, inventoryNumber);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Микрофильм { " +
                "описание микрофильма = '" + description + '\'' +
                '}'+ "\n";
    }
}
