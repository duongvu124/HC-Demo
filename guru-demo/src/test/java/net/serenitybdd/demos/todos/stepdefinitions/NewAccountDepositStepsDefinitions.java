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
public class NewAccountDepositStepsDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    LoginToGuruSteps user;
    @Steps
    NewAccountSteps account;

    @Given("User login with \"$userId\" and \"$password\" successfully")
    public void user_login_successfully(String userId, String password){
        user.open_guru99_home_page();
        user.login_to_guru99(userId, password);
        user.verify_user_login_successfully();
    }

    @Given("New account want to deposit")
    public void new_customer_want_to_deposit(){
        account.open_deposit_page();
    }

    @When("New account input \"$accountNo\" and \"$amount\" and \"$description\" and submit")
    public void account_input_info_and_submit(String accountNo, String amount, String description) throws InterruptedException {
        account.input_deposit_info(accountNo, amount, description);
        account.click_on_submit_button();
    }

    @When("New account input \"$accountNo\" and \"$amount\" and \"$description\" and reset")
    public void account_input_info_and_reset(String accountNo, String amount, String description) throws InterruptedException {
        account.input_deposit_info(accountNo, amount, description);
        account.click_on_reset_button();
    }

    @Then("New account has deposited")
    public void account_has_deposited(){
        account.verify_create_deposit_transaction();
    }

    @Then("All fields of deposit page blank")
    public void all_fields_of_deposit_page_blank(){
        account.verify_all_fields_of_deposit_page_blank();
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
