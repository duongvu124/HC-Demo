package net.serenitybdd.demos.todos.steps;

import net.serenitybdd.demos.todos.pages.GuruHomePage;
import net.serenitybdd.demos.todos.pages.NewCustomerPage;
import net.thucydides.core.annotations.Step;

/**
 * Created by vuthaiduong on 8/13/17.
 */
public class NewCustomerSteps {

    NewCustomerPage newCustomerPage;
    GuruHomePage guruHomePage;

    @Step
    public void open_new_customer_page(){
        guruHomePage.clickOnItemNewCustomer();
    }

    @Step
    public void input_new_customer_info(String name, String gender, String dob, String address, String citi,
                                        String state, String pin, String mobile, String email, String pass){
        newCustomerPage.inputName(name)
                       .selectGender(gender)
                       .inputDOB(dob)
                       .inputAddress(address)
                       .inputCity(citi)
                       .inputState(state)
                       .inputPin(pin)
                       .inputPhoneNumber(mobile)
                       .inputEmail(email)
                       .inputPassword(pass);
    }

    @Step
    public void submit(){ newCustomerPage.clickOnBtnSubmit(); }

    @Step
    public void reset(){ newCustomerPage.clickOnBtnReset(); }

    @Step
    public void verify_all_fields_of_new_account_page_blank(){
        newCustomerPage.verifyAllFieldsBlank();
    }

    @Step
    public void verify_create_new_customer(){
        newCustomerPage.verifyCreateNewCustomer();
    }

}
