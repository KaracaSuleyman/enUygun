package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class busPage {

    public busPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(xpath = "(//*[@text='Otobüs']")
    public WebElement busSelect;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]")
    public MobileElement fromToWhereSelect;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout")
    public MobileElement firstBusTravelSelect;

    @FindBy(xpath = "//*[@text='14']")
    public MobileElement seatNumberSelect;

    @FindBy(xpath = "//*[@text='Erkek']")
    public MobileElement genderBusSelectMale;

    @FindBy(xpath = "//*[@text='Kadın']")
    public MobileElement genderBusSelectFamale;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/btn_complete_select")
    public MobileElement btnCompleteSelect;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/txtPhoneNumber")
    public MobileElement txtPhoneNumber;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/txt_flight_passenger_list_item_passenger_name")
    public MobileElement txtName;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/txt_flight_passenger_list_item_passenger_surname")
    public MobileElement txtSurName;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/txt_flight_passenger_list_item_passenger_tckn")
    public MobileElement txtTcNo;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/btn_continue")
    public MobileElement btnComplete;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/edtCard")
    public MobileElement edtCart;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/edtMonth")
    public MobileElement edtMonth;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/edtYear")
    public MobileElement edtYear;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/edtCvc")
    public MobileElement edtCvc;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/edtCardHolderName")
    public MobileElement edtCardHolderName;

    @FindBy(id = "com.mobilatolye.android.enuygun:id/btn_purchase")
    public MobileElement btn_purchase;

    @FindBy(xpath = "//*[@text='06']")
    public MobileElement edtMonthCartSelect;

    @FindBy(xpath = "//*[@text='2028']")
    public MobileElement edtYearCartSelect;

}
