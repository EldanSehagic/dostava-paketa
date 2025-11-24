package ba.dostava;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Posiljka> dostava = new HashMap<>();

        Paket p1 = new Paket("P001",10,50);
        Paket p2 = new Paket("P002",20,20);
        EkspresPaket ep1 = new EkspresPaket("E001",8,40);
        EkspresPaket ep2 = new EkspresPaket("E002",2,20);

        //dodavanje u mapu
        dostava.put(p1.getTrackingNumber(),p1);
        dostava.put(p2.getTrackingNumber(),p2);
        dostava.put(ep1.getTrackingNumber(),ep1);
        dostava.put(ep2.getTrackingNumber(),ep2);

        p1.azurirajStatus("U skladistu");
        p2.azurirajStatus("U transportu");
        ep1.azurirajStatus("Isporuceno");
        ep2.azurirajStatus("U transporti");

        for(Posiljka pos : dostava.values()){
            System.out.println("Tracking Number: " + pos.getTrackingNumber() );
            String tip = (pos instanceof EkspresPaket) ? "Ekspresni paket" : "Obicni paket";
            System.out.println("Tip: " + tip);
            System.out.println("Status: " + pos.getStatus());
            System.out.println("Cijena: " + pos.izracunajBaznuCijenu());
            System.out.println("----------------------------");
        }
    }
}
