package com.ztrk.pages;

import com.ztrk.utilities.Driver;
import org.openqa.selenium.support.PageFactory;



public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



}
