package TestCases;
import Pages.LoginPage;
import Pages.NavigateMessageCenter;
import org.junit.AfterClass;
import org.junit.Test;

import java.io.IOException;

public class NavigateToMessageCenterTab
{
    public NavigateToMessageCenterTab() throws IOException {
    }

    @Test
        public  void Navigate() throws IOException, InterruptedException {
         NavigateMessageCenter mc= new NavigateMessageCenter();
        mc.ClickOnMC();

        System.out.println("Inside NavigateToMessageCenterTab");
    }

}
