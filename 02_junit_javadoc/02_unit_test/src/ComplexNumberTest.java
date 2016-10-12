import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test für die komplexen Zahlen.
 */
public class ComplexNumberTest {

    /**
     * Testet die Addtion.
     */
    @Test
    public void testAddition() {
        // Beispiel für einen Test der Addition
        ComplexNumber a = new ComplexNumber(4, -5);
        ComplexNumber b = new ComplexNumber(2, 11);

        assertEquals(new ComplexNumber(6, 6), a.add(b));
        assertEquals(new ComplexNumber(7, -5), a.add(3));
    }

    /**
     * Testet die Subtraktion.
     */
    @Test
    public void testSubtraktion() {
        ComplexNumber a = new ComplexNumber(4, -5);
        ComplexNumber b = new ComplexNumber(2, 11);

        assertEquals(new ComplexNumber(2, -16), a.subtract(b));
        assertEquals(new ComplexNumber(-2, 16), b.subtract(a));
    }

    /**
     * Testet die Multiplikation.
     */
    @Test
    public void testMultiplikation() {
        ComplexNumber a = new ComplexNumber(2, -4);
        ComplexNumber b = new ComplexNumber(-3, 5);
        ComplexNumber c = new ComplexNumber(2, 5);
        ComplexNumber d = new ComplexNumber(3, 7);

        assertEquals(new ComplexNumber(14, 22), a.multiply(b));
        assertEquals(new ComplexNumber(-29, 29), c.multiply(d));
        assertEquals(new ComplexNumber(8, -16), a.multiply(4));
    }

    /**
     * Testet die Division.
     */
    @Test
    public void testDivision() {
        ComplexNumber a = new ComplexNumber(4, -8);
        ComplexNumber b = new ComplexNumber(3, 4);
        ComplexNumber c = new ComplexNumber(1, 0);
        ComplexNumber d = new ComplexNumber(0, 1);
        ComplexNumber e = new ComplexNumber(8, 16);

        assertEquals(new ComplexNumber(-0.8, -1.6), a.divide(b));
        assertEquals(new ComplexNumber(0, -1), c.divide(d));
        assertEquals(new ComplexNumber(2, 4), e.divide(4));
    }

    /**
     * Testet die Erzeugung der konjugiert Komplexen Zahl.
     */
    @Test
    public void testConjugate() {
        ComplexNumber a = new ComplexNumber(3, 5);
        ComplexNumber b = new ComplexNumber(-2, -4);

        assertEquals(new ComplexNumber(3, -5), a.conjugate());
        assertEquals(new ComplexNumber(-2, 4), b.conjugate());
    }

    /**
     * Testet die Berechnung des Betrages.
     */
    @Test
    public void testBetrag() {
        ComplexNumber a = new ComplexNumber(3, -4);
        ComplexNumber b = new ComplexNumber(0, 3);

        assertEquals(5, a.abs(), 0);
        assertEquals(3, b.abs(), 0);
    }

    /**
     * Testet das Potenzieren.
     */
    @Test
    public void testPotenz() {
        ComplexNumber a = new ComplexNumber(2, -4);

        assertEquals(a, a.power(1));
        assertEquals(a.multiply(a), a.power(2));
        assertEquals(a.multiply(a).multiply(a), a.power(3));
        assertEquals(new ComplexNumber(7488, -2816), a.power(6));
    }
}

