package com.company;

/**
 * Created by Tibor on 3. 4. 2016.
 */
public class Bytost {
    String jmeno;
    int zivoty;
    int utok;
    int obrana;

    public Bytost (String jmeno, int zivoty, int utok, int obrana) {
        this.jmeno = jmeno;
        this.zivoty = zivoty;
        this.utok = utok;
        this.obrana = obrana;

    }

    public void setZivoty(int zivoty) { //můžu něco přepisovat
        this.zivoty = zivoty;
    }

    public int getZivoty() {
        return zivoty;
    }

    public int getUtok() {
        return utok;
    }

    public int getObrana() {
        return obrana;
    }

    public String toString() {
        return jmeno;
    }

}

// Alt+Insert - umožní dělat gettery a settery