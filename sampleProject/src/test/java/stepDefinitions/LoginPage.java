package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	
	public WebDriver driver;
	
	@Given("Launch the browser")
	public void launch_the_browser() {
	    System.setProperty("webdriver.chrome.driver", "D:\\Cucumber-WorkSpace1\\sampleProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("User opens the url {string}")
	public void user_opens_the_url(String url) {
	    driver.get(url);
	}

	@When("User enters the username {string} and password as {string}")
	public void user_enters_the_username_and_password_as(String username, String password) throws InterruptedException {
	    driver.findElement(By.id("Email")).clear();
	    driver.findElement(By.id("Email")).sendKeys(username);
	    Thread.sleep(3000);
	    driver.findElement(By.id("Password")).clear();
	    driver.findElement(By.id("Password")).sendKeys(password);
	    Thread.sleep(3000);
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() throws InterruptedException {
	    driver.findElement(By.cssSelector("button[type='submit']")).click();
	    Thread.sleep(3000);
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
	    String title1= "Dashboard / nopCommerce administration";
	    Assert.assertEquals(title1, driver.getTitle());
	        
	}

	@Then("title should be {string}")
	public void title_should_be(String string) {
	    System.out.println("The tile of the page is " + driver.getTitle());
	}

	@When("User clicks on Logout button")
	public void user_clicks_on_logout_button() throws InterruptedException {
	    driver.findElement(By.linkText("Logout")).click();
	    Thread.sleep(3000);
	}

	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	}

	

}

