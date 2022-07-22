package com.avalon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonMainPage extends BasePage{

    public AmazonMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchField;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchBtn;

    @FindBy(xpath = "//div[@id='nav-cart-count-container']")
    public WebElement cartBtn;

}
