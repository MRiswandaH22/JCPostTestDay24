package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    WebElement username;

    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    WebElement password;

    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement btnLogin;

    @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
    WebElement btnProfile;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement btnLogout;

    @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")
    WebElement txtDashboard;

    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement txtTitlePage;

    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]")
    WebElement txtErrorLogin;

    public String getLoginTitle(){
        return txtTitlePage.getText();
    }

    public String getTxtDahsboard(){
        return txtDashboard.getText();
    }
    public String getInvalidCredentials(){
        return txtErrorLogin.getText();
    }

    public void inputUsername(String username){
        this.username.sendKeys(username);
    }
    public void inputPassword(String password){
        this.password.sendKeys(password);
    }
    public void btnLogin(){
        btnLogin.click();
    }

    public void setBtnLogout(){
        btnProfile.click();
        btnLogout.click();
    }
}
