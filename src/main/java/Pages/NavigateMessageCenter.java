package Pages;

import BasePage.Basepages;
import org.openqa.selenium.By;

import java.io.IOException;

public class NavigateMessageCenter extends Basepages {

    public NavigateMessageCenter() throws IOException {
    }

    public void ClickOnMC() throws InterruptedException {

        sendKeys("username","Entrata_6425");
        sendKeys("password","Xento123");
        submit("submit");

        Thread.sleep(1000);
        click("Tools");
       driver.findElement(By.xpath("//*[@id=\"sub-navigation\"]/ul/li[2]/a")).click();
    }
}

