package Agiliztech_Interview_Q_AND_A;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fetch_five_fisrt_product_name_and_price {

	@Test
	public void tc(){
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> name= driver.findElements(By.xpath("//h4[@class='product-name']"));
		List<WebElement> price= driver.findElements(By.xpath("//p[@class='product-price']"));

		for(int i=0;i<name.size();i++) {
			if(i<=5) {
				
				String productname=name.get(i).getText();
				String product_prices=price.get(i).getText();

				System.out.println(productname+"-->"+product_prices);

				
			}
			
		}
	}
}
