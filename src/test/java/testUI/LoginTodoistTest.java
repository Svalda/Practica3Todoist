package testUI;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LoginModalPage;
import pages.MainPage;
import session.Session;

public class LoginTodoistTest {

    LoginModalPage loginModalPage = new LoginModalPage();
    MainPage mainPage = new MainPage();

    @Before
    public void before(){
        Session.getInstance().getDriver().get("https://todoist.com/");

    }

    @DisplayName("verify The Login Using User And Password")
    @Description("This test case is to verify the Login using User And Password")
    @Owner("Faviola Salgado")
    @Test
    public void verifyTheLoginUsingUserAndPassword() throws InterruptedException {
        mainPage.startSessionButton.click();
        loginModalPage.emailTexBox.type("faviola.valda@yahoo.com");
        loginModalPage.passwordTexBox.type("70366758");
        loginModalPage.inicieSesionButton.click();

        //Verification
        Thread.sleep(2000);

        Assert.assertFalse("ERROR, nose puedo realizar el login",loginModalPage.inicieSesionButton.isDisplayedOnPage());



    }

    @After
    public void after(){
        Session.getInstance().closeBrowser();

    }
}
