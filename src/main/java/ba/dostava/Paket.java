package ba.dostava;

public class Paket extends Posiljka implements Status {

    protected double udaljenostKm;
    private String status = "Nema status";

    public Paket(String trackingNumber, double tezinaKG, double udaljenostKm) {
        super(trackingNumber, tezinaKG);
        this.udaljenostKm = udaljenostKm;
    }

    @Override
    public double izracunajBaznuCijenu() {
        return tezinaKG*1.5+udaljenostKm*0.2;
    }

    @Override
    public void azurirajStatus(String status) {
        this.status = status;
    }

    @Override
    public String getStatus() {
        return status;
    }

    public double getUdaljenostKm() {
        return udaljenostKm;
    }
}
