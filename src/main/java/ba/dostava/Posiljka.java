package ba.dostava;

public abstract class Posiljka {
    protected String trackingNumber;
    protected double tezinaKG;

    public Posiljka(double tezinaKG, String trackingNumber) {
        this.tezinaKG = tezinaKG;
        this.trackingNumber = trackingNumber;
    }

    //apstraktna metoda
    public abstract double izracunajBaznuCijenu();

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public double getTezinaKG() {
        return tezinaKG;
    }
}
