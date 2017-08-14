package net.serenitybdd.demos.todos.pages;

import jxl.common.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by vuthaiduong on 8/13/17.
 */

@DefaultUrl("http://demo.guru99.com/v4/manager/addcustomerpage.php")
public class NewCustomerPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//*[(@type='text') and (@name='name')]")
    private WebElement tbName;

    @FindBy(how = How.XPATH, using = "//input[(@type='radio') and (@name='rad1') and (@value='f')]")
    private WebElement radFemale;

    @FindBy(how = How.XPATH, using = "//input[(@type='radio') and (@name='rad1') and (@value='m')]")
    private WebElement radMale;

    @FindBy(how = How.ID, using = "dob")
    private WebElement tbDOB;

    @FindBy(how = How.XPATH, using = "//textarea[@name='addr']")
    private WebElement tbAddress;

    @FindBy(how = How.XPATH, using = "//input[(@type='text') and (@name='city')]")
    private WebElement tbCity;

    @FindBy(how = How.XPATH, using = "//input[@name='state']")
    private WebElement tbState;

    @FindBy(how = How.XPATH, using = "//input[@name='pinno']")
    private WebElement tbPin;

    @FindBy(how = How.XPATH, using = "//input[@name='telephoneno']")
    private WebElement tbPhoneNumber;

    @FindBy(how = How.XPATH, using = "//input[@name='emailid']")
    private WebElement tbEmail;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    private WebElement tbPassword;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    private WebElement btnSubmit;

    @FindBy(how = How.XPATH, using = "//input[@type='reset']")
    private WebElement btnReset;

    @FindBy(how = How.XPATH, using = "//*[text()='Customer Registered Successfully!!!']")
    private WebElement txtCreateNewCustomerSuccess;


    public NewCustomerPage inputName(String name){
        tbName.sendKeys(name);
        return this;
    }

    public NewCustomerPage selectGender(String gender){
        if(gender.equalsIgnoreCase("male")){
            radMale.click();
        } else {
            radFemale.click();
        }
        return this;
    }

    public NewCustomerPage inputDOB(String dob){
        tbDOB.sendKeys(dob);
        return this;
    }

    public NewCustomerPage inputAddress(String address){
        tbAddress.sendKeys(address);
        return this;
    }

    public NewCustomerPage inputCity(String city){
        tbCity.sendKeys(city);
        return this;
    }

    public NewCustomerPage inputState(String state){
        tbState.sendKeys(state);
        return this;
    }

    public NewCustomerPage inputPin(String pin){
        tbPin.sendKeys(pin);
        return this;
    }

    public NewCustomerPage inputPhoneNumber(String phone){
        tbPhoneNumber.sendKeys(phone);
        return this;
    }

    public NewCustomerPage inputEmail(String email){
        tbEmail.sendKeys(email);
        return this;
    }

    public NewCustomerPage inputPassword(String password){
        tbPassword.sendKeys(password);
        return this;
    }

    public NewCustomerPage clickOnBtnSubmit(){
        btnSubmit.click();
        return this;
    }

    public NewCustomerPage clickOnBtnReset(){
        btnReset.click();
        return this;
    }

    public void verifyCreateNewCustomer(){
        Assert.verify(txtCreateNewCustomerSuccess.isDisplayed());
    }

    public void verifyAllFieldsBlank(){
        if(tbName.getText().equals("") && tbAddress.getText().equals("") && tbCity.getText().equals("")
                && tbState.getText().equals("") && tbPin.getText().equals("") && tbPhoneNumber.getText().equals("")
                && tbEmail.getText().equals("") && tbPassword.getText().equals("") && radMale.isSelected()){
            Assert.verify(true);
        } else {
            Assert.verify(false);
        }
    }

}
