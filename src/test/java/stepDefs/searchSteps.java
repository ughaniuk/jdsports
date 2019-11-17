package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver_managers.driverManager;
import org.openqa.selenium.By;

public class searchSteps extends driverManager {

    @Given("^I am on homepage$")
    public void i_am_on_homepage() {
    openBrowser();

    }

    @When("^I search for a Nike$")
    public void i_search_for_a_Nike() {
        driver.findElement(By.id("srchInput")).sendKeys("Nike");
        driver.findElement(By.id("srchButton")).click();
    }

    @Then("^I should be able to see desired product$")
    public void i_should_be_able_to_see_desired_product()  {
        String actualTitle = driver.getTitle();
        assert actualTitle.contains("Nike");
        closeBrowser();
    }
}
