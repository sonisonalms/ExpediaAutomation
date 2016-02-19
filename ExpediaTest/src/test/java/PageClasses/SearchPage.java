package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	private static WebElement element =null;
	
	public static WebElement getFromAirport(WebDriver driver){
		element = driver.findElement(By.id("package-origin"));
		return element;
		
	}
	
	public static WebElement getToAirport(WebDriver driver){
		element = driver.findElement(By.id("package-destination"));
		return element;
	}
	
	public static WebElement getDeptDate(WebDriver driver){
		element = driver.findElement(By.id("package-departing"));
		return element;
	}
	
	public static WebElement getReturnDate(WebDriver driver){
		element = driver.findElement(By.id("package-returning"));
		return element;
	}
	
	public static WebElement Searchbutton(WebDriver driver){
		element = driver.findElement(By.id("search-button"));
		return element;
	}

}
