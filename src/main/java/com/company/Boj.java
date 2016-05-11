package com.company;
/**
 * Created by Tibor on 3. 4. 2016.
 */
public class Boj {
    public void kolo (Hrdina hrdina, Bytost bytost, Lokace lokace, Mapa mapa) { //metoda má jiný název než class a píše se s malým písmenem
        this.utokHrdiny(hrdina, bytost, lokace, mapa);
        this.obranaHrdiny(hrdina, bytost, lokace, mapa); //nemuže to být napsáno naopak,protože v signatuře metody je to v tomhle pořádí (private void obranaHrdiny (Hrdina hrdina, Bytost bytost))
    }
    private void utokHrdiny(Hrdina hrdina, Bytost bytost, Lokace lokace, Mapa mapa) {
        int utok = hrdina.getUtok();        //slova utok a obranaHrdiny žijou jen v téhle jedné malinké metodě
        int obrana = bytost.getObrana();
        int hodKostkouHrdiny = (int) Math.round(Math.random()*6); //přetypovávání z long na int
        int hodKostkouBytosti = (int) Math.round(Math.random()*6);
        int zivotyBytosti = bytost.getZivoty();
        if (utok+hodKostkouHrdiny>obrana+hodKostkouBytosti){
            bytost.setZivoty (zivotyBytosti - ((utok+hodKostkouHrdiny)-(obrana+hodKostkouBytosti)));
            System.out.println("Zranils ji, zbývá jí už jen  "+bytost.getZivoty()+" životů");
        }
        else {
            System.out.println("Ubránila se, mrcha");
        }
    }
    private void obranaHrdiny(Hrdina hrdina, Bytost bytost, Lokace lokace, Mapa mapa){ //celý tenhle řádek je signatura metody
        int utok = bytost.getUtok();
        int obrana = hrdina.getObrana();
        int hodKostkouHrdiny = (int)Math.round(Math.random()*6); //tady by nefungovalo napsat Integer
        int hodKostkouBytosti = (int)Math.round(Math.random()*6); //takhle napsany random generuje čísla od 0-1
        int zivotyHrdiny = hrdina.getZivoty();
        if (utok+hodKostkouBytosti>obrana+hodKostkouHrdiny){
            hrdina.setZivoty (zivotyHrdiny - ((utok+hodKostkouBytosti)-(obrana+hodKostkouHrdiny)));
            System.out.println("Kousla tě, mrcha, zůstalo Ti "+hrdina.getZivoty()+" životů");
        }
        else {
            System.out.println("Ta na Tebe nemá :)");
        }
        if (hrdina.getZivoty() <= 0){
            System.out.println("Účast na Tvém pohřbu byla veliká. Začínáš zase od začátku");
            mapa.aktualniLokace().pridejPredmet ("Hrobeček");
            mapa.aktualniPozice = new Pozice(1, 1);
            hrdina.setZivoty(10);
        }
        if (bytost.getZivoty() <= 0){   //nefunguje zivotyBytosti <= 0; protože tím dostanu ty nepřepsaný životy
            System.out.println("Jsi hrdina, zabil jsi ji :)");
            mapa.aktualniLokace().pridejPredmet ("mrtvola");
            lokace.odeberBytost();

        }
    }
}
/*metody volané přímo na třídě, nepotřebuje žádnou instanci
např. Math.random -
Math.round
*/