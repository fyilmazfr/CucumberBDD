package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EditorPage;
import utilities.ConfigReader;
import utilities.Driver;

public class EditorStepdefinitions {
    EditorPage editorPage=new EditorPage();

    @Then("{string} butonuna basar")
    public void butonuna_basar(String button) {
        editorPage.newButonu.click();

    }


    @And("isim bolumune {string} girer")
    public void isimBolumuneGirer(String isim) {
        editorPage.isimButonu.sendKeys(isim);
    }

    @And("soyisim bolumune {string} girer")
    public void soyisimBolumuneGirer(String soyisim) {
        editorPage.soyisimButtonu.sendKeys(soyisim);
    }

    @And("position bolumune {string} girer")
    public void positionBolumuneGirer(String position) {
        editorPage.positionButtonu.sendKeys(position);
    }

    @And("ofis bolumune {string} yazar")
    public void ofisBolumuneYazar(String ofis) {
        editorPage.officeButtonu.sendKeys(ofis);

    }

    @And("extension bolumune {string} yazar")
    public void extensionBolumuneYazar(String extension) {
        editorPage.extenButtonu.sendKeys(extension);
    }

    @And("srartDate bolumune {string} yazar")
    public void srartdateBolumuneYazar(String startDate) {
        editorPage.startDateButtonu.sendKeys(startDate);
    }

    @And("salary bolumune {string} yazar")
    public void salaryBolumuneYazar(String salary) {
        editorPage.salaryButtonu.sendKeys(salary);
    }
    @Then("{string} tusuna basar")
    public void tusuna_basar(String createButton) {
        editorPage.createButtonu.click();

    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String isim) {
        editorPage.searchBuutonu.sendKeys(isim);


    }



    @And("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String isim) {
        Assert.assertTrue(editorPage.ilkIsim.getText().contains(isim));

    }

    @Given("kullanici {string} sayfasinda")
    public void kullaniciSayfasinda(String EditorUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("EditorUrl"));
    }
}