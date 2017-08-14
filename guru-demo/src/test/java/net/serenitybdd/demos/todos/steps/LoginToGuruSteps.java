package net.serenitybdd.demos.todos.steps;

import net.serenitybdd.demos.todos.pages.GuruHomePage;
import net.thucydides.core.annotations.Step;

/**
 * Created by vuthaiduong on 8/13/17.
 */
public class LoginToGuruSteps {
    GuruHomePage guruHomePage;

    @Step
    public void open_guru99_home_page(){
        guruHomePage.open();
    }

    @Step
    public void login_to_guru99(String userId, String password){
        guruHomePage.inputUserId(userId)
                    .inputPassword(password)
                    .clickOnLoginButton();
    }

    @Step
    public void verify_user_login_successfully(){
        guruHomePage.verifyUserLoginSuccessfully();
    }
}
