import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Comfy {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\taras.skobalo\\IdeaProjects\\Comfy\\src\\main\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://comfy.ua/");
        driver.quit();
    }
}
