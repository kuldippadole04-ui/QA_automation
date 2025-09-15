package Base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basetest {

    public static WebDriver driver;
    public static Properties pr = new Properties();
    public static FileReader fr;

    @BeforeTest
    public void setup() throws IOException {
        if (driver == null) {
            fr = new FileReader(System.getProperty("user.dir")+ "\\src\\test\\resources\\configfiles\\config.properties");
            pr.load(fr);

        
            
            if (pr.getProperty("browser").equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();  // ⚡ Assign to global driver (remove local redeclaration)
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

                driver.get(pr.getProperty("testurl"));
            }
        }
    }

    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
            driver = null;  // So next test run can re-initialize cleanly
        }
    }
}
