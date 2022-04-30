package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

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
		Select dropdown= new Select(driver.findElement(By.id("currencyUomId")));
		dropdown.selectByValue("INR"); 
		driver.findElement(By.name("description")).sendKeys("NRI Account");		
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Testleaf");		
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Testleaf.com");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("100000");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		System.out.println(driver.findElement(By.xpath("//li[@class='errorMessage']")).getText());
}
}
