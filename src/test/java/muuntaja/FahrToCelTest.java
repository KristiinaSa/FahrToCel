package muuntaja;

import junit.framework.TestCase;
import muuntaja.FahrToCel;

public class FahrToCelTest extends TestCase {

    FahrToCel ftc = new FahrToCel();

    public void testConvertFahr() {
        assertEquals(0.0, ftc.convertFahr(32), 0.0);
        assertEquals(100.0f, ftc.convertFahr(212), 0.0f);
        assertEquals(37.0f, ftc.convertFahr(98.6f), 0.0f);
        assertEquals(20.0f, ftc.convertFahr(68), 0.0f);
    }

    public void testKelvinToCel() {
        assertEquals(0.0f, ftc.kelvinToCel(273.15f), 0.0);
        assertEquals(100.0f, ftc.kelvinToCel(373.15f), 0.0f);
        assertEquals(37.0f, ftc.kelvinToCel(310.15f), 0.0f);
        assertEquals(20.0f, ftc.kelvinToCel(293.15f), 0.0f);
    }
}