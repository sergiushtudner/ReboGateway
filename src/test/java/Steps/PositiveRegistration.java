
package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveRegistration {
  private WebDriver driver;

    @Given("Open site in Google Chrome")
    public void open_site_in_Google_Chrome() {
        System.setProperty("webdriver.chrome.driver","C:/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
  //      driver.get("https://rebogateway.herokuapp.com");
    }
    @Given("CLick Sing Up button")
    public void click_Sing_Up_button() {
    //driver.findElement(By.xpath("//a[@class='btn btn-success btn-sm']")).click();
//        WebElement SignUp=driver.findElement(By.xpath("//a[@class='btn btn-success btn-sm']"));
//        SignUp.click();
        WebElement Search=driver.findElement(By.name("q"));
         Search.sendKeys("Moldova");
         Search.sendKeys(Keys.ENTER);
    }
    @When("Fill Email Adress \\(username)")
    public void fill_Email_Adress_username() {
        WebElement Email=driver.findElement(By.xpath("//input[@placeholder='Email Address (username)']"));
        Email.click();
        Email.sendKeys("test@test.md");
    }
    @And("Fill First Name")
    public void fill_First_Name() {
    }
    @And("Click on button Create an account")
    public void click_on_button_Create_an_account() {
    }
    @Then("Opened Billing Page")
    public void opened_Billing_Page() {
    }

}
