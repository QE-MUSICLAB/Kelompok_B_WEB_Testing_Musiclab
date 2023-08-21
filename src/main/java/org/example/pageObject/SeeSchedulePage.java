package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeeSchedulePage {
    public static WebDriver driver;

    public SeeSchedulePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='container mx-auto p-10']")
    private WebElement verfiyProfile;
    @FindBy(xpath = "//button[@class='btn border-none rounded-xl w-5/6 lg:w-3/6 bg-[#3A2BE8] text-white font-semibold mt-5']")
    private WebElement jadwalButton;

    @FindBy(xpath = "//div[@class='w-full min-h-screen']")
    private WebElement verifyHistoryBelajar;

    public boolean setVerfiyProfile(){
        return verfiyProfile.isDisplayed();
    }
    public void setJadwalButton(){
        jadwalButton.click();
    }

    public boolean setVerifyHistoryBelajar(){
        return verifyHistoryBelajar.isDisplayed();
    }
}
