package com.ftn.Agencija.model;

public class Putovanje {

    private Long id;
    private String nazivDestinacije;
    private String prevoznoSredstvo;
    private String smestajnaJedinica;
    private String kategorijaPutovanja;
    private String datumVremePolaska;
    private String datumVremeDolaska;
    private int brojNocenja;
    private int cena;
    private int ukupanBrojMesta;
    private int brojSlobodnihMesta;

    public Putovanje(Long id, String nazivDestinacije, String prevoznoSredstvo, String smestajnaJedinica, String kategorijaPutovanja, String datumVremePolaska, String datumVremeDolaska, int brojNocenja, int cena, int ukupanBrojMesta, int brojSlobodnihMesta) {
        this.id = id;
        this.nazivDestinacije = nazivDestinacije;
        this.prevoznoSredstvo = prevoznoSredstvo;
        this.smestajnaJedinica = smestajnaJedinica;
        this.kategorijaPutovanja = kategorijaPutovanja;
        this.datumVremePolaska = datumVremePolaska;
        this.datumVremeDolaska = datumVremeDolaska;
        this.brojNocenja = brojNocenja;
        this.cena = cena;
        this.ukupanBrojMesta = ukupanBrojMesta;
        this.brojSlobodnihMesta = brojSlobodnihMesta;
    }

    public Putovanje(String nazivDestinacije, String prevoznoSredstvo, String smestajnaJedinica, String kategorijaPutovanja, String datumVremePolaska, String datumVremeDolaska, int brojNocenja, int cena, int ukupanBrojMesta, int brojSlobodnihMesta) {
        this.nazivDestinacije = nazivDestinacije;
        this.prevoznoSredstvo = prevoznoSredstvo;
        this.smestajnaJedinica = smestajnaJedinica;
        this.kategorijaPutovanja = kategorijaPutovanja;
        this.datumVremePolaska = datumVremePolaska;
        this.datumVremeDolaska = datumVremeDolaska;
        this.brojNocenja = brojNocenja;
        this.cena = cena;
        this.ukupanBrojMesta = ukupanBrojMesta;
        this.brojSlobodnihMesta = brojSlobodnihMesta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazivDestinacije() {
        return nazivDestinacije;
    }

    public void setNazivDestinacije(String nazivDestinacije) {
        this.nazivDestinacije = nazivDestinacije;
    }

    public String getPrevoznoSredstvo() {
        return prevoznoSredstvo;
    }

    public void setPrevoznoSredstvo(String prevoznoSredstvo) {
        this.prevoznoSredstvo = prevoznoSredstvo;
    }

    public String getSmestajnaJedinica() {
        return smestajnaJedinica;
    }

    public void setSmestajnaJedinica(String smestajnaJedinica) {
        this.smestajnaJedinica = smestajnaJedinica;
    }

    public String getKategorijaPutovanja() {
        return kategorijaPutovanja;
    }

    public void setKategorijaPutovanja(String kategorijaPutovanja) {
        this.kategorijaPutovanja = kategorijaPutovanja;
    }

    public String getDatumVremePolaska() {
        return datumVremePolaska;
    }

    public void setDatumVremePolaska(String datumVremePolaska) {
        this.datumVremePolaska = datumVremePolaska;
    }

    public String getDatumVremeDolaska() {
        return datumVremeDolaska;
    }

    public void setDatumVremeDolaska(String datumVremeDolaska) {
        this.datumVremeDolaska = datumVremeDolaska;
    }

    public int getBrojNocenja() {
        return brojNocenja;
    }

    public void setBrojNocenja(int brojNocenja) {
        this.brojNocenja = brojNocenja;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getUkupanBrojMesta() {
        return ukupanBrojMesta;
    }

    public void setUkupanBrojMesta(int ukupanBrojMesta) {
        this.ukupanBrojMesta = ukupanBrojMesta;
    }

    public int getBrojSlobodnihMesta() {
        return brojSlobodnihMesta;
    }

    public void setBrojSlobodnihMesta(int brojSlobodnihMesta) {
        this.brojSlobodnihMesta = brojSlobodnihMesta;
    }
}
