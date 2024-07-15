/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uaspbopuspita.model;

/**
 *
 * @author A-26
 */
public class Note {
    private int id;
    private String description;
    private String timestamp;

    public Note() {
    }

    public Note(String description, String timestamp) {
        this.description = description;
        this.timestamp = timestamp;
    }

    // Getter dan setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}