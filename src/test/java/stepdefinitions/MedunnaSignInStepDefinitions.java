package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MedunnaHomePage;
import pages.MedunnaLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.click;

public class MedunnaSignInStepDefinitions {
    MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
    MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();

    @Given("go to {string}")
    public void go_to(String url) {

        Driver.getDriver().get(url);

    }
    @When("click on user icon")
    public void click_on_user_icon() {

        click( medunnaHomePage.userIcon);

    }
    @When("click on sign in option")
    public void click_on_sign_in_option() {

        click( medunnaHomePage.signInOption);

    }


    @When("send username into username input")
    public void send_username_into_username_input() {

        medunnaLoginPage.usernameInput.sendKeys(ConfigReader.getProperty("medunna_username"));

    }


    @When("send password into password input")
    public void send_password_into_password_input() {

        medunnaLoginPage.passwordInput.sendKeys(ConfigReader.getProperty("medunna_password"));

    }
    @When("click on sign in submit button")
    public void click_on_sign_in_submit_button() {

        click( medunnaLoginPage.signInSubmitButton);

    }
}
