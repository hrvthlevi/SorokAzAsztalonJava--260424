package teszt;

import Modell.Asztal;
import Modell.Sor;

public class AsztalTeszt {

    public static void main(String[] args) {
        tesztUresAsztalnalNullaSor();
        tesztEgySorHozzaadasa();
        tesztMaximumNegySor();
        tesztAdottSorLetezikAzAsztalon();
    }

    private static void tesztUresAsztalnalNullaSor() {
        System.out.println("Teszt: új asztal: 0 sörrel");
        Asztal a = new Asztal();

        assert a.getDb() == 0 : "HIBA: nem 0 sörrel indult";
        System.out.println("SIKERES!");
    }

    private static void tesztEgySorHozzaadasa() {
        System.out.println("Teszt: 1 sör");
        Asztal a = new Asztal();
        a.sorHozzaad(new Sor());

        assert a.getDb() == 1 : "HIBA: Nem 1 a darabszám a sör hozzáadása után";
        System.out.println("SIKERES!");
    }

    private static void tesztMaximumNegySor() {
        System.out.println("Teszt: 5 sör hozzáadása után is max 4 marad");
        Asztal a = new Asztal();
        for (int i = 0; i < 5; i++) {
            a.sorHozzaad(new Sor());
        }

        assert a.getDb() <= 4 : "HIBA: Több sör van az asztalon a megengedettnél";
        System.out.println("SIKERES");
    }

    private static void tesztAdottSorLetezikAzAsztalon() {
        System.out.println("Teszt: A hozzáadott sör adatai nem változnak");
        Asztal a = new Asztal();
        double alk = 5.2;
        Sor s = new Sor(alk, 500, false);
        a.sorHozzaad(s);

        assert a.getDb() == 1 : "HIBA: Nincs sör az asztalon";
        System.out.println("SIKERES!");
    }
}
