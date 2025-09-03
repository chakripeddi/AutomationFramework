package com.example.steps;

import com.example.base.BaseClass;
import com.example.pages.LoginPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginSteps extends BaseClass {
    private LoginPage loginPage;

    @Given("user launches the application")
    public void user_launches_the_application() {
       
        loginPage = new LoginPage(driver);
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_credentials(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("user should be navigated to home page")
    public void user_should_be_navigated_to_home_page() {
    String actuall = 	loginPage.getPageTitle();
   String  Expected ="Influencer Dashboard - Influencer Adsense | Influencer Adsense";

   
   
        
    }
}
