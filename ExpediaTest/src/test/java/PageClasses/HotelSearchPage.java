package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelSearchPage {
	
	private static WebElement element =null;

	
	public static WebElement ClickHotelTab(WebDriver driver){
		element=driver.findElement(By.id("tab-hotel-tab"));
		return element;
	}
	
	public static WebElement getGoingTo(WebDriver driver){
		element = driver.findElement(By.id("hotel-destination"));
		return element;
	}
	
	public static WebElement getCheckIn(WebDriver driver){
		element = driver.findElement(By.id("hotel-checkin"));
		return element;
	}
		
	public static WebElement getCheckOut(WebDriver driver){
		element = driver.findElement(By.id("hotel-checkout"));
		return element;
	}
	
	public static WebElement Searchbutton(WebDriver driver){
		element = driver.findElement(By.id("search-button"));
		return element;
	}
		
}
