package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginMail {

    @FindBy(xpath = "//a[2]")
    private WebElement buttonSignIn;

    @FindBy(xpath = "//*[@id='passp-field-login']")
    private WebElement fieldLogin;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//*[@id='passp-field-passwd']")
    private WebElement fieldPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonPassword;

    public WebDriver driver;
    public LoginMail(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickSignIn() {
        buttonSignIn.click();
    }

    public void inputLogin(String login) {
        fieldLogin.sendKeys(login);
    }

    public void clickLogin() {
        buttonLogin.click();
    }

    public void inputPassword(String password) {
        fieldPassword.sendKeys(password);
    }

    public void clickPassword() {
        buttonPassword.click();
    }
}
