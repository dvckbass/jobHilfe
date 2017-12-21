package com.example.luongtiendat.jobhilfe.Model;

/**
 * Created by Luong Tien Dat on 13.12.2017.
 */

public class User {
    private String Vorname;
    private String Nachname;
    private String Password;
    private String Email;

    public User() {
    }

    public User(String vorname, String nachname, String password, String email) {
        Vorname = vorname;
        Nachname = nachname;
        Password = password;
        Email = email;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
