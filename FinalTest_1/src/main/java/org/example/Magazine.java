package org.example;



public class Magazine extends AbstractLibrary{
    private String title;
    private String issue;

    public Magazine(String author, String inventoryNumber, String title, String issue) {
        super(author, inventoryNumber);
        this.title = title;
        this.issue = issue;
    }

    public String getTitle() {
        return title;
    }

    public String getIssue() {
        return issue;
    }

    @Override
    public String toString() {
        return "Журнал { " +
                "название = '" + title + '\'' +
                ", выпуск = '" + issue + '\'' +
                '}'+ "\n";
    }
}
