package taller1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {

    @Test
    public void areaBase3Altura4() {
        triangle t = new triangle(3, 4);
        assertEquals(6.0, t.calculateArea(), 0.0001);
    }

    @Test
    public void areaBaseDecimal() {
        triangle t = new triangle(2.5, 1.5);
        assertEquals(1.875, t.calculateArea(), 0.0001);
    }

    @Test
    public void baseNegativaLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> new triangle(-3, 4));
    }

    @Test
    public void alturaNegativaLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> new triangle(3, -4));
    }

    @Test
    public void alturaNanLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> new triangle(3, Double.NaN));
    }

    @Test
    public void baseCeroAreaCero() {
        triangle t = new triangle(0, 5);
        assertEquals(0, t.calculateArea(), 0.0001);
    }

    @Test
    public void perimetroNoCalculableDevuelveCero() {
        triangle t = new triangle(3, 4);
        assertEquals(0, t.calculatePerimeter(), 0.0001);
    }
}
