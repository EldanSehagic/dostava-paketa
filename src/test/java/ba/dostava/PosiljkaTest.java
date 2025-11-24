package ba.dostava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PosiljkaTest {
    @Test
    void testKreiranjePaketa(){
        Paket p = new Paket("P001",10,50);
        assertEquals("P001",p.getTrackingNumber());
        assertEquals(10,p.getTezinaKG());
        assertEquals(50,p.getUdaljenostKm());
    }

    @Test
    void testKreiranjeEkspresPaketa(){
        EkspresPaket p = new EkspresPaket("E001",5,30);
        assertEquals("E001",p.getTrackingNumber());
        assertEquals(5,p.getTezinaKG());
        assertEquals(30,p.getUdaljenostKm());
    }
}
