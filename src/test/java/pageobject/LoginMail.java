package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginMail {

    public WebDriver driver;
    public LoginMail(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id='passp-field-login']")
    private WebElement fieldLogin;

    public void inputLogin(String login) {
        fieldLogin.sendKeys(login);
    }

    @FindBy(xpath = "//button[contains(.,'Войти')]")
    private WebElement buttonLogin;

    public void clickLogin() {
        buttonLogin.click();
    }

    @FindBy(xpath = "//*[@id='passp-field-passwd']")
    private WebElement fieldPassword;

    public void inputPassword(String password) {
        fieldPassword.sendKeys(password);
    }

    @FindBy(xpath = "//button[contains(.,'Войти')]")
    private WebElement buttonPassword;

    public void clickPassword() {
        buttonPassword.click();
    }



}
