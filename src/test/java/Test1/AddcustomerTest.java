package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.Addcustmorpage;
import Page.DashboardPage;
import Page.LoginPage;
import Util.BrowserFactory;

public class AddcustomerTest {
WebDriver driver;
	
	@Test
	public void ValidUserShouldBeAbleToAddCustomer() {
	driver = BrowserFactory.init();
	
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	
	loginPage.enterUserName("demo@techfios.com");
	loginPage.enterPassword("abc123");
	loginPage.ClickSigninButton();
	
	DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
	dashboardpage.validata_Dashboard_Search_Page();
	
	  
	Addcustmorpage addcustomer = PageFactory.initElements(driver, Addcustmorpage.class);
	addcustomer.clickoncustmorbutton();
	addcustomer.clickonAddcostmer();
	addcustomer.enterfullname("Apri2020");
	addcustomer.entercompany("Techfios");
	addcustomer.enteremaiaddress("123@techfios.com");
	addcustomer.enterphonenumber("123456677");
	addcustomer.enteraddress("FM");
	addcustomer.entercity("abc");
	addcustomer.enterstate("Tx");
	addcustomer.enterzip("75011");
	
	
	
	
	}

}
