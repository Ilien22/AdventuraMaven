package com.company.akce;

import com.company.Bytost;
import com.company.Mapa;
import com.company.Pozice;

/**
 * Created by Tibor on 28. 2. 2016.
 */
public class Jdi extends Akce {  //extends Akce - znamená, že tahle třída je potomkem třídy Akce (podědí všechny metody a field (prostě všechno non private
    //potřebujem vytvořit konstruktor, který nemá žádný parametr
    public Jdi(Mapa mapa) { //odkaz na třída a jméno
        super("jdi", 1); //super je odkaz na předka (třeba na zavolání konstruktoru)
        this.mapa = mapa;
    }

    Mapa mapa; //tímhle vytvořím políčko mapa v třídě
    Bytost bytost;

    public void proved(String[] parametry) {
        if (!mapa.muzuJit(parametry[1])) {
            System.out.println("Tam nejdu");
        } else {
            Pozice nova = mapa.jdi(parametry[1]);  //na instanci mapa zavolám instanci jdi
            System.out.println("Došels na " + nova);
            mapa.aktualniLokace().vypis();
        }
    }
}
//konstruktor říká, že někdo z vnějšku tomu dá instanci mapy a Mapa mapa je proto, aby si ji třída Jdi uchovala