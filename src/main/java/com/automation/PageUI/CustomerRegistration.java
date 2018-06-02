package com.automation.PageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.automation.basepage.BasePage;





public class CustomerRegistration extends BasePage
{
	//customer registration
	
	@FindBy(linkText="Sign in") public WebElement signIn;
	@FindBy(id="email_create") WebElement Email;
	@FindBy(id="SubmitCreate") WebElement submit;
	@FindBy(xpath="//h1[text()='Create an account']") WebElement verifyaccount;
	@FindBy(id="id_gender2") WebElement Mrs;
	@FindBy(id="customer_firstname") WebElement Firstname;
	@FindBy(id="customer_lastname") WebElement Lastname;
	@FindBy(id="passwd") WebElement Password;
	@FindBy(id="days") WebElement Date;
	@FindBy(id="months") WebElement Month;
	@FindBy(id="years") WebElement Year;
	@FindBy(id="address1") WebElement Address;
	@FindBy(id="city") WebElement City;
	@FindBy(id="id_state") WebElement State;
	@FindBy(id="postcode") WebElement Postcode;
	@FindBy(id="id_country") WebElement Country;
	@FindBy(id="phone_mobile") WebElement Mobilenumber;
	@FindBy(id="submitAccount") WebElement Register;
	@FindBy(xpath="//h1[text()='My account']") WebElement MyAccount;
	
	public CustomerRegistration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void customerRegistration()
	{
		
		try {
			signIn.click();
			Email.sendKeys("qatest1886@gmail.com");
			submit.click();
			Thread.sleep(5000);
			//Assert.assertTrue(verifyaccount.getText().equalsIgnoreCase("Create an account"));
			Mrs.click();
			Firstname.sendKeys("Rohitha");
			Lastname.sendKeys("kaveti");
			Password.sendKeys("Lalitha@143");
			Date.sendKeys("19");
			Month.sendKeys("july");
			Year.sendKeys("1990");
			Address.sendKeys("Attapur");
			City.sendKeys("Hyderabad");
			State.sendKeys("Telangana");
			Postcode.sendKeys("50008");
			Country.sendKeys("India");
			Mobilenumber.sendKeys("8019801990");
			Register.click();
			//Assert.assertTrue(MyAccount.getText().equalsIgnoreCase("My account"));
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
