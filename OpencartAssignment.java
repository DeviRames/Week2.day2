package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpencartAssignment {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://www.opencart.com/index.php?route=account/register");
		// Maximize the window
		driver.manage().window().maximize();
		driver.findElement(By.id("input-username")).sendKeys("Devits28");
		driver.findElement(By.id("input-firstname")).sendKeys("Devi");
		driver.findElement(By.id("input-lastname")).sendKeys("TS");
		driver.findElement(By.id("input-email")).sendKeys("devits28@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("devits28");
		driver.findElement(By.id("input-country")).sendKeys("India");


		}
}
