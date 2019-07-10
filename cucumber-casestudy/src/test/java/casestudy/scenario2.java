package casestudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenario2 {
	WebDriver dri;
	@Given("url of testmeapp login {string}")
	public void url_of_testmeapp_login(String string) {
		String cpath="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\SELENIUM WORK BA\\JAR\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", cpath);
		dri=new ChromeDriver();
		dri.get(string);
	}

	@When("ram enters {string} as username")
	public void ram_enters_as_username(String string) {
		dri.findElement(By.name("userName")).sendKeys(string);
	}

	@When("ram enters {string} as password")
	public void ram_enters_as_password(String string) {
		dri.findElement(By.name("password")).sendKeys(string);
	}

	@When("click on login")
	public void click_on_login() {
		dri.findElement(By.name("Login")).click();
	}
	@Then("ram is to be in his account window")
	public void ram_is_to_be_in_his_account_window() {
	   Assert.assertFalse(dri.findElement(By.xpath("//a[contains(@href,'logout.htm')]")).isDisplayed());
	  
	}

}
