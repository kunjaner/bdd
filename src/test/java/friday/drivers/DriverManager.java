package friday.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverManager {

  public static WebDriver driver;
    private String browser="firefox";

    public DriverManager(){
        PageFactory.initElements(driver,this);
    }

    public void openBrowser(){
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "ie": WebDriverManager.iedriver().setup();
                driver=new InternetExplorerDriver();
                break;
             default: WebDriverManager.firefoxdriver().setup();
             driver=new FirefoxDriver();

        }
    }
    public void navigateTo(String url){
        driver.get(url);
    }
    public void maximizeBrowser(){
        driver.manage().window().maximize();
    }
    public void applyImplWait(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void handleCookies(){
        driver.findElement(By.linkText("GOT IT")).click();
    }
    public void sleep(int ms){
       try{Thread.sleep(ms); }
       catch (InterruptedException e){
       e.printStackTrace();}
    }
    public void closeBrowser(){
        driver.quit();
    }

public WebElement waitUntilElementClickable(WebElement element){
   return new WebDriverWait (driver,15).until(ExpectedConditions.elementToBeClickable (element));}

   public boolean waitUntilElementInvisible(By by){
       return new WebDriverWait (driver,15).until(ExpectedConditions.invisibilityOfElementLocated (by));

   }


}
