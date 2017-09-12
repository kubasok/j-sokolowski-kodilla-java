package com.kodilla.patterns.builder.bigMac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacBuilding() {
        BigMac bigMac = new BigMac.BigMacBuilder()
                        .roll("sesame")
                        .burgers(2)
                        .ingredient("onion")
                        .ingredient("cucumber")
                        .ingredient("tomato")
                        .sauce("BBQ sauce")
                        .build();
        System.out.println(bigMac);

        int howManyIngredients = bigMac.getIngredients().size();

        Assert.assertEquals(3,howManyIngredients);
        Assert.assertEquals(2, bigMac.getBurgers());
        Assert.assertEquals("BBQ sauce", bigMac.getSauce());
        Assert.assertEquals("sesame", bigMac.getRoll());
    }
}
