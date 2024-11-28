import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.LoginPage;

import java.time.Duration;

public class UiTest extends UiAbstractTest{
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static String urlBase = "https://gb.ru/login";

    @BeforeEach
    void openWin() {
        driver = new ChromeDriver(getOptions());
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    @Test
    void testGBNotEmailLogin() {
        driver.get(urlBase);
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.login("login", "password");
        String textError = loginPage.getTextLogin();
        Assertions.assertFalse(textError.isEmpty());
    }

    @Test
    void testGBWithoutPassword() {
        driver.get(urlBase);
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.login("login@login.ru", "");
        String textError = loginPage.getTextPassword();
        Assertions.assertFalse(textError.isEmpty());
    }

    @AfterEach
    public void teardown(){
        driver.quit();
    }
}