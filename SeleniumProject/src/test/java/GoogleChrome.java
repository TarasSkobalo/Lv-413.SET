import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleChrome {
    private ChromeDriver driver;
    private JavascriptExecutor executor;

    @BeforeTest
    public void preCondition() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\taras.skobalo\\IdeaProjects\\SeleniumProject\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://comfy.ua/ua/");
    }

    @Test
    public void firstTest() throws InterruptedException {
        executor = driver;
//      Opens the window to the full screen
        driver.manage().window().maximize();
//      Search field
        driver.findElement(By.xpath("//*[@id=\"searchTop\"]")).sendKeys("Apple AirPods");
//      Test of "search field"
        String search = driver.findElement(By.xpath("//*[@id=\"searchTop\"]")).getAttribute("value");
        Assert.assertEquals(search, "Apple AirPods");

//      Search button
        driver.findElement(By.xpath("//*[@id=\"searchButtonTop\"]")).click();
        Thread.sleep(1000);
//      Buy button
        driver.findElement(By.xpath("//span[@data-gtm=\"Conversions-click-buyButton\"]"));
        executor.executeScript("scroll(0,205);");
//      Selecting Apple AirPods
        driver.findElement(By.xpath("//a[@href=\"https://comfy.ua/ua/naushniki-vkladyshi-besprovodnye-apple-airpods-2-2018.html\"]")).click();
        executor.executeScript("scroll(0,80);");
        Thread.sleep(500);
//      Select 2-nd AirPods's image
        driver.findElement(By.xpath("//*[@id=\"sideGalleryList\"]/div/div/li[2]/a/img")).click();
        Thread.sleep(500);
//      Select 3-rd AirPods's image
        driver.findElement(By.xpath("//*[@id=\"sideGalleryList\"]/div/div/li[3]/a/img")).click();
        Thread.sleep(3500);
//      Clicking on the button "buy" the selected item
        driver.findElement(By.xpath("//*[@id=\"productCard\"]/div/div[2]/div[3]/div[3]/a[1]")).click();
        Thread.sleep(4000);
//      Pressing the "product order" button
        driver.findElement(By.xpath("//span[@data-gtm=\"Interactions-click-checkout\"]")).click();
        Thread.sleep(3000);
//      Selecting of city
        driver.findElement(By.xpath("//*[@id=\"checkoutContent\"]/div[1]/div[2]/ul/li[9]/a")).click();
        Thread.sleep(5000);
//      choice of delivery method
        driver.findElement(By.xpath("//div[@class=\"shipping-methods-item__icon  icon-NewPost\"]")).click();
        executor.executeScript("scroll(0,100);");
        Thread.sleep(2500);
//      Entering a phone number
        driver.findElement(By.xpath("//*[@id=\"shippingPhone\"]")).sendKeys("0960000001");
//      Entering a name
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Taras");
        String firstname = driver.findElement(By.xpath("//*[@id=\"firstname\"]")).getAttribute("value");
        Assert.assertEquals(firstname, "Taras");
//      Entering a surname
        driver.findElement(By.xpath("//*[@id=\"surname\"]")).sendKeys("Skobalo");
        String surname = driver.findElement(By.xpath("//*[@id=\"surname\"]")).getAttribute("value");
        Assert.assertEquals(surname, "Skobalo");
//      Entering a middle name
        driver.findElement(By.xpath("//*[@id=\"middlename\"]")).sendKeys("Olegovich");
        String middlename = driver.findElement(By.xpath("//*[@id=\"middlename\"]")).getAttribute("value");
        Assert.assertEquals(middlename, "Olegovich");
//      Entering an email
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("taras.skobalo@gmail.com");
        String email = driver.findElement(By.xpath("//*[@id=\"email\"]")).getAttribute("value");
        Assert.assertEquals(email, "taras.skobalo@gmail.com");
        executor.executeScript("scroll(0,1000);");
        Thread.sleep(3000);
//      Choice of payment method
        driver.findElement(By.xpath("//label[@class=\"label payment-method payment-method_liqpay \"]")).click();
        Thread.sleep(3000);
//      Open comment window
        driver.findElement(By.xpath("//a[@href=\"#\"][@class=\"link js-comment-toggle\"]")).click();
        Thread.sleep(1500);
//      Typing text in comment window
        driver.findElement(By.xpath("//textarea[@class=\"form__textarea\"]")).sendKeys("PLS...Add to my order white case for AirPods");
    }

    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(1500);
        driver.close();
    }
}
