package com.ftn.Agencija.listeners;

import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InitHttpSessionListener implements HttpSessionListener {
    /** kod koji se izvrsava po kreiranju sesije */
    public void sessionCreated(HttpSessionEvent arg0) {
        System.out.println("Inicijalizacija sesisje HttpSessionListener...");




        System.out.println("Uspeh HttpSessionListener!");
    }

    /** kod koji se izvrsava po brisanju sesije */
    public void sessionDestroyed(HttpSessionEvent arg0) {
        System.out.println("Brisanje sesisje HttpSessionListener...");

        System.out.println("Uspeh HttpSessionListener!");
    }
}
