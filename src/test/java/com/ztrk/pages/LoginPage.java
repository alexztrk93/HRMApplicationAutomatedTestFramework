package com.ztrk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{



    @FindBy(name="username")
    public WebElement inputUsername;

    @FindBy(name="password")
    public WebElement inputPassword;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement loginButton;


    /**
     * login feature can be utilised by a method to save allocated time for execution
   TODO
     */



}
