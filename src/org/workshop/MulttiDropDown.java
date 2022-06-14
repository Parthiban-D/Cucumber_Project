package org.workshop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MulttiDropDown {
	public static void main(String[] args) throws InterruptedException {
		
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tiger\\eclipse-workspace\\Parthiban\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement multidrop=driver.findElement(By.xpath("//select[@id='second']"));
		Select s=new Select(multidrop);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		List<WebElement> options =s.getOptions();
		for (WebElement data : options) {
			System.out.println(data.getText());
		}
	
		int size= options.size();
		for (int i=0; i < size; i++) {
			if (i==2||i==1||i==3||i==5)
				s.selectByIndex(i);
		}
		
		System.out.println("==========selected options=========");
		List<WebElement> options1 = s.getAllSelectedOptions();
		for (WebElement data1 : options1) {
			System.out.println(data1.getText());
		}
		WebElement firstSelectedOptions =s.getFirstSelectedOption();
		System.out.println(firstSelectedOptions.getText());
		Thread.sleep(3000);
		s.deselectAll();
		Thread.sleep(2000);
		driver.quit()
;	

}

}