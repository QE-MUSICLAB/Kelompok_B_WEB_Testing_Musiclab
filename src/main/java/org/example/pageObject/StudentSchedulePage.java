package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentSchedulePage {
    public static WebDriver driver;

    public StudentSchedulePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(css = ".border-none")
    private WebElement clickbtnjadwal;
    @FindBy(xpath = "//div[@class='overflow-auto w-full min-h-screen']")
    private WebElement alreadyjadwalpage;
    @FindBy(id = "btn-kembali")
    private WebElement clickbtnkembali;
    @FindBy(xpath = "//ul[@class='menu menu-horizontal px-1 lg:flex hidden']//a[.='Logout']")
    private WebElement btnlogout;
    public void setClickbtnjadwal(){
        clickbtnjadwal.click();
    }
    public boolean setalreadyjadwalpage(){
        return alreadyjadwalpage.isDisplayed();
    }
    public void setClickbtnkembali(){
        clickbtnkembali.click();
    }
    public void setBtnlogout(){
        btnlogout.click();
    }

}
