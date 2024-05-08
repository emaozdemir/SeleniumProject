import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigationCommands {
    /*
     Invoke Chrome Browser
     Navigate to URL:https://clarusway.com/
     Navigate to URL: http://google.com/
     Come back to the Clarusway using the back command.
     Again go back to the Google website using forward command
     Refresh the Browser using refresh command.
     Close the Browser.
  */
    public static void main(String[] args) throws InterruptedException {

//        Invoke Chrome Browser
        WebDriver driver = new ChromeDriver();

//        Navigate to URL:https://clarusway.com/
        driver.get("https://clarusway.com/");

//        Navigate to URL: http://google.com/
        driver.navigate().to("http://google.com/");//Bu yöntem, mevcut tarayıcı penceresine yeni bir web sayfası yükler. get() komutu ile aynıdır.
        Thread.sleep(3000);//sleep() methodu Java'nın çalımasını parantez içinde belirtilen milisaniye kadar bekletir. Buna Java wait yada Hard wait denir.

//        Come back to the Clarusway using the back command.
        driver.navigate().back();//back() methodu önceki sayfaya döner.
        Thread.sleep(3000);

//        Again go back to the Google website using forward command
        driver.navigate().forward();//Bu yöntem, web tarayıcısının mevcut tarayıcı penceresindeki ileri düğmesine tıklamasını sağlar.
        Thread.sleep(3000);

//        Refresh the Browser using refresh command.
        driver.navigate().refresh();
        Thread.sleep(3000);

//        Close the Browser.
        driver.quit();

    }
}