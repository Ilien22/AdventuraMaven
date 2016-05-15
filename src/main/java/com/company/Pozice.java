package com.company;

/**
 * Created by Tibor on 14. 2. 2016.
 */
public class Pozice {
    public Pozice(int x, int y) {   //konstruktor
        this.x = x;
        this.y = y;
    }

    public int x;   //proměnná třídy (property)
    public int y;

    @Override
    public boolean equals(Object obj) {  //dál budeme chtít ověřit, že Object je ...
        if (!(obj instanceof Pozice)) {    //v podstatě zo znamená že obj = Pozice.. ! předtím znamená negace
            return false;
        }


        Pozice Poz = (Pozice) obj;


        if (Poz.x == getX() && Poz.y == getY()) {   //nemusí být this
            return true;

        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return getX()+","+getY();
    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }
 /*   public String serialize (){
        return getX()+ "," + getY();
    } */
}
