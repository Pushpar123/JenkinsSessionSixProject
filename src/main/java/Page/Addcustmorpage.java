package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Addcustmorpage extends BasePage {
	WebDriver driver;
	
	public Addcustmorpage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	@FindBy(how= How.XPATH, using ="//i[@class='icon-users']") WebElement CUSTOMERS_BUTTON_LOCATOR; 
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]") WebElement ADD_CUSTOMER_BUTTON_LOCATOR;
	@FindBy(how= How.XPATH, using="//input[@id='account']") WebElement User_name_field;
	@FindBy(how= How.XPATH, using="//*[@id='cid']") WebElement Company_name_field;
	@FindBy(how= How.XPATH, using="//input[@id='email']") WebElement Email_field;
	@FindBy(how= How.XPATH, using="//input[@id='phone']") WebElement Phone_number_field;
	@FindBy(how= How.XPATH, using="//input[@id='address']") WebElement Address_Field;
	@FindBy(how = How.XPATH, using="//input[@id='city']") WebElement City_Field;
	@FindBy(how= How.XPATH, using="//input[@id='state']") WebElement State_Field;
	@FindBy(how=How.XPATH, using ="//input[@id='zip']") WebElement Zip_Field;
	//@FindBy(how=How.XPATH, using ="//span[@id='select2-country-container']") WebElement Country_Field;
	
	
//Intractive Methods
	public void clickoncustmorbutton() {
	CUSTOMERS_BUTTON_LOCATOR.click();
	}
	public void clickonAddcostmer() {
		WaitForElement(driver, 3, ADD_CUSTOMER_BUTTON_LOCATOR);
		ADD_CUSTOMER_BUTTON_LOCATOR.click();	
	}
public void enterfullname(String username) {
	WaitForElement(driver ,3 ,User_name_field);
	 User_name_field.sendKeys(username);
}
public void entercompany(String company) {
SelectDropDown(Company_name_field, company);

}
public void enteremaiaddress(String email) {
	Email_field.sendKeys(email);
}
public void enterphonenumber(String phonenumber) {
	Phone_number_field.sendKeys(phonenumber);	
}
public void enteraddress(String address) {
	Address_Field.sendKeys(address);
}
public void entercity(String city) {
City_Field.sendKeys(city);
}
public void enterstate(String state) {
	State_Field.sendKeys(state);
}
public void enterzip(String zip) {
	Zip_Field.sendKeys(zip);


}
}
