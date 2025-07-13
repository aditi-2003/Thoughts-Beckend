package com.example.thoughts.Entity;

//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//import org.bson.types.ObjectId;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import java.time.LocalDateTime;
//
//@Setter
//@Getter
//@Document(collection = "journalentries")
//@Data
//public class JournalEntry {
//    @Id
//    ObjectId id;
//    String title;
//    String  description;
//    LocalDateTime date;
//
//    public JournalEntry(){
//    }
//
//    public JournalEntry(ObjectId id) {
//        this.id = id;
//    }
//
//}
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "journalentries")
public class JournalEntry {

    @Id
    private ObjectId id;

    private String title;
    private String description;
    private LocalDateTime date;

    // No-args constructor
    public JournalEntry() {
    }

    // Constructor with id only
    public JournalEntry(ObjectId id) {
        this.id = id;
    }

    // Getters and Setters
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    // toString method
    @Override
    public String toString() {
        return "JournalEntry{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
