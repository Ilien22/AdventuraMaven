package com.company;

import java.util.ArrayList;

/**
 * Created by Tibor on 18. 1. 2016.
 */
public class Inventar {
    public Inventar (){ //Inventar je metoda, má to závorky (kuatý a hranatý) a ne středník
        Predmet = "hul"; //definování konkrétně předmětu, co vypíše
                            // System.out.println(Predmet); - smazáno

        predmety = new ArrayList(); //v konstruktorové fci vytvořena instance dokud bude žít ruksak
    }
    public String Predmet; //třída bude mít políčko předmět
    ArrayList predmety;

    public void pridej (String vec){ // void říká, že se nevrací nic (jakého typu bude proměnná, kterou budu volat z téhle fce)
                                        // System.out.println(vec); - smazáno
        predmety.add(vec);
    }

    public void vypis(){
        for (Object vec:predmety) {     //hranatý závork umožní přidat kus kódu pro každou věc
            System.out.println(vec);
        }
    }
    public void odeber (String vec){
        predmety.remove(vec);
    }

    public boolean over (String vec) {       //boolean = true/false
        return predmety.contains(vec);      // vrať výsledek téhle operace

    }

}


//String - parametr do () a proměnná, která je přidaná zvenku

// DU: přidat nějakou věc do ArrayListu

// ----------------------------------------

//iterovatelnost = dá se stím dělat nějaký věci
//               = můžu jít prvek po prvku