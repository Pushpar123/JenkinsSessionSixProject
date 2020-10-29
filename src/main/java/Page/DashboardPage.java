package Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.google.common.annotations.VisibleForTesting;




public class DashboardPage {
	
	WebDriver driver;
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//Dashboard Element
	
	@FindBy(how= How.XPATH, using ="//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement Dashboard_search_Locator;
	public void validata_Dashboard_Search_Page() {
		//System.out.println(">>>>>>>>>>>>"+Dashboard_search_Locator.getText());
	//Assert.assertEquals("Wrong page", "Dashboard", Dashboard_search_Locator.getText());
	}
	

}
