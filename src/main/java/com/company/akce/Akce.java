package com.company.akce;

/**
 * Created by Tibor on 1. 2. 2016.
 */
public class Akce { // každá akce nějekej příkaz a ... - konstruktor pro dva parametry + pole parametru
    public Akce(String prikaz, int pocetParametru) { //konstruktor; int=Integer
        this.prikaz = prikaz;                           // this - ukazatel na konkrétní metodu
        this.pocetParametru = pocetParametru;
    }

    private String prikaz;
    private int pocetParametru;

    public boolean rozumimPrikazu(String[] parametry) {     //chceme zjistit počet slov a jestli to první známe
        if (parametry[0].equals(prikaz)) {
            if (parametry.length == pocetParametru + 1) {      // == znamená porovnej
                return true;
            } else {
                return false;
            }
        } else {
            return false;           // return vrátí to za tím
        }     // Testování - Junit testování
    }

    public boolean equals(Object akcni) {
        if (!(akcni instanceof Akce)) {
            return false;
        }
        Akce porovnani = (Akce) akcni;
        if (porovnani.getPocetParametru() == pocetParametru && porovnani.getPrikaz() == prikaz) {
            return true;
        } else {
            return false;
        }

    }

    public String getPrikaz() { //tohle tu píšem protože public String prikaz; by melo byt private, aby nám to nikdo neměnil a tohle public String getPrikaz nám dovolí zjisti jakou informaci by to případné private String prikaz;
        return prikaz;
    }

    public int getPocetParametru() {
        return pocetParametru;
    }
}
// . - pokud je to odkaz na nějaký objekt