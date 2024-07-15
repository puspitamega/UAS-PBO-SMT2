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

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseStorage implements DataStorage {
    private static final String DB_URL = "jdbc:sqlite:notes.db";

    public DatabaseStorage() {
        createTable();
    }

    private void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS notes (id INTEGER PRIMARY KEY AUTOINCREMENT, description TEXT, timestamp TEXT)";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void addNote(Note note) {
        String sql = "INSERT INTO notes(description, timestamp) VALUES(?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, note.getDescription());
            pstmt.setString(2, note.getTimestamp());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Note> getAllNotes() {
        String sql = "SELECT * FROM notes ORDER BY id DESC";
        List<Note> notes = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Note note = new Note();
                note.setId(rs.getInt("id"));
                note.setDescription(rs.getString("description"));
                note.setTimestamp(rs.getString("timestamp"));
                notes.add(note);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return notes;
    }

    @Override
    public void deleteNoteById(int id) {
        String sql = "DELETE FROM notes WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}