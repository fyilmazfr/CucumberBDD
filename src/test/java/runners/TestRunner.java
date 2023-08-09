package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html"},// bu satir raporlama icin runner class'ina eklenir?BU SATIR eger testi runner'dan calistirirsak devreye girer
        features = "src/test/java/stepDefinitions",
        glue = "stepDefinitions",
        tags = "@config",
        dryRun =false
)


public class TestRunner {


    /*
    bir framework'te bir tek runner class'i yeterli olabilir.runner class'inda class body'sinde  hicbirsey olmaz
    Runner class'imizi 2 adet annotation vardir
    1-   @RunWith(Cucumber.class) notasyonu runner class'a calisma ozelligi katar
    bu notasyon nedeni ile Cucumber framework'umuzde Junit kullanmayi tercih ediyoruz
    2- features=Runner dosyasini feature dosyalarini nerden bulacagini tarif eder
       glue = step definitions dosyalarini nerde bulacagimizi gosterir
       tags =o an hangi tag'i calistirmak istiyorsak onu belli eder

       dryRun =iki secenek var
           true;yazdigimizda testimizi calistirmadan sadece eksik adimlari bize verir
           false ; yazdigimizda testlerimizi calistirir

     */
}
