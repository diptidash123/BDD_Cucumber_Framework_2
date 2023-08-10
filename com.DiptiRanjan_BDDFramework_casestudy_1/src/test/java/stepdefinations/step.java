package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step {
	WebDriver driver;
	@Given("Launching the browser [optional any browser]")
	public void launching_the_browser_optional_any_browser() {
	    // Write code here that turns the phrase above into concrete actions

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dipti Ranjan Dash\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		System.out.println("Given: statement is executed correctly");
	}

	@When("validate the current URL.")
	public void validate_the_current_url() {
	    // Write code here that turns the phrase above into concrete actions
		 String	url=driver.getCurrentUrl();
		 String expectedurl="https://www.saucedemo.com/";
		 if (url.equals(expectedurl))
		 {
			System.out.println("2: url is correct validated");
//			System.out.println("========================");
		  }
		 else 
		 {
			System.out.println("3: url is incorrect validated");
//			System.out.println("==========================");
		}
	}

	@When("validate the page title.")
	public void validate_the_page_title() {
	    // Write code here that turns the phrase above into concrete actions
		String title=driver.getTitle();
		String expectedtitle="Swag Labs";
		if (title.equals(expectedtitle)) 
		{
			System.out.println("4: title is correct");
//			System.out.println("================");
			
		}
		else 
		{
			System.out.println("5: title is incorrect");
//			System.out.println("==================");
		}
		}

	@Then("user should redirect to the dashboard page.")
	public void user_should_redirect_to_the_dashboard_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class=\"input_error form_input\"])[1]")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class=\"input_error form_input\"])[2]")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class=\"submit-button btn_action\"]")).click();
		Thread.sleep(3000);
	}

	@Then("click to burger element and click to logout.")
	public void click_to_burger_element_and_click_to_logout() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	  
	}

	@Then("use a synchronization timeout in-between step {int} and {int}.")
	public void use_a_synchronization_timeout_in_between_step_and(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	   
	}

	@And("use implicitly wait before step4.")
	public void use_implicitly_wait_before_step4() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}