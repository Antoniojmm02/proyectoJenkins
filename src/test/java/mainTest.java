import org.example.main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class mainTest {

    @Test
    public void testDiasLaborales() {
        // Dias de semana → true
        assertTrue(main.dia_laboral("Lunes"), "Lunes debería ser día laboral");
        assertTrue(main.dia_laboral("Martes"), "Martes debería ser día laboral");
        assertTrue(main.dia_laboral("Miercoles"), "Miércoles debería ser día laboral");
        assertTrue(main.dia_laboral("Jueves"), "Jueves debería ser día laboral");
        assertTrue(main.dia_laboral("Viernes"), "Viernes debería ser día laboral");
    }

    @Test
    public void testFinesDeSemana() {
        // Sábado y domingo → false
        assertFalse(main.dia_laboral("Sabado"), "Sábado no debería ser día laboral");
        assertFalse(main.dia_laboral("Domingo"), "Domingo no debería ser día laboral");
    }

    @Test
    public void testDiasInvalidos() {
        // Cualquier otro texto → false
        assertFalse(main.dia_laboral("Feriado"), "Feriado no debería ser día laboral");
        assertFalse(main.dia_laboral(""), "Cadena vacía no debería ser día laboral");
        assertFalse(main.dia_laboral("Lunes "), "Lunes con espacio no debería ser día laboral");
    }
}
