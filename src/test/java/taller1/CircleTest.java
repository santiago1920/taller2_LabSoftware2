package taller1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CircleTest {

    @Test
    public void areaRadio3() {
        circle c = new circle(3, 3, 4);
        assertEquals(28.2744, c.calculateArea(), 0.0001);
    }

    @Test
    public void perimetroRadio3() {
        circle c = new circle(3, 3, 4);
        assertEquals(18.8496, c.calculatePerimeter(), 0.0001);
    }

    @Test
    public void areaRadioDecimal() {
        circle c = new circle(2.5f, 0, 0);
        assertEquals(19.635, c.calculateArea(), 0.0001);
    }

    @Test
    public void perimetroRadioDecimal() {
        circle c = new circle(2.5f, 0, 0);
        assertEquals(15.708, c.calculatePerimeter(), 0.0001);
    }

    @Test
    public void radioCeroAreaYPerimetroCero() {
        circle c = new circle(0, 0, 0);
        assertEquals(0, c.calculateArea(), 0.0001);
        assertEquals(0, c.calculatePerimeter(), 0.0001);
    }

    @Test
    public void coordenadasSeConservan() {
        circle c = new circle(1, 2.5, 7);
        assertEquals(2.5, c.getX1(), 0.0001);
        assertEquals(7, c.getY1(), 0.0001);
    }

    @Test
    public void radioNegativoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> new circle(-1, 0, 0));
    }

    @Test
    public void coordenadaNegativaLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> new circle(1, -2.5, 7));
    }

    @Test
    public void radioNanLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> new circle(Float.NaN, 0, 0));
    }

    @Test
    public void areaUsaPiAproximado31416() {
        circle c = new circle(3, 0, 0);
        assertEquals(28.2744, c.calculateArea(), 0.0);
    }

    @Test
    public void errorDePiCreceConElRadio() {
        circle c = new circle(10000f, 0, 0);
        double exactoConMathPi = Math.PI * 10000 * 10000;
        assertTrue(Math.abs(c.calculateArea() - exactoConMathPi) > 100);
    }
}