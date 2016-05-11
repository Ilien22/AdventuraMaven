package com.company.akce;

import com.company.Hrdina;
import com.company.Inventar;
import com.company.Lokace;
import com.company.Mapa;

/**
 * Created by Tibor on 20. 3. 2016.
 */
public class Zvedni extends Akce {
    public Zvedni (Mapa mapa, Hrdina hrdina) {
        super("zvedni", 1);
        this.mapa = mapa;
        this.inventar = hrdina.getInventar();
    }
    Mapa mapa; //tímhle vytvořím políčko mapa v třídě
    Inventar inventar;

    public void proved(String[] parametry) {
        Lokace aktualniLokace = mapa.aktualniLokace(); //Volání metody musí být se závorkama (),
        if (aktualniLokace.jdeProvest(this.getPrikaz()) && aktualniLokace.muzuVzit(parametry [1])){
            inventar.pridej(parametry [1]);
            System.out.println("V ruksaku mám:");
            inventar.vypis();
            aktualniLokace.odeberPredmet(parametry [1]);

        }
        else {
            System.out.println("Nikde jsem to tu nenašel");
        }
    }
}
