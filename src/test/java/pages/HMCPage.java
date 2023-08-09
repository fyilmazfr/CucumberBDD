package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HMCPage {
    HMCPage hmcPage=new HMCPage();

    public HMCPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //@FindBy notation lari ile locate'leri buraya eklememiz lazim
    //bu sayfa acilmiyor
    //sayfa calismadigindan dolayi bu bolumu sadece izledim

}
