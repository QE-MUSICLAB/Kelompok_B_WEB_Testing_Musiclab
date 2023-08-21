package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    public static WebDriver driver;
    public LogoutPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//ul[@class='menu menu-horizontal px-1 lg:flex hidden']//a[.='Logout']")
    private WebElement logoutButton;
    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement verifyLogoutPage;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement okButton;
    public void clickLogoutButton(){
        logoutButton.click();
    }
    public boolean verifyLogoutLandingPage(){
        return verifyLogoutPage.isDisplayed();
    }
    public void clickOkButton(){
        okButton.click();
    }

}
