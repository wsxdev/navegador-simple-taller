package com.dev.app;

import com.dev.pagina.*;

public class App {

    public static void main(String[] args) {
        PaginaWeb navegar = new PaginaWeb("google.com");

        System.out.println("| INICIANDO NAVEGADOR WEB |");
        System.out.println("Página inicial cargada:");
        navegar.getPaginaActual();

        // NAVEGACIÓN A NUEVAS PÁGINAS
        System.out.println("\nNavegando a una nueva página web...");
        navegar.navegarAdelante("facebook.com");
        navegar.getPaginaActual();

        System.out.println("\nEl usuario hace clic en un enlace...");
        navegar.navegarAdelante("instagram.com");
        navegar.getPaginaActual();

        System.out.println("\nAccediendo a otra página web...");
        navegar.navegarAdelante("twitter.com");
        navegar.getPaginaActual();

        // NAVEGACIÓN HACIA ATRÁS
        System.out.println("\nEl usuario presiona el botón 'Atrás'");
        if (navegar.navegarAtras()) {
            System.out.println("Regresando a la página anterior...");
            navegar.getPaginaActual();
        } else {
            System.out.println("No hay historial previo disponible");
        }

        System.out.println("\nUsuario presiona 'Atrás' nuevamente");
        if (navegar.navegarAtras()) {
            System.out.println("Volviendo atrás en el historial...");
            navegar.getPaginaActual();
        } else {
            System.out.println("No hay más páginas en el historial");
        }

        // NAVEGACIÓN HACIA ADELANTE
        System.out.println("\nUsuario presiona el botón 'Adelante'");
        if (navegar.navegarAdelante(null)) {
            System.out.println("Avanzando a la siguiente página...");
            navegar.getPaginaActual();
        } else {
            System.out.println("No hay páginas posteriores disponibles");
        }

        // NUEVA NAVEGACIÓN
        System.out.println("\nEl usuario ingresa una nueva URL");
        navegar.navegarAdelante("netflix.com");
        System.out.println("Cargando nueva página web:");
        navegar.getPaginaActual();
    }
}