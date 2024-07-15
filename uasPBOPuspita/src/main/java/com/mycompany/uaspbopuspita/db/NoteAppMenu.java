package com.mycompany.uaspbopuspita.db;

import java.util.Scanner;

public class NoteAppMenu {
    private final Scanner scanner;

    public NoteAppMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public NoteAppMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int displayMenuAndGetChoice() {
        System.out.println("Note App Menu : Oleh Puspita Mega Lestari NIM 23201291");
        System.out.println("Menu:");
        System.out.println("1. Tambah Catatan");
        System.out.println("2. Tampilkan Catatan");
        System.out.println("3. Hapus Catatan");
        System.out.println("4. Keluar");

        System.out.print("Pilih: ");
        return scanner.nextInt();
    }

    public void displayAddNotePrompt() {
        scanner.nextLine(); // Clear newline
        System.out.print("Masukkan deskripsi catatan: ");
    }

    public void displayDeleteNotePrompt() {
        System.out.print("Masukkan ID catatan yang ingin dihapus: ");
    }

    public void displayNoteAddedConfirmation() {
        System.out.println("Catatan berhasil ditambahkan.");
    }

    public void displayNoteDeletedConfirmation() {
        System.out.println("Catatan berhasil dihapus.");
    }

    public void displayNoNotesMessage() {
        System.out.println("Tidak ada catatan.");
    }

    public void displayNotes(String[] notes) {
        System.out.println("Catatan:");
        for (int i = notes.length - 1; i >= 0; i--) {
            System.out.println((i + 1) + ". " + notes[i]);
        }
    }

    public void displayExitMessage() {
        System.out.println("Keluar dari aplikasi.");
    }

    public void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
