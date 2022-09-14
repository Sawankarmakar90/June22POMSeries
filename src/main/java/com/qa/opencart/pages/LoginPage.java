package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

public class LoginPage {

	//1. declare private Driver
	private WebDriver driver;
	private ElementUtil eleUtil;
	//2.We have to create page constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
		new JavaScriptUtil(driver);
	}


	//3.private By locator-all the locator should be here
	private By emailId=By.id("input-email");
	private By password=By.id("input-password");
	private By logBtn=By.xpath("//button[text()='Login']");
	private By registerLink=By.linkText("Register");
	private By forgotPwdLink=By.linkText("Forgotten Password");
	
	
	
	//4. page Actions:
	public String getLoginPageTitle() {
		return eleUtil.doGetTitle(Constants.LOGIN_PAGE_TITLE, Constants.DEFAULT_TIME_OUT);
	}
	public Boolean getLoginPageUrl() {
		return eleUtil.waitForURLContain(Constants.LOGIN_PAGE_URL_FRACTION, Constants.DEFAULT_TIME_OUT);
	}
	public boolean isForgotPwdLinkExist() {
		return eleUtil.doIsDisplayed(forgotPwdLink);
	}
	public boolean isRegistrationLinkExist() {
		return eleUtil.doIsDisplayed(registerLink);
	}
	public AccountsPage doLogin(String un,String pwd) {
		System.out.println("login with :"+un+" : "+pwd);
	    eleUtil.doSendKeys(emailId, un);
	    eleUtil.doSendKeys(password, pwd);
	    eleUtil.clickElementWhenReady(logBtn, 10);
	    return new AccountsPage(driver);
	}
	

}
