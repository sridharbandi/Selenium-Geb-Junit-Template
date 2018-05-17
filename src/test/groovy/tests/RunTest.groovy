package tests

import geb.junit4.GebReportingTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import pageobjects.GoogleSearchPage
import pageobjects.SearchResultsPage

@RunWith(JUnit4)
class RunTest extends GebReportingTest {

    @Test
    void exampleTest() {
        to GoogleSearchPage
        searchFor("Selenium")
        at SearchResultsPage
        assert linkSelenium.displayed
    }
}
