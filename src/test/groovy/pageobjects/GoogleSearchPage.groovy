package pageobjects

import geb.Page
import org.openqa.selenium.Keys

class GoogleSearchPage extends Page {

    static at = { title == "Google" }

    static content = {
        searchBox {$("input#lst-ib")}
    }

    def searchFor(searchText){
        searchBox << searchText
        searchBox << Keys.RETURN
    }
}
