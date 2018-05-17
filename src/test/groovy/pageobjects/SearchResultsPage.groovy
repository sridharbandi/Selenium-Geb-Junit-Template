package pageobjects

import geb.Page

class SearchResultsPage extends Page{
    static at = { $("a#logo") }

    static content = {
        linkSelenium {$("a", text: contains("Selenium - Web Browser Automation"))}
    }

}
