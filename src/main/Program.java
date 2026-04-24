
package main;

import Modell.Asztal;
import Modell.Sor;

public class Program {

    public static void main(String[] args) {
        Asztal asztal = new Asztal();
        asztal.sorHozzaad(new Sor());
        asztal.sorHozzaad(new Sor(5.2, 500, false));
        
        System.out.println(asztal.toString());
        System.out.println(asztal.getAsztalRajz());
    }
    
}
