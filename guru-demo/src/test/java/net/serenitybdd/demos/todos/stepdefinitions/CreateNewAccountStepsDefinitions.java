package net.serenitybdd.demos.todos.stepdefinitions;

import jxl.common.Assert;
import net.serenitybdd.demos.todos.steps.LoginToGuruSteps;
import net.serenitybdd.demos.todos.steps.NewAccountSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

/**
 * Created by vuthaiduong on 8/13/17.
 */
public class CreateNewAccountStepsDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    LoginToGuruSteps user;
    @Steps
    NewAccountSteps account;

    @Given("User login with \"$userId\" and \"$password\" successfully")
    public void user_login_successfully(String userId, String password) {
        user.open_guru99_home_page();
        user.login_to_guru99(userId, password);
        user.verify_user_login_successfully();
    }

    @Given("New customer want to create account")
    public void new_customer_want_to_create_account(){
        account.open_new_account_page();
    }

    @When("New customer input \"$customerId\" and \"$accountType\" and \"$deposit\" and submit")
    public void new_customer_input_info_and_submit(String customerId, String accountType, String deposit) {
        account.input_new_account_info(customerId, accountType, deposit);
        account.submit();
    }

    @When("New customer input \"$customerId\" and \"$accountType\" and \"$deposit\" and reset")
    public void new_customer_input_info_and_reset(String customerId, String accountType, String deposit) {
        account.input_new_account_info(customerId, accountType, deposit);
        account.reset();
    }

    @Then("Account is created")
    public void account_is_created() {
        account.verify_create_new_account();
    }

    @Then("All fields of new account page blank")
    public void all_fields_of_deposit_page_blank(){
        account.verify_all_fields_of_new_account_page_blank();
    }

    @Then("Alert \"$alertText\" is displayed")
    public void verify_alert(String alertText){
        try{
            if(driver.switchTo().alert() != null){
                Alert alert = driver.switchTo().alert();
                Assert.verify(alert.getText().equalsIgnoreCase(alertText));
            }
        }catch(Exception e){}

    }

}
