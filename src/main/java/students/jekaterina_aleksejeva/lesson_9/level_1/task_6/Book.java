package students.jekaterina_aleksejeva.lesson_9.level_1.task_6;

class Book {

    private String title;
    private String author;

    public Book (String title, String author) {
        this.title = title;
        this.author = author;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}