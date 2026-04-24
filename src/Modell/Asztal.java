package Modell;

import java.util.Arrays;

public class Asztal {

    private Sor[] sorok;
    private int db;

    public Asztal() {
        this.sorok = new Sor[4];
        this.db = 0;
    }

    public void sorHozzaad(Sor sor) {
        if (db < sorok.length && sor != null) {
            this.sorok[db++] = sor;
        }
    }
    
    //annyi "o" karakter adunk hozza ahany sorunk van, a maradek helyet feltoltjuk szokozokkel, hogy fix szelessegu legyen(max 4)
    public String getAsztalRajz(){
    String rajz = "|";
  
    for (int i = 0; i < db; i++) {
        rajz += "o";
    }
    
    for (int i = db; i < 4; i++) {
        rajz += " ";
    }
    
    rajz += "|\n-----";
    return rajz;
}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Arrays.deepHashCode(this.sorok);
        hash = 97 * hash + this.db;
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
        final Asztal other = (Asztal) obj;
        if (this.db != other.db) {
            return false;
        }
        return Arrays.deepEquals(this.sorok, other.sorok);
    }

    @Override
    public String toString() {
        //Arrays.toString(sorok) --> meghivja az egyes sorok stringjét
        return "Asztal állapota: [sörök=" + java.util.Arrays.toString(sorok) + ", darabszám=" + db + "]";
    }

}
