package Modell;

public class Sor {

    private double alkoholFok;
    private int mennyiseg;
    private boolean vilagos;

    public Sor() {
        this(4.0, 500, true);
    }

    public Sor(double alkoholFok, int mennyiseg, boolean vilagos) {
        this.alkoholFok = alkoholFok;
        this.mennyiseg = mennyiseg;
        this.vilagos = vilagos;
    }

    public double getAlkoholFok() {
        return alkoholFok;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public boolean isVilagos() {
        return vilagos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.alkoholFok) ^ (Double.doubleToLongBits(this.alkoholFok) >>> 32));
        hash = 17 * hash + this.mennyiseg;
        hash = 17 * hash + (this.vilagos ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sor other = (Sor) obj;
        if (Double.doubleToLongBits(this.alkoholFok) != Double.doubleToLongBits(other.alkoholFok)) {
            return false;
        }
        if (this.mennyiseg != other.mennyiseg) {
            return false;
        }
        return this.vilagos == other.vilagos;
    }

    @Override
    public String toString() {
        String tipus = vilagos ? "világos" : "barna";
        return String.format("%.1f%% alkohol, %d ml, %s", alkoholFok, mennyiseg, tipus);
    }

}
