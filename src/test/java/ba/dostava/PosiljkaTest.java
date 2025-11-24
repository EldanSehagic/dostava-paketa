package ba.dostava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void testCijenaPaketa(){
        Paket p = new Paket("P001",10,50);
        double expected = 10 * 1.5 + 50 * 0.2; //25
        assertEquals(expected,p.izracunajBaznuCijenu());
    }

    @Test
    void testCijenaEkspresPaketa(){
        EkspresPaket ep = new EkspresPaket("E001",10,50);
        double expected = (10 * 1.5 + 50 * 0.2)*1.5;//37,5
        assertEquals(expected,ep.izracunajBaznuCijenu());
    }

    @Test
    void testStatusPaketa(){
        Paket p = new Paket("P002",50,20);
        p.azurirajStatus("U skladistu");
        assertEquals("U skladistu",p.getStatus());
    }

    @Test
    void testStatusEkspresPaketa(){
        EkspresPaket ep = new EkspresPaket("E002",3,10);
        ep.azurirajStatus("U transportu");
        assertEquals("U transportu",ep.getStatus());
    }

    //sada idu exception slucajevi
    @Test
    void testExceptionZaNeispravanTrackingNumber(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Paket p = new Paket("",50,20);
            if(p.getTrackingNumber().isEmpty()){
                throw new IllegalArgumentException("Tracking number ne moze biti prazan");
            }
        });
        assertEquals("Tracking number ne moze biti prazan",exception.getMessage());
    }

    @Test
    void testExceptionZaNegativnuTezinu(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Paket p = new Paket("P003",-5,20);
            if(p.getTezinaKG()<0){
                throw new IllegalArgumentException("Tezina ne moze biti negativna");
            }
        });
        assertEquals("Tezina ne moze biti negativna",exception.getMessage());
    }
}
