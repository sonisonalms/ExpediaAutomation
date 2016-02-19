package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightSearchPage {

	private static WebElement element =null;
	
	public static WebElement ClickFlightTab(WebDriver driver){
		element= driver.findElement(By.id("tab-flight-tab"));
		return element;	
	}
	
	public static WebElement FlyingFrom(WebDriver driver){
		element = driver.findElement(By.id("flight-origin"));
		return element;
	}
	
	public static WebElement FlyingTo(WebDriver driver){
		element =driver.findElement(By.id("flight-destination"));
		return element;
	}
	
	public static WebElement DeptDate(WebDriver driver){
		element = driver.findElement(By.id("flight-departing"));
		return element;	
	}
	
	public static WebElement ReturnDate(WebDriver driver){
		element = driver.findElement(By.id("flight-returning"));
		return element;	
	}
	
	public static WebElement ClickSearch(WebDriver driver){
		element = driver.findElement(By.id("search-button"));
		return element;	
	}
}
