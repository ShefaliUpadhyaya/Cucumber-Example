package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	public static WebDriver driver;
	WebElement element;

@Given("User is on Google Page")
public void user_is_on_Google_Page() throws Throwable {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
}

@When("User Navigates to Search Bar")
public void user_Navigates_to_Search_Bar() throws Throwable {
	element = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
}

@When("User Enters \"(.*)\"")
public void user_Enters(String text) throws Throwable {
    element.sendKeys(text);
}

@When("User Clicks on Google Search")
public void user_Clicks_on_Google_Search() throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
}

@Then("Search is Successfully Performed")
public void search_is_Successfully_Performed() throws Throwable {
	System.out.println("Searched successfully");
}

}
