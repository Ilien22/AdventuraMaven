package com.company;

import org.junit.Test;

/**
 * Created by Tibor on 11. 5. 2016.
 */
public class InventarTest {
    @Test
    public void testPridej (){
        Hrdina hrdina = new Hrdina();
        Inventar inventar = hrdina.getInventar();
        inventar.pridej("něco");
    }
    @Test
    public void testOdeber (){
        Hrdina hrdina = new Hrdina();
        Inventar inventar = hrdina.getInventar();
        inventar.odeber("nevim");
    }
}
