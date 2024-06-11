package com.empresa.repositorio;

import com.empresa.modelo.Trabajador;

public class RepositorioTrabajador {
    private Trabajador trabajador;

    public void guardarTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Trabajador obtenerTrabajador() {
        return trabajador;
    }
}
