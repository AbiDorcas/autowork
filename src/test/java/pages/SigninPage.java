package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SigninPage {

    @FindBy(how= How.ID, using="email")
    public static WebElement MyEmail;

    @FindBy(how=How.ID, using="password")
    public static WebElement MyPassword;

    @FindBy(how=How.LINK_TEXT, using="Forgot your password?")
    public static WebElement ForgotPassword;

    @FindBy(how=How.ID, using="SubmitLogin")
    public static WebElement LoginBTN;

    @FindBy(how=How.CSS, using="ol > li")
    public static WebElement login_error_message;

    public void enter_email_address(String email){
        MyEmail.sendKeys( email );
    }

    public void enter_password(){
        MyPassword.sendKeys( );

    }
        public void click_login_button (){
        LoginBTN.click();
        }

        public void i_see_login_error_message(String user){
            Assert.assertEquals(user, login_error_message.getText());
        }
}
