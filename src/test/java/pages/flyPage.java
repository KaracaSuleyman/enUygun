package pages;



import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class flyPage {


    public flyPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);
    }

    @FindBy (id = "com.mobilatolye.android.enuygun:id/btn_introActivity_next")
    public MobileElement travelStart;

    @FindBy (id = "com.mobilatolye.android.enuygun:id/txtGoogle")
    public MobileElement sigInInGoogle;

    @FindBy (id = "com.google.android.gms:id/account_display_name")
    public MobileElement myAccountSelected;


    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.widget.Button")
    public MobileElement permissionButton;

    @FindBy (id = "com.mobilatolye.android.enuygun:id/radioGroupFlightTypeOneWay")
    public MobileElement singleSelected;

    @FindBy (id = "com.mobilatolye.android.enuygun:id/text_search_fragment_origin_city")
    public MobileElement fromWhereButton;

    @FindBy (id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public MobileElement permissionWhileUsing;

    @FindBy (id = "com.mobilatolye.android.enuygun:id/md_buttonDefaultPositive")
    public MobileElement popupOkClict;

    @FindBy (id = "com.mobilatolye.android.enuygun:id/edtSearch")
    public MobileElement searchField;

    @FindBy (id = "com.mobilatolye.android.enuygun:id/text_search_fragment_destination_city")
    public MobileElement whereButton;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[3]")
    public MobileElement ESBSelect;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[3]")
    public MobileElement SAWSelect;

    @FindBy (xpath = "//*[@text='Gidiş Tarihi']")
    public MobileElement dateButton;

    @FindBy (id = "com.mobilatolye.android.enuygun:id/btn_search_fragment_search")
    public MobileElement findCheapTicket;

    @FindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.View[1]")
    public MobileElement dateSelect;

    @FindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
    public MobileElement noticPermission;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.view.ViewGroup")
    public MobileElement FirstFlight;

    @FindBy(xpath = "//*[@text='Eko']")
    public MobileElement purchase;

    @FindBy (id = "com.mobilatolye.android.enuygun:id/btn_purchase")
    public MobileElement devam;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/txtPhoneNumber")
    public MobileElement cellPhoneNumber;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/txt_flight_passenger_list_item_passenger_name")
    public MobileElement nameText;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/txt_flight_passenger_list_item_passenger_surname")
    public MobileElement lastNameText;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/txt_flight_passenger_list_item_passenger_tckn")
    public MobileElement tcNo;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/txt_flight_passenger_list_item_passenger_birth_date")
    public MobileElement birthDate;

    @FindBy(id = "android:id/button1")
    public MobileElement birthDateContinue;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/btn_continue")
    public MobileElement continueButton;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/radio_flight_passenger_list_item_passenger_gender_male")
    public MobileElement gennderSelect;









}

