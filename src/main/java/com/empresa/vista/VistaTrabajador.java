package com.empresa.vista;

import com.empresa.modelo.Trabajador;

public interface VistaTrabajador {
    void mostrarMenu();
    void leerDatos();
    void mostrarDatos(Trabajador trabajador);
    void editarDatos(Trabajador trabajador);
}
