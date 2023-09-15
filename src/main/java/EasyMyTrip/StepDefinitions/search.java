package EasyMyTrip.StepDefinitions;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Hooks.Hooks.driver;

public class search {

    @Given("EaseMyTrip application is opened")
    public void ease_my_trip_application_is_opened() {

    }

    @When("User clicks on flights")
    public void user_clicks_on_flights() {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout");
        el1.click();
    }

    @And("User clicks on Round Trip")
    public void user_clicks_on_round_trip() {
        MobileElement el2 = (MobileElement) driver.findElementById("com.easemytrip.android:id/rdbRoundtrip");
        el2.click();
    }

    @And("User clicks on From")
    public void user_clicks_on_from() {
        MobileElement el3 = (MobileElement) driver.findElementById("com.easemytrip.android:id/search_flight_origin_code");
        el3.click();
    }

    @And("User enters origin city")
    public void user_enters_origin_city() throws InterruptedException {
        MobileElement el4 = (MobileElement) driver.findElementById("com.easemytrip.android:id/search");
        el4.sendKeys("Delhi");

        Thread.sleep(1000);

        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout[1]");
        el5.click();
    }

    @And("User clicks on To")
    public void user_clicks_on_to() {
        MobileElement el6 = (MobileElement) driver.findElementById("com.easemytrip.android:id/search_flight_destination_code");
        el6.click();
    }

    @And("User clicks on destination city")
    public void user_clicks_on_destination_city() {
        MobileElement el7 = (MobileElement) driver.findElementById("com.easemytrip.android:id/search");
        el7.sendKeys("Hyderabad");
        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]");
        el8.click();
    }

    @And("User clicks on Departure date")
    public void user_clicks_on_departure_date() {
        MobileElement el9 = (MobileElement) driver.findElementById("com.easemytrip.android:id/search_flight_departure_date");
        el9.click();
    }

    @And("User selects Departure date")
    public void user_selects_departure_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on Return date")
    public void user_clicks_on_return_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User selects on Return date")
    public void user_selects_on_return_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on Travellers")
    public void user_clicks_on_travellers() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User selects no of travellers")
    public void user_selects_no_of_travellers() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on Done")
    public void user_clicks_on_done() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on Class")
    public void user_clicks_on_class() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User selects on Economy")
    public void user_selects_on_economy() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on search")
    public void user_clicks_on_search() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User is displayed the search results page")
    public void user_is_displayed_the_search_results_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}


/*

MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout");
el1.click();
MobileElement el2 = (MobileElement) driver.findElementById("com.easemytrip.android:id/rdbRoundtrip");
el2.click();
MobileElement el3 = (MobileElement) driver.findElementById("com.easemytrip.android:id/search_flight_origin_code");
el3.click();
MobileElement el4 = (MobileElement) driver.findElementById("com.easemytrip.android:id/search");
el4.sendKeys("Delhi");
MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout[1]");
el5.click();
MobileElement el6 = (MobileElement) driver.findElementById("com.easemytrip.android:id/search_flight_destination_code");
el6.click();
MobileElement el7 = (MobileElement) driver.findElementById("com.easemytrip.android:id/search");
el7.sendKeys("Hyderabad");
MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]");
el8.click();
MobileElement el9 = (MobileElement) driver.findElementById("com.easemytrip.android:id/search_flight_departure_date");
el9.click();
MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout");
el10.click();
MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.RelativeLayout[15]/android.widget.RelativeLayout");
el11.click();
MobileElement el12 = (MobileElement) driver.findElementById("com.easemytrip.android:id/search_flight_return_date");
el12.click();
MobileElement el13 = (MobileElement) driver.findElementByAccessibilityId("Date is 31 Oct 2023");
el13.click();
MobileElement el14 = (MobileElement) driver.findElementById("com.easemytrip.android:id/textViewPaxCount");
el14.click();
MobileElement el15 = (MobileElement) driver.findElementById("com.easemytrip.android:id/adult_three");
el15.click();
MobileElement el16 = (MobileElement) driver.findElementById("com.easemytrip.android:id/tvDone");
el16.click();
MobileElement el17 = (MobileElement) driver.findElementById("android:id/text1");
el17.click();
MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
el18.click();
MobileElement el19 = (MobileElement) driver.findElementById("com.easemytrip.android:id/button_flight_Search");
el19.click();

 */