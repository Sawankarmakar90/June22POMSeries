package com.qa.openacart.test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.utils.Constants;

public class AccountsPageTest extends BaseTest {
	
	
	@BeforeClass
	public void accPageSetup() {
		accountsPage=loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
	}
	@Test(priority=1)
	public void accPageTitleTest() {
		String actTitle=accountsPage.getAccountPageTitle();
		System.out.println("acc page title "+actTitle);
		Assert.assertEquals(actTitle, Constants.ACCOUNTS_PAGE_TITLE);
		}
	@Test(priority=2)
	public void accPageHeaderTest() {
		String header=accountsPage.getAccountsPageHeader();
		System.out.println("accont header:"+ header);
		Assert.assertEquals(header, Constants.ACCOUNT_PAGE_HEADER);
	}
	@Test(priority=3)
	public void isLougoutTestExit() {
		Assert.assertTrue(accountsPage.isLogoutLinkExist());
	}
	@Test(priority=4)
	public void actPageSectionsTest() {
		List<String>actAccSecList=accountsPage.getAccountSecList();
		Assert.assertEquals(actAccSecList, Constants.getExpectedAccSecList());
	}
	@Test(priority=5)
	public void searchTest() {
		accountsPage.doSearch("Macbook pro");
	}
	
	
	
	
	
	
	
	
	

}
