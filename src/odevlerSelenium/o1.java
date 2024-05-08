package odevlerSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class o1 {
    /*
    Go to the Clarusway URL : https://www.clarusway.com/
    Print the position and size of the page.
    Adjust the position of the page as:
    xCoordinate: 70
    yCoordinate: 70
    Adjust the size of the page as:
    height: 900
    width: 900
    Close the page.
    */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.clarusway.com");

    /*
    driver.manage().window().maximize();
    System.out.println(driver.manage().window().getSize()); //(1552, 928)
     */

        Point position = driver.manage().window().getPosition();
        System.out.println("position = " + position);
        Dimension size=driver.manage().window().getSize();
        System.out.println("size = " + size);
        // Sayfanın konumunu (70, 70) olarak ayarla
        driver.manage().window().setPosition(new Point(70, 70));
        Point yeniPozisyon = driver.manage().window().getPosition();
        System.out.println("Yeni pozisyon = " + yeniPozisyon);

        // Sayfanın boyutunu (900, 900) olarak ayarla
        driver.manage().window().setSize(new Dimension(900, 900));
        Dimension yeniBoyut = driver.manage().window().getSize();
        System.out.println("Yeni boyut = " + yeniBoyut);

        Thread.sleep(3000);
        driver.quit();
    }
}
