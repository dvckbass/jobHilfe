package com.example.luongtiendat.jobhilfe.Model;

/**
 * Created by Luong Tien Dat on 18.12.2017.
 */

public class Auftrag {
    private String titel;
    private String arbeitgerber;
    private String stellenBeschreibung;
    private String arbeitOrt;
    private String beginnTatigkeit;
    private String arbeitZeit;
    private String vergutung;

    public Auftrag() {
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getArbeitgerber() {
        return arbeitgerber;
    }

    public void setArbeitgerber(String arbeitgerber) {
        this.arbeitgerber = arbeitgerber;
    }

    public String getStellenBeschreibung() {
        return stellenBeschreibung;
    }

    public void setStellenBeschreibung(String stellenBeschreibung) {
        this.stellenBeschreibung = stellenBeschreibung;
    }

    public String getArbeitOrt() {
        return arbeitOrt;
    }

    public void setArbeitOrt(String arbeitOrt) {
        this.arbeitOrt = arbeitOrt;
    }

    public String getBeginnTatigkeit() {
        return beginnTatigkeit;
    }

    public void setBeginnTatigkeit(String beginnTatigkeit) {
        this.beginnTatigkeit = beginnTatigkeit;
    }

    public String getArbeitZeit() {
        return arbeitZeit;
    }

    public void setArbeitZeit(String arbeitZeit) {
        this.arbeitZeit = arbeitZeit;
    }

    public String getVergutung() {
        return vergutung;
    }

    public void setVergutung(String vergutung) {
        this.vergutung = vergutung;
    }
}
