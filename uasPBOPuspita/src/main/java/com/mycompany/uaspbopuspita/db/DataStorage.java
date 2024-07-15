/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uaspbopuspita.db;

/**
 *
 * @author A-26
 */
import com.mycompany.uaspbopuspita.model.Note;

import java.util.List;

public interface DataStorage {
    void addNote(Note note);
    List<Note> getAllNotes();
    void deleteNoteById(int id);
}