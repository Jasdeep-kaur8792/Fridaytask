package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory
{

        WebDriver driver;
    private Url Url;
        public PageFactory(WebDriver driver)
        {
            this.driver= driver;
        }

    public Url getUrl()
    {
        if(Url==null)
        {
            Url =new Url(driver);
        }
        return Url;
    }

    }


