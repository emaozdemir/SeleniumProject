import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01_MyFirstClass {
    /*
 Satırı Yukarı/Aşağı Taşıma: Satırı yukarı veya aşağı taşımak için Ctrl + Shift + Up/Down Arrow kısayolunu kullanabilirsiniz.

Satırı Silme: Satırı silmek için Ctrl + Y kısayolunu kullanabilirsiniz.

Satırları Birleştirme: Birden fazla satırı birleştirmek için Ctrl + Shift + J kısayolunu kullanabilirsiniz.

Satırı Kopyalama: Satırı kopyalamak için Ctrl + D kısayolunu kullanabilirsiniz.

Satırın Sonuna Gitme: Satırın sonuna gitmek için End tuşunu kullanabilirsiniz.

Paragraf Başına/Bitişine Gitme: Paragraf başına veya sonuna gitmek için Ctrl + Up/Down Arrow kısayolunu kullanabilirsiniz.

Kod Biçimlendirme: Kodu otomatik olarak biçimlendirmek için Ctrl + Alt + L kısayolunu kullanabilirsiniz.

Satırı Yorum Satırına Dönüştürme: Satırı yorum satırına dönüştürmek için Ctrl + / kısayolunu kullanabilirsiniz.

Satırı Yorum Satırından Çıkarma: Satırı yorum satırından çıkarmak için Ctrl + / kısayolunu tekrar kullanabilirsiniz.

Satırı Büyütme/Küçültme: Satırı büyütmek veya küçültmek için Ctrl + + veya Ctrl + - kısayolunu kullanabilirsiniz.
     */
    public static void main(String[] args) {
        //set Property
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");//bu işlem selenium 4.6 sonrasi gerekmez.

        //driver objesi olustur
        // WebDriver driver = new ChromeDriver();//polimorfizme örnek
        ChromeDriver driver = new ChromeDriver();//polimorfizme örnek
        // driver=new EdgeDriver();

        //driver methodlarını kullan.
        driver.get("https://google.com");//get() methodu ile yeni bir sayfa yükleriz

        //close browser
        driver.close();//close() meth ile son acılan pencere kapatılır.

        //quit
        driver.quit();//quit() meth ile oturumda acılan tüm pencereler kapatılır


    }
}
