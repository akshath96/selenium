package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class demo2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/admin/Desktop/admin1.html");
		driver.findElement(By.tagName("input")).sendKeys("akshatha");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).clear();
}}
