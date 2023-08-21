package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchAndFilterPage {
    public static WebDriver driver;

    public SearchAndFilterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='btn-findmentor']")
    private WebElement findMentorButton;
    @FindBy(xpath = "//div[@class='container mx-auto p-9']")
    private WebElement verifySearchingPage;
    @FindBy(xpath = "//select[1]")
    private WebElement filterInstrument;
    @FindBy(xpath = "//select[2]")
    private WebElement filterRating;
    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchField;

    public void setFindMentorButton(){
        findMentorButton.click();
    }
    public boolean setVerifySearchingPage(){
        return verifySearchingPage.isDisplayed();
    }
    public void setFilterInstrument(String instrument){
        Select b = new Select(filterInstrument);
        b.selectByVisibleText(instrument);
    }
    public void setFilterRating(String rating){
        Select c = new Select(filterRating);
        c.selectByVisibleText(rating);
    }

    public void verifySearchField(){
        searchField.click();
    }
    public void setSearchField(String search){
        searchField.sendKeys(search);
    }
}
