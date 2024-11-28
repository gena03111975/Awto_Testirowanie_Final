package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private  final WebDriverWait wait;
    @FindBy(css ="form#new_user input[id='user_email']")
    private WebElement loginField;

    @FindBy(css = "form#new_user input[id='user_password']")
    private WebElement passwordField;

    @FindBy(css = "form#new_user input[type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@type='email']/following::li")
    private WebElement errorLogin;

    @FindBy(xpath = "//input[@type='password']/following::li")
    private WebElement errorPassword;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public void login(String login, String password) {
        typeLoginField(login);
        typePasswordField(password);
        clickLoginButton();
    }

    public void typeLoginField(String login){
        wait.until(ExpectedConditions.visibilityOf(loginField)).sendKeys(login);
    }

    public void typePasswordField(String password){
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
    }

    public void  clickLoginButton(){
        wait.until(ExpectedConditions.visibilityOf(loginButton)).click();
    }

    public String getTextLogin(){
        return wait.until(ExpectedConditions.visibilityOf(errorLogin)).getText();
    }

    public String getTextPassword(){
        return wait.until(ExpectedConditions.visibilityOf(errorPassword)).getText();
    }
}