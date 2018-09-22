package getHelpPageObjects;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetHelpHerePage extends CommonAPI {
    @FindBy(id = "robot-input")
    public static WebElement messageInputBox;
    @FindBy(className = "robot-answer")
    public static WebElement reply;
    @FindBy (css = ".btn-submit")
    public static WebElement sendButton;

    //Verify user can Write message in message input box
    public void sendTextToAnna() {
        messageInputBox.sendKeys("How are you Anna?");
         sendButton.click();
          String replyText = reply.getText();
        System.out.println("Reply :" + replyText);
    }
}