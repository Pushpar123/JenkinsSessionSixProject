package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.DashboardPage;
import Page.LoginPage;
import Util.BrowserFactory;
import junit.framework.Assert;

public class Login {
	WebDriver driver;
	
	@Test
	public void ValidUserShouldBeAbleToLogin() {
	driver = BrowserFactory.init();
	
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	
	loginPage.enterUserName("demo@techfios.com");
	loginPage.enterPassword("abc123");
	loginPage.ClickSigninButton();
	
	DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
	dashboardpage.validata_Dashboard_Search_Page();
	//BrowserFactory.tearDown();
	
	}
	}


