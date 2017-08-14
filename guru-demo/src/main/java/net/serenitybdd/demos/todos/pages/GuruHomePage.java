package net.serenitybdd.demos.todos.pages;

import jxl.common.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by vuthaiduong on 8/13/17.
 */
@DefaultUrl("http://demo.guru99.com/v4/")
public class GuruHomePage extends PageObject{

    @FindBy(xpath = "//input[(@type='text') and (@name='uid')]")
    private WebElement tbUserId;

    @FindBy(xpath = "//input[(@type='password') and (@name='password')]")
    private WebElement tbPassword;

    @FindBy(xpath = "//input[(@type='submit') and (@name='btnLogin')]")
    private WebElement btnLogin;

    @FindBy(xpath = "//input[(@type='reset') and (@name='btnReset')]")
    private WebElement btnReset;

    @FindBy(xpath = "//td[contains(text(),'Manger Id :')]")
    private WebElement txtMangerId;

    @FindBy(xpath = "//*[@href='addcustomerpage.php']")
    private WebElement itemAddCustomer;

    @FindBy(xpath = "//*[@href='addAccount.php']")
    private WebElement itemAddAccount;

    @FindBy(xpath = "//*[@href='DepositInput.php']")
    private WebElement itemDeposit;


    public GuruHomePage inputUserId(String userId){
        tbUserId.sendKeys(userId);
        return this;
    }

    public GuruHomePage inputPassword(String password){
        tbPassword.sendKeys(password);
        return this;
    }

    public GuruHomePage clickOnLoginButton(){
        btnLogin.click();
        return this;
    }

    public void clickOnItemNewCustomer(){
        itemAddCustomer.click();
    }

    public void clickOnItemNewAccount(){
        itemAddAccount.click();
    }

    public void clickOnItemDeposit(){
        itemDeposit.click();
    }

    public void verifyUserLoginSuccessfully(){
        Assert.verify(txtMangerId.isDisplayed());
    }

}
