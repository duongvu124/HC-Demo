package net.serenitybdd.demos.todos.steps;

import net.serenitybdd.demos.todos.pages.DepositPage;
import net.serenitybdd.demos.todos.pages.GuruHomePage;
import net.serenitybdd.demos.todos.pages.NewAccountPage;
import net.thucydides.core.annotations.Step;

/**
 * Created by vuthaiduong on 8/13/17.
 */
public class NewAccountSteps {

    NewAccountPage newAccountPage;
    GuruHomePage guruHomePage;
    DepositPage depositPage;

    @Step
    public void open_new_account_page(){
        guruHomePage.clickOnItemNewAccount();
    }

    @Step
    public void input_new_account_info(String customerId, String accountType, String deposit){
        newAccountPage.inputCustomerId(customerId)
                      .selectAccountType(accountType)
                      .inputDeposit(deposit);
    }

    @Step
    public void submit(){ newAccountPage.clickOnBtnSubmit(); }

    @Step
    public void reset(){ newAccountPage.clickOnBtnReset(); }

    @Step
    public void verify_create_new_account(){
        newAccountPage.verifyCreateNewAccount();
    }

    @Step
    public void open_deposit_page(){
        guruHomePage.clickOnItemDeposit();
    }

    @Step
    public void input_deposit_info(String accountNo, String amount, String description){
        depositPage.inputAccountNo(accountNo)
                   .inputAmount(amount)
                   .inputDescription(description);
    }

    @Step
    public void click_on_submit_button(){ depositPage.clickOnBtnSubmit(); }

    @Step
    public void click_on_reset_button(){ depositPage.clickOnBtnReset(); }

    @Step
    public void verify_all_fields_of_deposit_page_blank(){
        depositPage.isAllFieldsBlank();
    }

    @Step
    public void verify_all_fields_of_new_account_page_blank(){
        newAccountPage.verifyAllFieldsBlank();
    }

    @Step
    public void verify_create_deposit_transaction(){
        depositPage.verifyDepositTransaction();
    }
}
