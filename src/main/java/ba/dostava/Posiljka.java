package ba.dostava;

public abstract class Posiljka {
    protected String trackingNumber;
    protected double tezinaKG;

    public Posiljka( String trackingNumber,double tezinaKG) {
        this.trackingNumber = trackingNumber;
        this.tezinaKG = tezinaKG;
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
