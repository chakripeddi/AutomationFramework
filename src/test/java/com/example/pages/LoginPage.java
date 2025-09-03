package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.example.base.BaseClass;

public class LoginPage extends BaseClass {
	public WebDriver driver;

	// Locators
	@FindBy(xpath = "//input[@type='email']")
	WebElement usernameField;

	@FindBy(xpath = "//input[@type='password']")
	WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void enterUsername(String username) {
		 wait.until(ExpectedConditions.visibilityOf(usernameField));
		usernameField.sendKeys(username);
	}

	public void enterPassword(String password) {
		 wait.until(ExpectedConditions.visibilityOf(passwordField));
		passwordField.sendKeys(password);
	}

	public void clickLogin() {
		 wait.until(ExpectedConditions.visibilityOf(loginButton));
		loginButton.click();
	}

	public String getPageTitle() {
		wait.until(ExpectedConditions.visibilityOf(loginButton));

		
		
		return driver.getTitle();
	}
}
