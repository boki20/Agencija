DROP SCHEMA IF EXISTS agencija;
CREATE SCHEMA agencija DEFAULT CHARACTER SET utf8;
USE agencija;

CREATE TABLE korisnici (
                           id BIGINT AUTO_INCREMENT,
                           ime VARCHAR(20),
                           prezime VARCHAR(20),
                           email VARCHAR(20) NOT NULL,
                           lozinka VARCHAR(20) NOT NULL,
                           datumRodjenja DATE,
                           jmbg VARCHAR(20),
                           adresa VARCHAR(20),
                           brojtelefona INT,
                           uloga VARCHAR(20),
                           PRIMARY KEY(id)
);

CREATE TABLE putovanja (
                        id BIGINT AUTO_INCREMENT,
                        nazivDestinacije VARCHAR(75) NOT NULL,
                        prevoznoSredstvo VARCHAR(75),
                        smestajnaJedinica VARCHAR(75) NOT NULL,
                        kategorijaPutovanja VARCHAR(75) NOT NULL,
                        datumVremePolaska DATE,
                        datumVremeDolaska DATE,
                        brojNocenja INT,
                        cena INT,
                        ukupanBrojMesta INT,
                        brojSlobodnihMesta INT,
                        PRIMARY KEY(id)
);