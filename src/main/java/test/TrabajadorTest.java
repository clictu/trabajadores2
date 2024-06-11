package test;

import com.empresa.modelo.Trabajador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrabajadorTest {

    @Test
    public void testCrearTrabajador() {
        Trabajador trabajador = new Trabajador("Ana", "López", "98765432-1", "Fonasa", "Provida");

        assertEquals("Ana", trabajador.getNombre());
        assertEquals("López", trabajador.getApellido());
        assertEquals("98765432-1", trabajador.getRut());
        assertEquals("Fonasa", trabajador.getIsapre());
        assertEquals("Provida", trabajador.getAfp());
    }

    @Test
    public void testEditarTrabajador() {
        Trabajador trabajador = new Trabajador("Ana", "López", "98765432-1", "Fonasa", "Provida");

        trabajador.setNombre("María");
        trabajador.setApellido("González");
        trabajador.setIsapre("Colmena");
        trabajador.setAfp("Habitat");

        assertEquals("María", trabajador.getNombre());
        assertEquals("González", trabajador.getApellido());
        assertEquals("Colmena", trabajador.getIsapre());
        assertEquals("Habitat", trabajador.getAfp());
    }
}
