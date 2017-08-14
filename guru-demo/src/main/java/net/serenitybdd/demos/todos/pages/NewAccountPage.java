package net.serenitybdd.demos.todos.pages;

import jxl.common.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by vuthaiduong on 8/13/17.
 */
public class NewAccountPage extends PageObject{

    @FindBy(how = How.XPATH, using = "//input[@name='cusid']")
    private WebElement tbCustomerId;

    @FindBy(how = How.XPATH, using = "//select[@name='selaccount']")
    private WebElement drAccountType;

    @FindBy(how = How.XPATH, using = "//input[@name='inideposit']")
    private WebElement tbDeposit;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    private WebElement btnSubmit;

    @FindBy(how = How.XPATH, using = "//input[@type='reset']")
    private WebElement btnReset;

    @FindBy(how = How.XPATH, using = "//p[text()='Account Generated Successfully!!!']")
    private WebElement txtCreateNewAccountSuccess;

    public NewAccountPage inputCustomerId(String id){
        tbCustomerId.sendKeys(id);
        return this;
    }

    public NewAccountPage selectAccountType(String type){
        Select dropDownSelecter = new Select(drAccountType);
        dropDownSelecter.selectByVisibleText(type);
        return this;
    }

    public NewAccountPage inputDeposit(String number){
        tbDeposit.sendKeys(number);
        return this;
    }

    public NewAccountPage clickOnBtnSubmit(){
        btnSubmit.click();
        return this;
    }

    public NewAccountPage clickOnBtnReset(){
        btnReset.click();
        return this;
    }

    public void verifyAllFieldsBlank(){
        if(tbCustomerId.getText().equals("") && tbDeposit.getText().equals("")){
            Select dropDownSelecter = new Select(drAccountType);
            if(dropDownSelecter.getFirstSelectedOption().getText().equalsIgnoreCase("Savings")) {
                Assert.verify(true);
            }
        } else {
            Assert.verify(false);
        }
    }

    public void verifyCreateNewAccount(){
        Assert.verify(txtCreateNewAccountSuccess.isDisplayed());
    }
}
