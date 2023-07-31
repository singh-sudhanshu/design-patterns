package creational.builder;

import java.time.Year;

public class Book {

    private final String id;
    private final String title;
    private final String author;
    private final String description;
    private final Year publishedYear;
    private final String genre;

    private Book(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.author = builder.author;
        this.description = builder.description;
        this.publishedYear = builder.publishedYear;
        this.genre = builder.genre;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public Year getPublishedYear() {
        return publishedYear;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", publishedYear=" + publishedYear +
                ", genre='" + genre + '\'' +
                '}';
    }

    public static class Builder {
        private final String id;
        private final String title;
        private String author;
        private String description;
        private Year publishedYear;
        private String genre;

        public Builder(String id, String title) {
            this.id = id;
            this.title = title;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder publishedYear(Year publishedYear) {
            this.publishedYear = publishedYear;
            return this;
        }

        public Builder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
