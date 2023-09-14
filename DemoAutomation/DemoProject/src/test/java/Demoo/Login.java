package Demoo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login  {






	// static WebDriver driver = Utilshelper.driver;

	static WebDriver driver;




	public  void  credentialts() throws InterruptedException, IOException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nauman.ansar\\Downloads\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");


		driver = new ChromeDriver(option);
		Thread.sleep(2000); 
		//driver.get("www.google.com");


		driver.get("https://www.saucedemo.com/");

		//		UseraName & Pssword
		Thread.sleep(1000); 
		System.out.println(" Entering Credentials");


		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();

		System.out.println("login Successfully");

		Thread.sleep(1000);


		//add to cart 1 item

		try {
			// Find the first inventory item
			WebElement firstInventoryItem = driver.findElement(By.cssSelector(".inventory_item"));

			// Find the "Add to cart" button within the first inventory item
			WebElement addToCartButton = firstInventoryItem.findElement(By.cssSelector(".btn_inventory"));

			// Find the name of the first inventory item
			WebElement itemNameElement = firstInventoryItem.findElement(By.cssSelector(".inventory_item_name"));
			String itemName = itemNameElement.getText();

			// Click the "Add to cart" button
			addToCartButton.click();

			// Print the name of the first inventory item
			System.out.println(itemName + " is added to cart");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			//  driver.quit();
		}






		Thread.sleep(2000);
		driver.findElement(By.id("shopping_cart_container")).click();

		Thread.sleep(1000);







		//		Items Count------
		
		
		if(driver.findElements(By.className("cart_item")).size()>0)
		{
			System.out.println("Cart Item = "+driver.findElements(By.className("cart_item")).size());
			System.out.println("Processing for Check Out");
		
		


	    





		//			Check Out------

		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();




		Thread.sleep(2000); 



		driver.findElement(By.id("first-name")).sendKeys("Nauman Ansar");
		Thread.sleep(1000);
		driver.findElement(By.id("last-name")).sendKeys("Butt");

		Thread.sleep(1000);
		driver.findElement(By.id("postal-code")).sendKeys("29544");
		Thread.sleep(1000);


		/////continue button
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();


		

		//click on finsh button



		Thread.sleep(1000);
		driver.findElement(By.id("finish")).click();


		Thread.sleep(1000);

		//after check out completed


		// Check if the element exists and contains the desired text
		if (driver.findElements(By.id("checkout_complete_container")).size()>0) {
			String completionText = driver.findElement(By.id("checkout_complete_container")).getText();
			if (completionText.contains("Thank you for your order!")) {
				System.out.println("Order completion message found!");
			} else {
				System.out.println("Order completion message not found.");
			}
		} else {
			System.out.println("Element with class 'checkout_complete_container' not found.");
		}




		}
		
	
		else
		{










		System.out.println("There is item showing in the cart");
		}
	}










}
