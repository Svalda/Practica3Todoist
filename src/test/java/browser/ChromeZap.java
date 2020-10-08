package browser;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ChromeZap implements IBrowser{
    @Override
    public WebDriver create() {

        String driverPath = "C:\\Users\\Faviola\\Desktop\\UCBPractica3Faviola\\PracticVulnerabilityTodoist\\src\\test\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        //Informacion para levantar apuntando a un Puerto

        Map<String,Object> prefs = new HashMap<String,Object>();
        prefs.put("credential_enable_service",false);

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("127.0.0.1:8889");
        proxy.setSslProxy("127.0.0.1:8889");

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("proxy",proxy);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("ignore-certificate-errors");
        options.setExperimentalOption("prefs",prefs);

        capabilities.setCapability(ChromeOptions.CAPABILITY,options);
        ChromeDriver driver = new ChromeDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
}
