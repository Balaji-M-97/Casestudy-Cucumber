package casestudy;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario4 {
	WebDriver dri;
	Action action;
	@Given("url to bee as {string}")
	public void url_to_bee_as(String string) {
		String cpath="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\SELENIUM WORK BA\\JAR\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", cpath);
		dri=new ChromeDriver();
		dri.get(string);
	}

	@When("that userr enter name as {string}")
	public void that_userr_enter_name_as(String string) {
		dri.findElement(By.name("userName")).sendKeys(string);
	}

	@When("that userr enter password as {string}")
	public void that_userr_enter_password_as(String string) {
		dri.findElement(By.name("password")).sendKeys(string);
		dri.findElement(By.name("Login")).click();
	}

	@When("searches {string} in search")
	public void searches_in_search(String string) {
		dri.findElement(By.name("products")).click();
		Actions action=new Actions(dri);
		action.sendKeys("headphone");
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@Then("cart icon not to show")
	public void cart_icon_not_to_show()  {
		
		try {
			WebElement cart=dri.findElement(By.xpath("//a[contains(text(),'Cart')]"));
			System.out.println("The cart status"+cart.isDisplayed());
		}
		catch (Exception e) {
			// TODO: handle exception
			//Assert.assertTrue(e instanceof NoSuchElementException || e instanceof NullPointerException);
		System.out.println(e.getMessage());
		}



	}


}
