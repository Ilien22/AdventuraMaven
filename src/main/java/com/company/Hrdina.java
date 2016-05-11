package com.company;

/**
 * Created by Tibor on 3. 4. 2016.
 */
public class Hrdina extends Bytost {

    Inventar inventar;

    public Hrdina() {
        super("Franta",10, 1, 1); //super zavolá konstruktor předka
        this.inventar = new Inventar(); //funguje i bez this
    }

    public Inventar getInventar() {
        return inventar;
    }
}
