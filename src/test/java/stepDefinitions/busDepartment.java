package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.busPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class busDepartment {
    pages.busPage busPage = new busPage();

    @Given("Clicks on the Bus tab")
    public void clicks_on_the_bus_tab() {
        busPage.busSelect.click();
    }

    @Given("Selects the first bus trip")
    public void selects_the_first_bus_trip() {

     busPage.firstBusTravelSelect.click();

    }
    @Given("chooses seat number {int}")
    public void chooses_seat_number(Integer int1) {

        busPage.seatNumberSelect.click();

    }
    @Given("Selects gender {string}")
    public void selects_gender(String string1) {
        ReusableMethods.bekle(2);
       switch (string1){

           case "male": {
               busPage.genderBusSelectMale.click();
               break;
           }
           case "female": {
               busPage.genderBusSelectFamale.click();
               break;
           }
       }
    }
    @Given("Enters CellphoneNumber {string} , name {string} , Surname {string} , TcNo {string}")
    public void enters_cellphone_number_name_surname_tc_no(String cellPhoneNo, String name, String Surname, String TcNo) {
        ReusableMethods.bekle(2);

        busPage.txtPhoneNumber.sendKeys(cellPhoneNo);
        busPage.txtName.sendKeys(name);
        busPage.txtSurName.sendKeys(Surname);
        busPage.txtTcNo.sendKeys(TcNo);

    }
    @Given("Click the Continue button")
    public void click_the_continue_button() {
        ReusableMethods.bekle(2);
        busPage.btnCompleteSelect.click();
    }
    @Given("Click Continue button")
    public void click_continue_button() {
        ReusableMethods.bekle(2);
        busPage.btnComplete.click();
    }
    @Given("Enters CardNo {string} , Month {string} , Month {string} , Year {string} , Cvc {string} , Card name {string} information")
    public void enters_card_no_month_month_year_cvc_card_name_information(String string, String string2, String string3, String string4, String string5, String string6) {
        ReusableMethods.bekle(2);
        busPage.edtCart.sendKeys(ConfigReader.getProperty("cardNumber"));
        busPage.edtMonth.click();
        ReusableMethods.bekle(2);
        busPage.edtMonthCartSelect.click();
        ReusableMethods.bekle(2);
        busPage.edtYear.click();
        ReusableMethods.bekle(2);
        busPage.edtYearCartSelect.click();
        ReusableMethods.bekle(2);
        busPage.edtCvc.sendKeys(ConfigReader.getProperty("cvc"));
        ReusableMethods.bekle(2);
        busPage.edtCardHolderName.sendKeys(ConfigReader.getProperty("name"));


    }
    @Given("Closes the application")
    public void closes_the_application() {
        Driver.quitAppiumDriver();
    }

    @Given("select {string}")
    public void select(String string) {

    busPage.fromToWhereSelect.click();

    }


}
