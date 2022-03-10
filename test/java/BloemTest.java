package java;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

        import static org.junit.Assert.assertEquals;

public class BloemTest {
    @Test
    public void test_vind_bloem() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/");

        WebElement startLink = driver.findElement(By.linkText("Click here to find a Flower"));
        startLink.click();

        WebElement bloemNaam = driver.findElement(By.id("fname"));
        bloemNaam.clear();
        bloemNaam.sendKeys("");

        WebElement bloemKleur = driver.findElement(By.id("fcolor"));
        bloemKleur.clear();
        bloemKleur.sendKeys("");


        WebElement aantalBloemen = driver.findElement(By.id("flower"));
        aantalBloemen.clear();
        aantalBloemen.sendKeys("");

        WebElement bloemButton = driver.findElement(By.id("verzend"));
        bloemButton.click();

        String bloemenGegeven = driver.findElement(By.id("overzicht")).getText();
        assertEquals("Gegevens: ",bloemenGegeven);
    }
}
