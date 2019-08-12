package steps.com.ua;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegAndLoginStepdefs {

    WebDriver driver;

    @Before("@Test1")
    public void setUp() {
        System.setProperty("driver.chrome", "C:\\webdrivers\\chromedriver");
        driver = new ChromeDriver();
    }

    @Given("Navigate to sharelane.com")
    public void navigateToSharelaneCom() {
        driver.get("http://www.sharelane.com/cgi-bin/main.py");
    }

    @When("You've been navigated to it, click Sign-up")
    public void youVeBeenNavigatedToItClickSignUp() {
        WebElement signup = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a"));
        signup.click();
    }

    @And("Enter ZIP code")
    public void enterZIPCode() {
        WebElement zipcode = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        zipcode.sendKeys("55555");
    }

    @Then("Click Continue")
    public void clickContinue() {
        WebElement btnContinue = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        btnContinue.click();
    }

    @And("Enter first name")
    public void enterFirstName() {
        WebElement firstname = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input"));
        firstname.sendKeys("Oleh");
    }

    @And("Enter last name")
    public void enterLastName() {
        WebElement lastname = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        lastname.sendKeys("F");
    }

    @And("Enter email")
    public void enterEmail() {
        WebElement email = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        email.sendKeys("1@g.mail.com");
    }

    @And("Enter password")
    public void enterPassword() {
        WebElement password = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input"));
        password.sendKeys("11111");
    }

    @And("Enter confirmation password")
    public void enterConfirmationPassword() {
        WebElement confirmpassword = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));
        confirmpassword.sendKeys("11111");
    }

    @Then("Click Register")
    public void clickRegister() {
        WebElement btnRegister = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input"));
        btnRegister.click();
    }

    @When("You've been registered, click underlined here")
    public void youVeBeenRegisteredClickUnderlinedHere() {
        WebElement regmessage = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span"));
        Assert.assertEquals("Account is created!",regmessage.getText());

        WebElement here = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td/p/a"));
        here.click();
    }

    @Then("Enter email")
    public void enterLogin() {
    }


    @And("Enter password login")
    public void enterPasswordLogin() {

    }

    @And("Click Login")
    public void clickLogin() {


    }

    @Then("You've been signed in")
    public void youVeBeenSignedIn() {
    }

}
