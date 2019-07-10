package casestudy;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario3 {
WebDriver dri;
Action action;
	@Given("url to be as {string}")
	public void url_to_be_as(String string) {
		String cpath="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\SELENIUM WORK BA\\JAR\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", cpath);
		dri=new ChromeDriver();
		dri.get(string);
	}

	@When("that user enter name as {string}")
	public void that_user_enter_name_as(String string) {
		dri.findElement(By.name("userName")).sendKeys(string);

	}

	@When("that user enter password as {string}")
	public void that_user_enter_password_as(String string) {
		dri.findElement(By.name("password")).sendKeys(string);
		dri.findElement(By.name("Login")).click();
	}

	@When("search {string} in search")
	public void search_in_search(String string) {
		dri.findElement(By.name("products")).click();
		Actions action=new Actions(dri);
		action.sendKeys("headphone");
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@When("add it to cart")
	public void add_it_to_cart() {
		dri.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
	}

	@When("Click on display cart")
	public void click_on_display_cart() {
		dri.findElement(By.xpath("//a[contains(@href,'displayCart.htm')]")).click();
	}

	@When("click on check out")
	public void click_on_check_out() {
		dri.findElement(By.xpath("//a[contains(@href,'checkout.htm')]")).click();
	}

	@When("click on proceed to pay")
	public void click_on_proceed_to_pay() {
		dri.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	}

	@When("select bank")
	public void select_bank() {
	    dri.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    dri.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
	
	}

	@When("click continue")
	public void click_continue() {
		dri.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
	}

	@When("Givess {string}")
	public void givess(String string) {
	    dri.findElement(By.name("username")).sendKeys(string);;
	}

	@When("give {string}")
	public void give(String string) {
		 dri.findElement(By.name("password")).sendKeys(string);;
		 
	}

	@When("click login")
	public void click_login() {
		dri.findElement(By.xpath("//input[@value='LOGIN']")).click();
	}
	
	@When("give the {string}")
	public void give_the(String string) {
		 dri.findElement(By.name("transpwd")).sendKeys(string);;
		 
	}

	@When("click paynow")
	public void click_paynow() {
		dri.findElement(By.xpath("//input[@value='PayNow']")).click();
	}

	@Then("user in orderdetails")
	public void user_in_orderdetails() {
		Assert.assertEquals("Order Details", dri.getTitle());
		
	}
}
