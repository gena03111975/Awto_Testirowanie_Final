package org.example;



public class Letter extends AbstractLibrary {
    private String recipient;

    public Letter(String author, String inventoryNumber, String recipient) {
        super(author, inventoryNumber);
        this.recipient = recipient;
    }

    public String getRecipient() {
        return recipient;
    }

    @Override
    public String toString() {
        return "Письмо { " +
                "получатель='" + recipient + '\'' +
                '}'+ "\n";
    }
}