package com.ibm.seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MagentoReg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.com");
	WebElement iconEle=driver.findElement(By.xpath("//span[text()='Account']/ancestor::a"));
	iconEle.click();
	Thread.sleep(10000);
	WebElement RegisterEle=driver.findElement(By.xpath("//button[@type='button']"));
	RegisterEle.click();
	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Achyut");
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Krishna");
	driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("dbsdjsd@gmail.com");
	WebElement countryEle=driver.findElement(By.xpath("//select[@id='country']"));
	Select s=new Select(countryEle);
	s.selectByVisibleText("India");
	WebElement companyEle=driver.findElement(By.xpath("//select[@name='company_type']"));
	Select c=new Select(companyEle);
	c.selectByVisibleText("Develops Magento extensions");
	WebElement RolEle=driver.findElement(By.xpath("//select[@name='individual_role']"));
	Select r=new Select(RolEle);
	r.selectByVisibleText("Technical/developer");
	WebElement pasEle=driver.findElement(By.xpath("//input[@type='password']"));
	pasEle.sendKeys("Qaz123#$");
	WebElement cpasEle=driver.findElement(By.xpath("//input[@name='confirmation']"));
	cpasEle.sendKeys("Qaz123#$");
	WebElement checkEle=driver.findElement(By.xpath("//input[@id='agree_terms']"));
	checkEle.click();
	WebElement submitElee=driver.findElement(By.xpath("//button[@id='registerSubmit']"));
	submitElee.click();
	}
	
}
