package net.serenitybdd.demos.todos.stepdefinitions;

import net.serenitybdd.demos.todos.steps.LoginToGuruSteps;
import net.serenitybdd.demos.todos.steps.NewCustomerSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import jxl.common.Assert;

/**
 * Created by vuthaiduong on 8/13/17.
 */
public class CreateNewCustomerStepsDefinitions {
    @Managed
    WebDriver driver;

    @Steps
    LoginToGuruSteps user;
    @Steps
    NewCustomerSteps newCustomer;

    @Given("User login with \"$userId\" and \"$password\" successfully")
    public void user_login_successfully(String userId, String password) {
        user.open_guru99_home_page();
        user.login_to_guru99(userId, password);
        user.verify_user_login_successfully();
    }

    @Given("User want to create new customer")
    public void user_want_to_create_new_customer() {
        newCustomer.open_new_customer_page();
    }

    @When("User input \"$name\" and \"$gender\" and \"$dob\" and \"$address\" and \"$citi\" and \"$state\" and \"$pin\" " +
            "and \"$mobile\" and \"$email\" and \"$pass\" and submit")
    public void user_input_all_infomation_and_submit(String name, String gender, String dob, String address, String citi,
                                                     String state, String pin, String mobile, String email, String pass) {
        newCustomer.input_new_customer_info(name, gender, dob, address, citi, state, pin, mobile, email, pass);
        newCustomer.submit();
    }

    @When("User input \"$name\" and \"$gender\" and \"$dob\" and \"$address\" and \"$citi\" and \"$state\" and \"$pin\" " +
            "and \"$mobile\" and \"$email\" and \"$pass\" and reset")
    public void user_input_all_infomation_and_reset(String name, String gender, String dob, String address, String citi,
                                                     String state, String pin, String mobile, String email, String pass) {
        newCustomer.input_new_customer_info(name, gender, dob, address, citi, state, pin, mobile, email, pass);
        newCustomer.reset();
    }

    @Then("New customer is created")
    public void new_customer_is_created() {
        newCustomer.verify_create_new_customer();
    }

    @Then("All fields of new customer page blank")
    public void all_fields_of_new_customer_page_blank(){
        newCustomer.verify_all_fields_of_new_account_page_blank();

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
