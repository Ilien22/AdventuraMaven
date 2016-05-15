
package com.company.akce;

import com.company.Hrdina;
import com.company.Inventar;
import com.company.Lokace;
import com.company.Mapa;

/**
 * Created by Tibor on 26. 3. 2016.
 */

public class Poloz extends Akce {
    public Poloz (Mapa mapa, Hrdina hrdina){
        super("poloz", 1);
        this.mapa = mapa;
        this.hrdina = hrdina;
    }
    Mapa mapa;
    Hrdina hrdina;

    public void proved(String [] parametry){
        Inventar predmety = hrdina.getInventar();
        Lokace aktualniLokace = mapa.aktualniLokace();
        if (aktualniLokace.jdeProvest(this.getPrikaz()) && predmety.over(parametry [1]))
        {
                predmety.odeber(parametry[1]);
            System.out.println("V ruksaku mám:");
                predmety.vypis();
            aktualniLokace.pridejPredmet(parametry[1]);
            }
        else {
            System.out.println("Nefunguje to");
        }
    }
}
