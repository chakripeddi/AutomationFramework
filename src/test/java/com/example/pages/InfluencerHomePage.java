package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InfluencerHomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//h1[text()='Influencer Dashboard']")
	private WebElement influencerDashboard;
	
	
	@FindBy(xpath="//button[text()='Create Campaign']")
	private WebElement createCampaignBtn;
	
	
	
	public InfluencerHomePage(WebDriver driver) {
		this.driver = driver;
	}

}
