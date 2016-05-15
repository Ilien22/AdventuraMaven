/*package com.company.akce;

import java.io.FileWriter;

/**
 * Created by Tibor on 15. 5. 2016.
 */
/* public class Uloz extends Akce { //kde je, kolik zivotu, co má u sebe, stav lokací
  public Uloz (){
      super ("uloz", 1);

    }
    public void proved (String [] parametry){
        try {
            FileWriter fw = new FileWriter (parametry [1]);
            fw.write(); //write přepisuje, append připis1uje
        }
        catch (Exception e){
            e.printStackTrace (); //tohle vypíše co se stalo za chybu
        }



    }//na každé metode budu muset udělat metodu serialize, abych mohl něco uložit (public String serialize) - není to klasická metoda, jen se používá tohle slovo
}


/*Užiteční je balení souborů pod sebe
Cemelcase:
File writer - vyhazujou vyjímky, který museíme zachytávat (vyjímka checked)
File reader -
.json a .xml - xml je bestie co umí všechno, ale je dost ukecaná, ale náročná na manipulaci
             - json nic neumí, ale dobře se s ním přenáší data z jednoho souboru do druhýho

soubory jsou uádán jako strom - absolutní cesta ej cesta od kořene (začíná od disku), relativní - vůči umistění kde jsem teďka

vyjímkdy chcked + unchecked  - vyjímky zastaví průběh souboru - vyjímka probublává zpět po souboru a čeká, jestli ji něco zachytí
                            - mechanismus, který určuje jestli umíme vyjímku zachytit se jmenuje trycatch (funguje jako if)
        - unchecked - problublává dokud ji něco nezachytí nebo vybublá úplně pryč
        - checked - mají trik, kterým říkaj musíš říct jak s touhle vyjímkou budeš zacházet (jeden způsob je zachytit v catch, druhej je mezi () a {} závorky napsat throws a ty vyjímky co vyhazuje - třída co používá tuhle metodu to musí řešit
    - všechny vyjímky mají jako předka třídu Throwable a apak je strom vyjímek který vychází z téhle třídy (v aplikaci i ve virtuálním stroji)
    - exception - obecná třída obsahující všechny chyby v aplikaci
        - Exception e - je jméno, pomocí kterýho ji můžu adresovat
 */