package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acmetest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		// Open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://acme-test.uipath.com/login");
		// Maximize the window
		driver.manage().window().maximize();
		
		// Finding the webelement
		WebElement elementUsername = driver.findElement(By.id("email"));
		// Entering some input in the text box
		elementUsername.sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
		System.out.println("The Title is :" + driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		driver.close();
}
}
