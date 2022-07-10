package com.onliner;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class haidukevich extends Addtion {
    //by Dzianis Haidukevich

    @Test
    public void SamsungTest() {
        HOMEPage.clickCatalog();
        HOMEPage.clickElectronik();
        HOMEPage.clickTV();
        HOMEPage.clickSam();
        Assert.assertFalse(HOMEPage.resultSamsung());
    }

}