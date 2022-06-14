package org.workshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tiger\\eclipse-workspace\\Parthiban\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement sign_in = driver.findElement(By.xpath("//a[@class=\"login\"]"));
		sign_in.click();
		Thread.sleep(5000);
		WebElement email_id = driver.findElement(By.id("email_create"));
		email_id.sendKeys("mqrp234@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(5000);
		WebElement gender = driver.findElement(By.id("id_gender1"));
		gender.click();
		Thread.sleep(3000);
		WebElement firstName = driver.findElement(By.id("customer_firstname"));
		firstName.sendKeys("Parthiban");
		WebElement lastname =driver.findElement(By.id("customer_lastname"));
		lastname.sendKeys("D");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("2345678");
		WebElement day =driver.findElement(By.id("days"));
		Select s =new Select(day);
		s.selectByValue("14");
		WebElement month =driver.findElement(By.name("months"));
		Select s1=new Select(month);
		s1.selectByIndex(5);
		WebElement year =driver.findElement(By.id("years"));
		Select s2 = new Select(year);
		s2.selectByValue("1998");
		driver.findElement(By.id("newsletter")).click();
		WebElement add= driver.findElement(By.id("address1"));
		add.sendKeys("dkp,adyar,chennai");
		WebElement city = driver.findElement(By.cssSelector("input[name='city']"));
		city.sendKeys("chozhadesam");
		WebElement state=driver.findElement(By.id("id_state"));
		Select s3 =new Select(state);
		s3.selectByVisibleText("Hawaii");
		driver.findElement(By.id("postcode")).sendKeys("14253");
		WebElement country=driver.findElement(By.id("id_country"));
		Select s4=new Select(country);
		s4.selectByVisibleText("United States");
		driver.findElement(By.id("phone_mobile")).sendKeys("8248665994");
		driver.findElement(By.id("submitAccount")).click();
		
		
		
		

		
		
	
		
		
		
		
	}

}
