package net.serenitybdd.demos.todos.pages;

import jxl.common.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by vuthaiduong on 8/13/17.
 */
public class DepositPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//input[@name='accountno']")
    private WebElement tbAccountNo;

    @FindBy(how = How.XPATH, using = "//input[@name='ammount']")
    private WebElement tbAmount;

    @FindBy(how = How.XPATH, using = "//input[@name='desc']")
    private WebElement tbDescription;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    private WebElement btnSubmit;

    @FindBy(how = How.XPATH, using = "//input[@type='reset']")
    private WebElement btnReset;

    @FindBy(how = How.XPATH, using = "//p[text()='Transaction details of Deposit for Account 31552']")
    private WebElement txtDepositSuccess;


    public DepositPage inputAccountNo(String account){
        tbAccountNo.sendKeys(account);
        return this;
    }

    public DepositPage inputAmount(String amount){
        tbAmount.sendKeys(amount);
        return this;
    }

    public DepositPage inputDescription(String des){
        tbDescription.sendKeys(des);
        return this;
    }

    public DepositPage clickOnBtnSubmit(){
        btnSubmit.click();
        return this;
    }

    public DepositPage clickOnBtnReset(){
        btnReset.click();
        return this;
    }

    public void verifyDepositTransaction(){
        Assert.verify(txtDepositSuccess.isDisplayed());
    }

    public void isAllFieldsBlank(){
        if(tbAccountNo.getText().equals("") && tbAmount.getText().equals("")){
            Assert.verify(true);
        } else {
            Assert.verify(false);
        }
    }
}
