package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how=How.LINK_TEXT, using="Contact us")
    public static WebElement contact_us;

    @FindBy(how=How.LINK_TEXT, using="Sign in")
    public static WebElement sign_in;

    @FindBy(how=How.NAME, using="search_query")
    public static WebElement SearchBox;

    @FindBy(how=How.NAME, using="submit-search")
    public static WebElement searchIcon;

    @FindBy(how=How.XPATH, using="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    public static WebElement cart;

    public void click_contact_us() {
        contact_us.click();
    }

        public static void click_sign_in(){
            sign_in.click();


    }

}
