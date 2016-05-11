package com.company;

import com.company.akce.Jdi;
import com.company.akce.Poloz;
import com.company.akce.Utok;
import com.company.akce.Zvedni;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hrdina hrdina = new Hrdina();
        Mapa mapa = new Mapa(hrdina);
        Jdi jdi = new Jdi(mapa);
        Zvedni zvedni = new Zvedni(mapa, hrdina);
        Poloz poloz = new Poloz(mapa, hrdina);
        Utok utok = new Utok(mapa, hrdina);

        System.out.println("Vítej dobrodruhu!");

        Scanner nacitej = new Scanner(System.in);
        while (nacitej.hasNextLine()) {
            String akce = nacitej.nextLine();
            String[] rozdeleni = akce.split(" ");
            /*if (jdi.rozumimPrikazu(rozdeleni)) {
                jdi.proved(rozdeleni);
            }*/

            Lokace docasne = mapa.aktualniLokace();
            if (rozdeleni[0].equals("co") && rozdeleni[1].equals("vidim?")) {
                mapa.aktualniLokace().vypis();
            } else if (docasne.jdeProvest(rozdeleni[0])) {
                if (jdi.rozumimPrikazu(rozdeleni)) {
                    jdi.proved(rozdeleni);
                }
                if (zvedni.rozumimPrikazu(rozdeleni)) {
                    zvedni.proved(rozdeleni);
                }
                if (poloz.rozumimPrikazu(rozdeleni)) {
                    poloz.proved(rozdeleni);
                }
                if (utok.rozumimPrikazu(rozdeleni)) {
                    utok.proved(rozdeleni);
                }
            } else {
                System.out.println("tohle tady nemuzes udelat");
            }


        }
    }
}





/*

// Klasicky se metoda píše tak,  že je property, konstruktor a pak zbytek




/* public static void main(String[] args) { //voláme konstruktorovou funkci, proto to má závorky;
        Inventar ruksak = new Inventar();
        ruksak.pridej("brnění");
        ruksak.pridej("čepice");
        ruksak.pridej("kalhoty");
        ruksak.pridej("tunika");
                                          //treti hodina
        ruksak.odeber("brnění");
                                            // ruksak.vypis();  -bylo smazáno
        System.out.println("huuuu pyco");

        Scanner nacitej = new Scanner(System.in);
        while (nacitej.hasNextLine()) {
            String akce = nacitej.nextLine();
            if (akce.equals("vypis")) {
                System.out.println("V ruksaku mám:");
                ruksak.vypis();
            }
            String[] rozdeleni = akce.split(" ");
            if (rozdeleni[0].equals("seber")){
             ruksak.pridej(rozdeleni[1]);
            }

            if (rozdeleni[0].equals("polož")) {
                ruksak.odeber(rozdeleni[1]);
            }
            if (rozdeleni[0].equals("zabij")) {
                if (ruksak.over(rozdeleni[1])) {

                    ruksak.odeber(rozdeleni[1]);
                    ruksak.pridej("ocas " + rozdeleni[1]);
                }
                else {
                    System.out.println("hele kámo nemáš " + rozdeleni[1]);
                }
            }
        }
}
}



//       Mapa muzu = new Mapa();
  //      Scanner nacite = new Scanner(System.in);
//        while (nacite.hasNextLine()) {
//            String akc = nacite.nextLine();
//            if (akc.equals("kam muzu")) {
//                System.out.println("můžeš na:");
//                muzu.vypsat();


// DU:  povolit co může dělat a ověřit, že to dělá+
*/
