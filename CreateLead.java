package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Devi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("TS");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The Title is :" + driver.getTitle());
		driver.close();



		

	}
}
