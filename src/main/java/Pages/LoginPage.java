package Pages;

import BasePage.Basepages;
import org.openqa.selenium.By;

import java.io.IOException;

public class LoginPage extends Basepages {


    public LoginPage() throws IOException {
    }

    public void LoginEntrata() throws InterruptedException {

        //User name
       //  driver.findElement(By.id("company_user[username]")).sendKeys("Entrata_6425");
        // driver.findElement(By.id(prop.getProperty("username"))).sendKeys("Entrata_6425");
        sendKeys("username","Entrata_6425");

     //  sendKeys("username","Entrata_6425");



        //password
        //driver.findElement(By.id("company_user[password]")).sendKeys("Xento123");
            //driver.findElement(By.id(prop.getProperty("password"))).sendKeys("Xento123");
        sendKeys("password","Xento123");

        //Login
       // driver.findElement(By.name(prop.getProperty("submit"))).submit();
        //driver.findElement(By.name("Login")).submit();
        submit("submit");



    }

}
