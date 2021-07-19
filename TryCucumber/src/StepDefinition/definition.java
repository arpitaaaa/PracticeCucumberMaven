package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class definition {
	WebDriver driver;
@Given("^I should have valid URl for Login Page$")
public void i_should_have_valid_URl_for_Login_Page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C://Users//ArpitaAgrawal//Desktop//SDET//JARs//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");	  


}

@When("^I enter Valid UserName$")
public void i_enter_Valid_UserName() throws Throwable {
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
}

@When("^I Enter Valid Password$")
public void i_Enter_Valid_Password() throws Throwable {
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
}

@When("^I click Submit button$")
public void i_click_Submit_button() throws Throwable {
	driver.findElement(By.id("btnLogin")).click();
}

@Then("^Login successfully$")
public void login_successfully() throws Throwable {
	String actualName = driver.findElement(By.id("welcome")).getText();
	String expectedName = "Welcome Paul";
	Assert.assertEquals(expectedName, actualName);

	driver.findElement(By.id("welcome")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]")).click();
	System.out.println("Logged Out");
	driver.close();
}


}
