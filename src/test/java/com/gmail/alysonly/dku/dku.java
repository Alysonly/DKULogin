package com.gmail.alysonly.dku;


import com.gmail.alysonly.Login.Login;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class dku {

    public static WebDriver driver;
    public static Login login;

    @BeforeClass
    public static void setup()
    {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        login = new Login(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://cabinet.nsd.ru/dcs-web2/pages/wr/login/login.xhtml");
    }

    @Test
    public void dku()
    {
        login.inputUserName("friend");
        login.inputPass("Reg1str@tor!");
        login.Buttonclick();
    }

    @AfterClass
    public static void quit() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        driver.quit();
    }
}
