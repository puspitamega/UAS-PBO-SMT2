/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uaspbopuspita.db;

import com.mycompany.uaspbopuspita.model.Note;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NoteService {
    private final DataStorage dataStorage;

    public NoteService(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void addNote(String description) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        Note note = new Note(description, timestamp);
        dataStorage.addNote(note);
    }

    public List<Note> getAllNotes() {
        return dataStorage.getAllNotes();
    }

    public void deleteNoteById(int id) {
        dataStorage.deleteNoteById(id);
    }
}