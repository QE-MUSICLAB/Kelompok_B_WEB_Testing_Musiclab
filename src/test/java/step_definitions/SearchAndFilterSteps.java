package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.SearchAndFilterPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchAndFilterSteps {
    public WebDriver webDriver;

    public SearchAndFilterSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click find mentor button")
    public void userClickFindMentorButton() {
        SearchAndFilterPage searchAndFilterPage = new SearchAndFilterPage(webDriver);
        searchAndFilterPage.setFindMentorButton();
    }

    @Then("User will direct to searching page")
    public void userWillDirectToSearchingPage() {
        SearchAndFilterPage searchAndFilterPage = new SearchAndFilterPage(webDriver);
        Assert.assertTrue(searchAndFilterPage.setVerifySearchingPage());
    }

    @And("User select {string} as filter_instrument and {string} as filter_rating")
    public void userSelectAsFilter_instrumentAndAsFilter_rating(String instrument, String rating) {
        SearchAndFilterPage searchAndFilterPage = new SearchAndFilterPage(webDriver);
        searchAndFilterPage.setFilterInstrument(instrument);
        searchAndFilterPage.setFilterRating(rating);
    }

    @And("User select {string} as filter_instrument")
    public void userSelectAsFilter_instrument(String instrument) {
        SearchAndFilterPage searchAndFilterPage = new SearchAndFilterPage(webDriver);
        searchAndFilterPage.setFilterInstrument(instrument);
    }

    @And("User select {string} as filter_rating")
    public void userSelectAsFilter_rating(String rating) {
        SearchAndFilterPage searchAndFilterPage = new SearchAndFilterPage(webDriver);
        searchAndFilterPage.setFilterRating(rating);
    }

    @And("User click search field")
    public void userClickSearchField() {
        SearchAndFilterPage searchAndFilterPage = new SearchAndFilterPage(webDriver);
        searchAndFilterPage.verifySearchField();
    }

    @And("User {string} as search_mentor_name and select {string} as filter_rating")
    public void userAsSearch_mentor_nameAndSelectAsFilter_rating(String search, String rating) {
        SearchAndFilterPage searchAndFilterPage = new SearchAndFilterPage(webDriver);
        searchAndFilterPage.setSearchField(search);
        searchAndFilterPage.setFilterRating(rating);
    }
}
