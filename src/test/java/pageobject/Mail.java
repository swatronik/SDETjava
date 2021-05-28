package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mail {

    @FindBy(xpath = "//input")
    private WebElement fieldSearch;

    @FindBy(xpath = "//*[contains(@class, 'mail-MessagesSearchInfo-Title_misc nb-with-xs-left-gap')]")
    private WebElement countMessage;

    @FindBy(xpath = "//*[contains(@class, 'svgicon svgicon-mail--ComposeButton')]")
    private WebElement buttonSend;

    @FindBy(xpath = "//*[contains(@class, 'composeYabbles')]")
    private WebElement fieldGetter;

    @FindBy(xpath = "//*[contains(@class, 'composeTextField ComposeSubject-TextField')]")
    private WebElement fieldTopic;

    @FindBy(xpath = "//*[contains(@class, 'cke_wysiwyg_div cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr cke_htmlplaceholder')]")
    private WebElement fieldText;

    @FindBy(xpath = "//*[contains(@class, 'control button2 button2_view_default button2_tone_default button2_size_l button2_theme_action button2_pin_circle-circle ComposeControlPanelButton-Button ComposeControlPanelButton-Button_action')]")
    private WebElement buttonSendMessage;

    public WebDriver driver;
    public Mail(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void inputSearch(String search) {
        fieldSearch.sendKeys(search);
    }

    public String getCountMessage() {
        return countMessage.getText();
    }

    public void clickButtonSend() {
        buttonSend.click();
    }

    public void inputGetter(String getter) {
        fieldGetter.sendKeys(getter);
    }

    public void inputTopic(String topic) {
        fieldTopic.sendKeys(topic);
    }

    public void inputText(String text) {
        fieldText.sendKeys(text);
    }

    public void clickButtonSendMessage() {
        buttonSendMessage.click();
    }
}
