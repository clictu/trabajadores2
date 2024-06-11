package com.empresa.main;

import com.empresa.controlador.ControladorTrabajador;
import com.empresa.vista.CLITrabajador;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ControladorTrabajador controlador = new ControladorTrabajador();
        CLITrabajador vista = new CLITrabajador(controlador);

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            vista.mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // consume el salto de línea

            switch (opcion) {
                case 1:
                    vista.leerDatos();
                    break;
                case 2:
                    vista.mostrarDatos(controlador.obtenerTrabajador());
                    break;
                case 3:
                    vista.editarDatos(controlador.obtenerTrabajador());
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);
    }
}
