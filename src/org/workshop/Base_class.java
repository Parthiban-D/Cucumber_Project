package org.workshop;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import graphql.language.Argument;

public class Base_class {
	public static WebDriver driver;
	
	public static void BrowserLaunch(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tiger\\eclipse-workspace\\Parthiban\\Driver\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
	}
	//url
	public static void webpage(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	//navigate
	public static void navigate(String tab) {
		driver.navigate().to(tab);
	}
	
	//click
	public static void click(WebElement element) {
		element.click();
		
	}
	//Action
	public static void Action_key(WebElement element,WebElement drop,String object ) {
		Actions a= new Actions(driver);
		if (object.equalsIgnoreCase("movetoelement")) {
			a.moveToElement(element).build().perform();
			
		}else if (object.equalsIgnoreCase("doubleclick")) {
			a.doubleClick(element).build().perform();
		}else if (object.equalsIgnoreCase("drag & drop")) {
			a.dragAndDrop(element, drop).build().perform();
			
		}else if (object.equalsIgnoreCase("contextclick")) {
			a.contextClick(element).build().perform();
			
		}else {
			System.out.println("Invalid Action");
		}
		
	}
	//Frame
	public static void Frame_concept(WebElement element,String option,String value) {
		if (option.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			driver.switchTo().frame(parseInt);
			
		}else if (option.equalsIgnoreCase("value")) {
			driver.switchTo().frame(value);
			
		}else if (option.equalsIgnoreCase("Webelement")) {
			driver.switchTo().frame(element);
			
		}
		
	}
	//Select
	public static void Select_index(WebElement element, String option, String value) {
		Select s=new Select(element);
		if (option.equalsIgnoreCase("by Index")) {
			int parseInt= Integer.parseInt(value);
			s.selectByIndex(parseInt);
			
		}else if (option.equalsIgnoreCase("by value")) {
			s.deselectByValue(value);
			
		}else if (option.equalsIgnoreCase("by visibleText")) {
			s.selectByVisibleText(value);
			
		}else {
			System.out.println("Invalid");
		}
		
	}
	//Screenshot
	public static void Screenshot() throws IOException {
		TakesScreenshot s= (TakesScreenshot) driver;
		File source =s.getScreenshotAs(OutputType.FILE);
		File dest =new File(".//screenshot//sample.png");
		FileUtils.copyDirectory(source, dest);
		
	}
		//Robot
	public static void Robotic(String option) throws AWTException {
		
		Robot r = new Robot();
		if (option.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			
			r.keyRelease(KeyEvent.VK_UP);
			
		}else if (option.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}else if (option.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		}
		
	}
	
	public static void locators(WebElement element, String object, String value) {
		if (object.equalsIgnoreCase("byName")) {
			driver.findElement(By.name(value));
			
		}else if (object.equalsIgnoreCase("byid")) {
			driver.findElement(By.id(value));
			
		}
		
	}
	//Alert
	public static void Alert_concept(String option, String value) {
		Alert a =driver.switchTo().alert();
		if (option.equalsIgnoreCase("accept")) {
			a.accept();
			
		}else if (option.equalsIgnoreCase("dismiss")) {
			a.dismiss();
			
		}else if (option.equalsIgnoreCase("sendkeys")) {
			a.sendKeys(value);
			
		}
		
	}
	//multiple
	public static void multiselect(WebElement element) {
		Select s= new Select(element);
		List<WebElement> list = s.getOptions();
		for (WebElement pm : list) {
			System.out.println(pm.getText());
			
		}
		
	}
	//scroll
	public static void ScrollFunction(WebElement element, String option, String value) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		if (option.equalsIgnoreCase("scroll")) {
			j.executeScript("argument[0].scrollIntoView()", element);
			
		}else if (option.equalsIgnoreCase("click")) {
			j.executeScript("arguments[0].click", element);
			
		}
				
		
	}
	//clear
	public static void clear(WebElement element) {
		element.clear();
		
	}
	//sendkeys
	public static void Inputdata(WebElement element, String p) {
		element.sendKeys(p);
		
	}
		
	
		
	

}
