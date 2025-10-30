package com.dev.pagina;

import java.util.Stack;

public class PaginaWeb {
    private String paginaActual;
    private Stack<String> historialAtras;
    private Stack<String> historialAdelante;

    public PaginaWeb(String paginaInicial) {
        this.paginaActual = paginaInicial;
        this.historialAtras = new Stack<>();
        this.historialAdelante = new Stack<>();
    }

    public void getPaginaActual() {
        System.out.println("Página actual: " + paginaActual);
    }

    public boolean navegarAtras() {
        if (!historialAtras.isEmpty()) {
            // GUARDAMOS LA PÁGINA ACTUAL EN EL HISTORIAL DE ADELANTE
            historialAdelante.push(paginaActual);
            // OBTENEMOS LA ÚLTIMA PÁGINA DEL HISTORIAL ATRÁS
            paginaActual = historialAtras.pop();
            return true;
        }
        return false;
    }

    public boolean navegarAdelante(String nuevaPagina) {
        if (nuevaPagina != null) {
            // SI ES UNA NUEVA PÁGINA, GUARDAMOS LA ACTUAL EN EL HISTORIAL ATRÁS
            historialAtras.push(paginaActual);
            paginaActual = nuevaPagina;
            // LIMPIAMOS EL HISTORIAL ADELANTE YA QUE ES UNA NUEVA NAVEGACIÓN
            historialAdelante.clear();
            return true;
        } else if (!historialAdelante.isEmpty()) {
            // SI NO HAY NUEVA PÁGINA PERO HAY HISTORIAL ADELANTE
            historialAtras.push(paginaActual);
            paginaActual = historialAdelante.pop();
            return true;
        }
        return false;
    }
}