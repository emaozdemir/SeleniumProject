import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_BrowserCommands {
    /*
            →Create main method
            →Set Path
            →Create chrome driver
            →Open google home page:https://www.google.com
            →Get Title on page
            →Get Current URLon page
            →Close/Quit the browser
            SHİFT+TAB istediğimiz yere
            */
    public static void main(String[] args) {
        //set Property
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");//bu işlem selenium 4.6 sonrasi gerekmez.

        //→Create chrome driver
        WebDriver driver = new ChromeDriver();

        // →Open google home page:https://www.google.com
        // driver.get("https://www.google.com");
        driver.get("https://www.clarusway.com");

        //→Get Title on page
        String title = driver.getTitle();
        System.out.println("title = " + title);

        //→Get Current URLon page
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);

        //→Close/Quit the browser
        driver.quit();


    }
}
