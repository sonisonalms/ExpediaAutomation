package TestCases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageClasses.FlightSearchPage;
import PageClasses.HotelSearchPage;
import PageClasses.SearchPage;

public class FlightSearchModel {
	
	private WebDriver driver;
	private String baseURL;
	
	
	@Before
	public void setup(){
		baseURL= "https://www.expedia.com";
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testSearch(){
		driver.get(baseURL);
		SearchPage.getFromAirport(driver).sendKeys("SFO");
		SearchPage.getToAirport(driver).sendKeys("FLL");
		SearchPage.getDeptDate(driver).sendKeys("07/22/2016");
		SearchPage.getReturnDate(driver).sendKeys("08/21/2016");
		//SearchPage.getReturnDate(driver).sendKeys("12/30/2016");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		SearchPage.Searchbutton(driver).click();	
	}
	
	@Test
	public void testHotelSearch(){
		driver.get(baseURL);
		HotelSearchPage.ClickHotelTab(driver).click();
		HotelSearchPage.getGoingTo(driver).sendKeys("FLL");
		HotelSearchPage.getCheckIn(driver).sendKeys("07/22/2016");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		HotelSearchPage.getCheckOut(driver).sendKeys("08/21/2016");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		HotelSearchPage.Searchbutton(driver).click();	
	} 
	
	@Test
	public void testFlightSearch(){
		driver.get(baseURL);
		FlightSearchPage.ClickFlightTab(driver).click();
		FlightSearchPage.FlyingFrom(driver).sendKeys("SFO");
		FlightSearchPage.FlyingTo(driver).sendKeys("FLL");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		FlightSearchPage.DeptDate(driver).sendKeys("08/12/2016");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		FlightSearchPage.ReturnDate(driver).sendKeys("08/30/2016");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		FlightSearchPage.ClickSearch(driver).click();	
	}
	
	@After
	public void tearDown(){
		
	}

}	

