package com.onliner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public void clickCatalog() {
        driver.findElement(By.xpath("//a[contains(text(), 'Каталог')][1]"))
                .click();
    }

    public void clickElectronik() {
        driver.findElement(By.xpath("//span[contains(text(), 'Электроника')] "))
                .click();
    }

    public void clickTV() {
        driver.findElement(By.xpath("//*[text()=\"Телевизоры\"]"))
                .click();
    }

    public void clickSam() {
        driver.findElement(By.xpath("//span[contains(text(), 'LG')] "))
                .click();
    }


    public boolean resultSamsung() {
        return driver.findElement(By.xpath("//span[@data-bind='html: tag.text']")).getText()
                .equals("Samsung");

    }
}