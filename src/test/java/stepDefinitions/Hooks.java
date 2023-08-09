package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
/*
    cucumber da step definition package'i icerisinde @before ,@after gibi bir notasyon varsa
    extends testBase dememize gerek kalmadan her seneryodan once veya sonra bu methodlar calisacaktir
    buda bizim isteyecegimiz bie durum degildir
    cucumber'da @before @after kullanma ihtiyacimiz olursa bunu stepdefinition package'i altinda olusturacagimiz
    hooks class'ina koyariz
    her seneryaodan sonra test sonucunu kontrol edip failed olan scenario'lar icin screenshoot almasi amaciyla
    @after method'u kullanacagiz
     */

public class Hooks {

    @After
    public void tearDown(Scenario scenario){


        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");
            Driver.closeDriver();
        }

    }
}


