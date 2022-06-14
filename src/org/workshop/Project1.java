package org.workshop;


import java.awt.event.ActionEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tiger\\eclipse-workspace\\Parthiban\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://automationpractice.com/index.php");
		WebElement sign_in = driver.findElement(By.xpath("//a[@class=\"login\"]"));
		sign_in.click();
	
		WebElement email_id = driver.findElement(By.id("email"));
		email_id.sendKeys("mqrp234@gmail.com");
		driver.findElement(By.id("SubmitLogin")).click();
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("2345678");
		WebElement login =driver.findElement(By.id("SubmitLogin"));
		login.click();
		WebElement dress = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions a = new Actions(driver);
		a.moveToElement(dress).build().perform();
		
		WebElement casual = driver.findElement(By.xpath("(//*[text()='Casual Dresses'])[1]"));
		a.moveToElement(casual).build().perform();
		casual.click();
		
		WebElement image = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		image.click();
		
		driver.switchTo().frame(0);
		
		WebElement cart = driver.findElement(By.xpath("//*[@id='add_to_cart']//child::*[@type='submit']"));
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(cart));
		
		cart.click();
		
		WebElement maha =driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		maha.click();
		
		WebElement out =driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		out.click();
		
		
		
		
		
		

	}
}
