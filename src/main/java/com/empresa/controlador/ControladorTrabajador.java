package com.empresa.controlador;

import com.empresa.modelo.Trabajador;
import com.empresa.repositorio.RepositorioTrabajador;

public class ControladorTrabajador {
    private RepositorioTrabajador repositorio;

    public ControladorTrabajador() {
        this.repositorio = new RepositorioTrabajador();
    }

    public void crearTrabajador(String nombre, String apellido, String rut, String isapre, String afp) {
        Trabajador trabajador = new Trabajador(nombre, apellido, rut, isapre, afp);
        repositorio.guardarTrabajador(trabajador);
    }

    public Trabajador obtenerTrabajador() {
        return repositorio.obtenerTrabajador();
    }

    public void actualizarTrabajador(Trabajador trabajador) {
        repositorio.guardarTrabajador(trabajador);
    }
}
