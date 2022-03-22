package BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Basepages {

    public WebDriver driver;
    public Properties prop;


    public Basepages() throws IOException {//constructor created so that every time child class is called the constrouctor will get execute 1st
        FileInputStream ip = new FileInputStream("C:\\Users\\ppakhale\\IdeaProjects\\MyMavenProj\\src\\main\\java\\Config\\config.properties");
        prop = new Properties();
        prop.load(ip);

        if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\Drivers\\chromedriver.exe"); //"D:\\chromedriver\\ChromeDriver 98.0.4758.80\\chromedriver_win32_98\\chromedriver.exe");//location of chrome driver
            driver = new ChromeDriver();//Instance of chrome driver
        } else {
            System.out.println("Driver not available");
        }
        //Use chrome driver from the Driver packages

        driver.get("https://demoold.stage.entratadev.com/");
        driver.manage().window().maximize();
        //Thread.sleep(1000);

    }
        public void sendKeys(String xpathkey, String text)//overloading of the actual sendkeys of selenium
        {
            driver.findElement(By.id(prop.getProperty(xpathkey))).sendKeys(text);
        }



        public void click(String xpath)
        {
            driver.findElement(By.id(prop.getProperty(xpath))).click();
        }


        public void submit(String xpath)//overloading of the actual click of selenium
        {
            driver.findElement(By.name(prop.getProperty(xpath))).submit();
        }

}