package com.company;
import com.company.akce.Utok;
import org.junit.Test;

import static org.mockito.Mockito.*;
/**
 * Created by Tibor on 1. 5. 2016.
 */
public class UtokTest {
    Mapa mapa;
    Hrdina hrdina;
    Boj boj;

    @Test
public void testUtok (){
        Hrdina hrdina = new Hrdina();
        Mapa mapa = new Mapa(hrdina);
        Boj mockBoj = mock (Boj.class);
        Utok testovana = new Utok(mapa, hrdina, mockBoj);
        testovana.proved(new String[]{"utok"});
        verify(mockBoj).kolo(eq(hrdina), any(), any(), any());
    }

}
/* Namokování(mock)  - vytvoří fake třídu, která se bude tvářit jako Boj, vysvětlím ji, jak má vypadat
Správa závislostí - v javě se pracuje dost s knihovnama, a buď jemůžu postahovat nebo ...
    Ant
    Maven - nejpoužívanější;
    Gradle -
 */