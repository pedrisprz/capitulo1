package Excepciones;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

public class LeerPorTecladoTest {
    @Test
    public void testExcepcionDeVocal() {
        LeerPorTeclado lpt = new LeerPorTeclado();
        lpt.setChar('a');
        assertThrows(ExcepcionDeVocal.class, () -> lpt.procesarCaracter());
    }

    @Test
    public void testExcepcionDeNumero() {
        LeerPorTeclado lpt = new LeerPorTeclado();
        lpt.setChar('1');
        assertThrows(ExcepcionDeNumero.class, () -> lpt.procesarCaracter());
    }

    @Test
    public void testExcepcionDeBlanco() {
        LeerPorTeclado lpt = new LeerPorTeclado();
        lpt.setChar(' ');
        assertThrows(ExcepcionDeBlanco.class, () -> lpt.procesarCaracter());
    }

    @Test
    public void testExcepcionDeSalida() {
        LeerPorTeclado lpt = new LeerPorTeclado();
        lpt.setChar('x');
        assertThrows(ExcepcionDeSalida.class, () -> lpt.procesarCaracter());
    }
}
