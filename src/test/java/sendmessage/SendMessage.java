package sendmessage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageobject.LoginMail;
import pageobject.Mail;
import utils.ConfigProperties;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SendMessage {

    private static WebDriver driver;
    private static LoginMail loginMail;
    private static Mail mail;

    @BeforeClass
    public static void initNode() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setPlatform(Platform.WINDOWS);
        capabilities.setBrowserName("chrome");
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        loginMail = new LoginMail(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @Test
    public void sendMessage() throws InterruptedException {
        String login = ConfigProperties.getProperty("login");
        String password = ConfigProperties.getProperty("password");

        driver.get("https://mail.yandex.ru");

        loginMail.clickSignIn();
        loginMail.inputLogin(login);
        loginMail.clickLogin();
        loginMail.inputPassword(password);
        loginMail.clickPassword();

        mail = new Mail(driver);
        String countMessage;
        try {
            mail.inputSearch("Simbirsoft Тестовое задание папка:Входящие");
            countMessage = mail.getCountMessage();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            mail.inputSearch("Simbirsoft Тестовое задание папка:Входящие");
            countMessage = mail.getCountMessage();
        }
        mail.clickButtonSend();
        mail.inputGetter(login);
        mail.inputTopic("Simbirsoft Тестовое задание " + "Поляков");
        mail.inputText(countMessage);
        mail.clickButtonSendMessage();
        Thread.sleep(2000);
    }

    @AfterClass
    public static void stopTest() {
        driver.quit();
    }
}
