package fmproject.fmproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
     
	 @FindBy(xpath="//input[@type='text']")
	    WebElement useremail;
	 
	 @FindBy(xpath="//button[@id='addOrUpdateAction']")
	    WebElement continueButton;
	 
	 @FindBy(xpath="//input[@type='password']")
	    WebElement password;
	 
	
	public WebDriver driver;
	 @BeforeMethod
		public void setUp() {
	    	 WebDriverManager.chromedriver().setup();
	         driver = new ChromeDriver(); 
	        driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
	        driver.get("https://qa-flows.backflipt.com/");
		}
	 @Test(priority=1)
	    public void loginPage1() throws InterruptedException{
	        PageFactory.initElements(driver, this);
	        Thread.sleep(7000);
	        System.out.println(driver.getTitle());
			useremail.click();   
			useremail.sendKeys("poojag@backflipt.com");
			continueButton.click();
			Thread.sleep(7000);
			password.sendKeys("waste");
			continueButton.click();
			Thread.sleep(10000);
	 }
	 @Test(priority=2)
	    public void loginPage2() throws InterruptedException{
	        PageFactory.initElements(driver, this);
	        Thread.sleep(7000);
	        System.out.println(driver.getTitle());
			useremail.click();   
			useremail.sendKeys("pooja@backflipt.com");
			continueButton.click();
			Thread.sleep(7000);
			password.sendKeys("waste");
			continueButton.click();
			Thread.sleep(10000);
}
	
	 @Test(priority=3)
	    public void loginPage3() throws InterruptedException{
	        PageFactory.initElements(driver, this);
	        Thread.sleep(7000);
	        System.out.println(driver.getTitle());
			useremail.click();   
			useremail.sendKeys("poojag@backflipt.com");
			continueButton.click();
			Thread.sleep(7000);
			password.sendKeys("waste1");
			continueButton.click();
			Thread.sleep(10000);
}
}
