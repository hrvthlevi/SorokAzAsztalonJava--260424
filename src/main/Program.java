package main;

import Modell.Asztal;
import Modell.Sor;

public class Program {

    public static void main(String[] args) {
        //1. asztal 2 sorres
        Asztal a1 = new Asztal();
        a1.sorHozzaad(new Sor());
        a1.sorHozzaad(new Sor(5.2, 500, false));
        //2. asztal teljesen tele
        Asztal a2 = new Asztal();
        a2.sorHozzaad(new Sor());
        a2.sorHozzaad(new Sor());
        a2.sorHozzaad(new Sor());
        a2.sorHozzaad(new Sor());

        //3. asztal ures
        Asztal a3 = new Asztal();

        //4. asztal 3 sorrel
        Asztal a4 = new Asztal();
        a4.sorHozzaad(new Sor());
        a4.sorHozzaad(new Sor());
        a4.sorHozzaad(new Sor(6.0, 500, false));

        System.out.println("1. asztal:");
        System.out.println(a1.getAsztalRajz());

        System.out.println("\n2. asztal:");
        System.out.println(a2.getAsztalRajz());

        System.out.println("\n3. asztal:");
        System.out.println(a3.getAsztalRajz());

        System.out.println("\n4. asztal (3 sör):");
        System.out.println(a4.getAsztalRajz());
        //System.out.println(asztal.toString());
        //System.out.println(asztal.getAsztalRajz());
    }

}
