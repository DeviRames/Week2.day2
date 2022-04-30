package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Maximize the window
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account_ts");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("testleaf.com");
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("800000");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();

		




		

		
		
	}

}
