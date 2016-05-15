package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tibor on 1. 2. 2016.
 */
public class Lokace { //důležitý kam můžeme jít a co tam můžeme provádět
    //seskupení sekcí, co můžeme na nějakým místě dělat

    private List predmety; //tohle jsou property
    public List povoleneAkce;
    private Bytost bytost;

    public Lokace (List akce) { //List - definuje listy, seznamy (ArrayList je podmnožina List)
        this (akce,new ArrayList<>());    //voláme (this.povoleneAkce = akce;) z druhýho konstruktoru;
    }
    public Lokace (List akce, List predmety){
        this (akce, null, predmety);            // nutno myslet na pořadí!!!!)
    }
    public Lokace (List akce, Bytost bytost){
        this (akce, bytost, new ArrayList<>());
                                         /*   this.povoleneAkce = akce;  - tohel by dělalo to stejný, ale šetří se kodem
                                              this.bytost = bytost; */
    }
    private Lokace (List akce, Bytost bytost, List predmety){ // nutno myslet na pořadí!!!!)
        this.povoleneAkce = akce;
        this.bytost = bytost;
        this.predmety = predmety;
    }

    public boolean jdeProvest (String akce) { //přepsáno Akce na String
        return povoleneAkce.contains(akce);
    }
    public boolean muzuVzit (String predmet){
        return predmety.contains(predmet);
    }
    public void odeberPredmet (String predmet) { //odeber predmet z lokace, ne z inventare
        predmety.remove(predmet);
    }
    public void pridejPredmet (String predmet){predmety.add(predmet);}

    public void vypis(){
        if (!predmety.isEmpty() || bytost != null)
        {
            System.out.println("Nachází se tu ");
            for (Object vec:predmety) {
                System.out.println(vec);
            }
            if (bytost != null)
            System.out.println(bytost);
        }
        else {System.out.println("Nic tu není");
        }
    }
    public Bytost getBytost (){
        return bytost;
    }
    public void odeberBytost () { //odeber predmet z lokace, ne z inventare
        bytost = null;
        povoleneAkce = new ArrayList<>(povoleneAkce);
        povoleneAkce.remove("utok"); //něco v uvozovkách je instance řetězcejdi
    }

}



// konstruktor se jmenuje stejne jako třída
// interface (např.List) - nemůžou obsahovat proměnný, ale jen signatury metod. Používá implements (místo dědičnosti) - rozdíl je, že jedna třída může implementovat více interfaců
// Struktura třídy - nejdřív promenné,pak konstruktory a pak metody









