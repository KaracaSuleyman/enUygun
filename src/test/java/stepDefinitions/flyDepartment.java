package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.flyPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class flyDepartment {

    flyPage flyPage = new flyPage();
    Actions actions = new Actions(Driver.getAppiumDriver());

    @Given("User goes to app home page")
    public void user_goes_to_app_home_page() {
        Driver.getAppiumDriver();
    }

    @Given("Clicks {string} button")
    public void clicks_button(String string) {
         
        flyPage.travelStart.click();

    }

    @Given("Clicks Sign in with Google button")
    public void clicks_sign_in_with_google_button() {
         
        flyPage.sigInInGoogle.click();

    }

    @Given("Selects the account to login")
    public void selects_the_account_to_login() {
         
        flyPage.myAccountSelected.click();
       // flyPage.noticPermission.click();

    }

    @Given("Selects the {string} option")
    public void selects_the_option(String string) {
        flyPage.singleSelected.click();
         
    }

    @Given("Clicks the From Where button")
    public void clicks_the_from_where_button() {
        flyPage.fromWhereButton.click();
         
    }

    @Given("Clicks {string} on the warning screen")
    public void clicks_on_the_warning_screen(String string) {
        flyPage.permissionWhileUsing.click();
//        flyPage.popupOkClict.click();
    }

    @Given("Type {string} in the search box and search")
    public void type_in_the_search_box_and_search(String string) {
        flyPage.searchField.sendKeys(string);

    }

    @Given("Selects {string}")
    public void selects(String string) {
        ReusableMethods.bekle(2);

        switch (string) {

            case "SAW": {
                ReusableMethods.bekle(2);
                flyPage.SAWSelect.click();
                break;
            }
            case "ESB": {
                ReusableMethods.bekle(2);
                flyPage.ESBSelect.click();
                break;
            }

        }

         

    }

    @Given("Clicks the Where To button")
    public void clicks_the_where_to_button() {
        flyPage.whereButton.click();
        ReusableMethods.bekle(2);
    }

    @Given("Clicks the Date button")
    public void clicks_the_date_button() {
        flyPage.dateButton.click();
    }

    @Given("Selects the date {int} {string} {int}")
    public void selects_the_date(Integer int1, String string, Integer int2) {

         
        TouchAction touchAction = new TouchAction(Driver.getAppiumDriver())
                .press(PointOption.point(999, 1315))
                .press(PointOption.point(999, 1315))
                .waitAction(waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(999, 1315))
                .release()
                .perform();

         
/*
        TouchAction touchAction2 = new TouchAction(Driver.getAppiumDriver());
        touchAction.press(PointOption.point(85, 2036))
                .waitAction(waitOptions(Duration.ofMillis(100)))
                .release()
                .perform();

 */

    }

    @Given("Clicks on the Find cheap tickets button")
    public void clicks_on_the_find_cheap_tickets_button() {
         
        flyPage.findCheapTicket.click();
    }

    @Given("selects the flight in the first row")
    public void selects_the_flight_in_the_first_row() {
        flyPage.FirstFlight.click();
        ReusableMethods.bekle(2);
    }

    @Given("Clicks the Continue button")
    public void clicks_the_continue_button() {
        flyPage.purchase.click();
        flyPage.devam.click();
    }

    @Given("CellPhone {string} , Name {string} , LastName {string} , TCNo {string}")
    public void cell_phone_name_last_name_tc_no(String CellPhone, String name, String lastName, String TCNo) {
        flyPage.cellPhoneNumber.sendKeys(CellPhone);
        flyPage.nameText.sendKeys(name);
        flyPage.lastNameText.sendKeys(lastName);
        flyPage.tcNo.sendKeys(TCNo);
        // day    //293 1218   //293  1051
        // month  //515 1258  //515 1059
        // year  //770 1214 //770 1051

        // devam kaydırma // 465 1733 // 465 716

    }

    @Given("Enter date of birth and select gender")
    public void enter_date_of_birth_and_select_gender() {
        flyPage.birthDate.click();
        flyPage.birthDateContinue.click();
        flyPage.gennderSelect.click();

    }

    @Given("presses the continue button")
    public void presses_the_continue_button() {
        ReusableMethods.bekle(2);
        TouchAction touchAction = new TouchAction(Driver.getAppiumDriver())
                .press(PointOption.point(512, 1741))
                .moveTo(PointOption.point(512, 248))
                .release()
                .press(PointOption.point(512, 1672))
                .moveTo(PointOption.point(512, 254))
                .release()
                .perform();
         
        flyPage.continueButton.click();
        ReusableMethods.bekle(2);
    }

    @Given("closes the application")
    public void closes_the_application() {
       Driver.quitAppiumDriver();
    }


}
