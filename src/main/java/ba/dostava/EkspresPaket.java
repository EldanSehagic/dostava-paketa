package ba.dostava;

public class EkspresPaket extends Paket{
    //napravljen konstruktor
    public EkspresPaket(String trackingNumber, double tezinaKG, double udaljenostKm) {
        super(trackingNumber, tezinaKG, udaljenostKm);
    }

    //override-ana metoda
    @Override
    public double izracunajBaznuCijenu() {
        return super.izracunajBaznuCijenu()*1.5;
    }
}
