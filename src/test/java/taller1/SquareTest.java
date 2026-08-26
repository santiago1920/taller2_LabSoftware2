package taller1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {

    @Test
    public void areaLado4() {
        square s = new square(4, 4);
        assertEquals(16.0, s.calculateArea(), 0.0001);
    }

    @Test
    public void perimetroLado4() {
        square s = new square(4, 4);
        assertEquals(16.0, s.calculatePerimeter(), 0.0001);
    }

    @Test
    public void areaLadoDecimal() {
        square s = new square(2.5, 2.5);
        assertEquals(6.25, s.calculateArea(), 0.0001);
    }

    @Test
    public void perimetroLadoDecimal() {
        square s = new square(2.5, 2.5);
        assertEquals(10.0, s.calculatePerimeter(), 0.0001);
    }

    @Test
    public void ladoCeroAreaYPerimetroCero() {
        square s = new square(0, 0);
        assertEquals(0, s.calculateArea(), 0.0001);
        assertEquals(0, s.calculatePerimeter(), 0.0001);
    }

    @Test
    public void setX1AfectaCalculos() {
        square s = new square(1, 9);
        s.setX1(3);
        assertEquals(9.0, s.calculateArea(), 0.0001);
        assertEquals(12.0, s.calculatePerimeter(), 0.0001);
    }

    @Test
    public void ladoNegativoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> new square(-4, 4));
    }

    @Test
    public void setX1NegativoLanzaExcepcion() {
        square s = new square(4, 4);
        assertThrows(IllegalArgumentException.class, () -> s.setX1(-1));
    }

    @Test
    public void y1NuncaSeUsaEnCuadrado() {
        square s = new square(4, 999);
        assertEquals(16.0, s.calculateArea(), 0.0001);
        assertEquals(16.0, s.calculatePerimeter(), 0.0001);
    }
}
