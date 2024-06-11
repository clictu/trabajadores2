package com.empresa.vista;

import com.empresa.controlador.ControladorTrabajador;
import com.empresa.modelo.Trabajador;

import java.util.Scanner;

public class CLITrabajador implements VistaTrabajador {
    private ControladorTrabajador controlador;

    public CLITrabajador(ControladorTrabajador controlador) {
        this.controlador = controlador;
    }

    @Override
    public void mostrarMenu() {
        System.out.println("1. Crear Trabajador");
        System.out.println("2. Ver Trabajador");
        System.out.println("3. Editar Trabajador");
        System.out.println("4. Salir");
    }

    @Override
    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("RUT: ");
        String rut = scanner.nextLine();

        System.out.print("Isapre: ");
        String isapre = scanner.nextLine();

        System.out.print("AFP: ");
        String afp = scanner.nextLine();

        controlador.crearTrabajador(nombre, apellido, rut, isapre, afp);
    }

    @Override
    public void mostrarDatos(Trabajador trabajador) {
        if (trabajador == null) {
            System.out.println("No hay datos de trabajador.");
        } else {
            System.out.println("Nombre: " + trabajador.getNombre());
            System.out.println("Apellido: " + trabajador.getApellido());
            System.out.println("RUT: " + trabajador.getRut());
            System.out.println("Isapre: " + trabajador.getIsapre());
            System.out.println("AFP: " + trabajador.getAfp());
        }
    }

    @Override
    public void editarDatos(Trabajador trabajador) {
        if (trabajador == null) {
            System.out.println("No hay datos de trabajador para editar.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nuevo Nombre: ");
        trabajador.setNombre(scanner.nextLine());

        System.out.print("Nuevo Apellido: ");
        trabajador.setApellido(scanner.nextLine());

        System.out.print("Nueva Isapre: ");
        trabajador.setIsapre(scanner.nextLine());

        System.out.print("Nueva AFP: ");
        trabajador.setAfp(scanner.nextLine());

        controlador.actualizarTrabajador(trabajador);
    }
}
