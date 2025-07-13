package com.example.thoughts.Entity;

//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.NonNull;
//import org.bson.types.ObjectId;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.index.Indexed;
//import org.springframework.data.mongodb.core.mapping.DBRef;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Document(collection = "Users")
//@Data
//@NoArgsConstructor
//public class User {
//    @Id
//    ObjectId id;
//    @NonNull
//    @Indexed(unique = true)
//    String name;
//    @NonNull
//    String password;
//    @DBRef
//    List<JournalEntry> journalEntryList = new ArrayList<>();
//    List<String> roles = new ArrayList<>();
//}
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Users")
public class User {

    @Id
    private ObjectId id;

    @Indexed(unique = true)
    private String name;

    private String password;

    @DBRef
    private List<JournalEntry> journalEntryList = new ArrayList<>();

    private List<String> roles = new ArrayList<>();

    // No-args constructor
    public User() {
    }

    // All-args constructor (optional)
    public User(ObjectId id, String name, String password, List<JournalEntry> journalEntryList, List<String> roles) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.journalEntryList = journalEntryList;
        this.roles = roles;
    }

    // Getters and Setters
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<JournalEntry> getJournalEntryList() {
        return journalEntryList;
    }

    public void setJournalEntryList(List<JournalEntry> journalEntryList) {
        this.journalEntryList = journalEntryList;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", journalEntryList=" + journalEntryList +
                ", roles=" + roles +
                '}';
    }
}
