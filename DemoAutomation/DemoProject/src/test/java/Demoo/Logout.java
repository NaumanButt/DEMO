package Demoo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	
	
	
	static WebDriver driver = Login.driver;
	public  void  Log() throws InterruptedException, IOException{
		
		
		
		Thread.sleep(1000);
		driver.findElement(By.id("react-burger-menu-btn")).click();

		
		Thread.sleep(1000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		
		Thread.sleep(1000);
		System.out.println("logOut Successfully");
		
		
		
	}
	

}
