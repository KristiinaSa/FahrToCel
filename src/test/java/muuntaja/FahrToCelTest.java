package muuntaja;

import junit.framework.TestCase;
import muuntaja.FahrToCel;
import org.junit.Test;

public class FahrToCelTest extends TestCase {

    FahrToCel ftc = new FahrToCel();

    @Test
    public void testConvertFahr() {
        assertEquals(0.0, ftc.convertFahr(32), 0.0);
        assertEquals(100.0f, ftc.convertFahr(212), 0.0f);
        assertEquals(37.0f, ftc.convertFahr(98.6f), 0.0f);
        assertEquals(20.0f, ftc.convertFahr(68), 0.0f);
    }

    @Test
    public void testKelvinToCel() {
        assertEquals(0.0f, ftc.kelvinToCel(273.15f), 0.0);
        assertEquals(100.0f, ftc.kelvinToCel(373.15f), 0.0f);
        assertEquals(37.0f, ftc.kelvinToCel(310.15f), 0.0f);
        assertEquals(20.0f, ftc.kelvinToCel(293.15f), 0.0f);
    }

    @Test
    public void testConvertKeltoFahr() {
        assertEquals(81.0f, ftc.convertKeltoFahr(300.1f), 0.0f);
        assertEquals(32.0f, ftc.convertKeltoFahr(273.15f), 0.0f);
        assertEquals(212.0f, ftc.convertKeltoFahr(373.15f), 0.0f);
    }
}