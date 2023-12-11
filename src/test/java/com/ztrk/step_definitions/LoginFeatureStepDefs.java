package com.ztrk.step_definitions;

import com.ztrk.pages.LoginPage;
import com.ztrk.utilities.ConfigurationReader;
import com.ztrk.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginFeatureStepDefs {
    LoginPage loginPage=new LoginPage();

    @Given("user on types login url")
    public void user_on_types_login_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @Given("user types username to username textbox")
    public void user_types_username_to_username_textbox() {
    loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @Given("user types password tp password textbox")
    public void user_types_password_tp_password_textbox() {
      loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @Given("user clicks login button")
    public void user_clicks_login_button() {
      loginPage.loginButton.click();
    }
    @Then("user verifies title  is {string}")
    public void user_verifies_title_is(String string) {
     Driver.getDriver().getTitle().equals(string);
    }
}
