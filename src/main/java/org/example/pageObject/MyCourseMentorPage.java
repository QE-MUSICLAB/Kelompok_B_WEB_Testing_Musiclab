package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCourseMentorPage {
    public static WebDriver driver;

    public MyCourseMentorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(id = "btn-kursussaya")
    private WebElement clickbtnkursussaya;
    @FindBy(css = ".container")
    private WebElement verifikasikursussayapage;
    @FindBy(id = "btn-back")
    private WebElement clickbtnback;

    public void setClickbtnkursussaya(){
        clickbtnkursussaya.click();
    }
    public boolean verifykursussayapage(){
        return verifikasikursussayapage.isDisplayed();
    }
    public void setClickbtnback(){
        clickbtnback.click();
    }
}
