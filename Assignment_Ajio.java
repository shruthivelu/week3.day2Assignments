package week3.day2Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		String itemsfound = driver.findElement(By.className("length")).getText();
		System.out.println(itemsfound);
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		List<String> allbrands = new ArrayList<String>();
		for (WebElement brnd : brands) {
			String text = brnd.getText();
			allbrands.add(text);
			
		}
		
		System.out.println(allbrands);

	}

}
