package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mail {

    public WebDriver driver;
    public Mail(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input")
    private WebElement fieldSearch;

    public void inputSearch(String search) {
        fieldSearch.sendKeys(search);
    }

    @FindBy(xpath = "//*[@id='nb-1']/body/div[2]/div[7]/div/div[3]/div[3]/div[2]/div[5]/div[1]/div/div/div[2]/div/div[1]/div/span/span")
    private WebElement countMessage;

    public String getCountMessage() {
        return countMessage.getText();
    }

    @FindBy(xpath = "//*[@id='nb-1']/body/div[2]/div[7]/div/div[3]/div[2]/div[2]/div/div/a")
    private WebElement buttonSend;

    public void clickButtonSend() {
        buttonSend.click();
    }

    @FindBy(xpath = "//*[@id='nb-1']/body/div[2]/div[10]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div/div/div/div/div")
    private WebElement fieldGetter;

    public void inputGetter(String getter) {
        fieldGetter.sendKeys(getter);
    }

    @FindBy(xpath = "//*[@id='nb-1']/body/div[2]/div[10]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/div/div[1]/div[1]/div[3]/div/div/input")
    private WebElement fieldTopic;

    public void inputTopic(String topic) {
        fieldTopic.sendKeys(topic);
    }

    @FindBy(xpath = "//*[@id=\"cke_1_contents\"]/div")
    private WebElement fieldText;

    public void inputText(String text) {
        fieldText.sendKeys(text);
    }

    @FindBy(xpath = "//*[@id=\"nb-1\"]/body/div[2]/div[10]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div[2]/div/div[1]/div[1]/button")
    private WebElement buttonSendMessage;

    public void clickButtonSendMessage() {
        buttonSendMessage.click();
    }

}
