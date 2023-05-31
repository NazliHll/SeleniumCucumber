package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon anasayfasinda")
    public void kullaniciAmazonAnasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }

    @And("sonuclarin Nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        String arananKelime="Nutella";
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici Java icin arama yapar")
    public void kullaniciJavaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Java"+Keys.ENTER);
    }

    @And("sonuclarin Java icerdigini test eder")
    public void sonuclarinJavaIcerdiginiTestEder() {
        String arananKelime="Java";
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @Then("kullanici xiaomi icin arama yapar")
    public void kullaniciXiaomiIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("xiaomi"+Keys.ENTER);
    }

    @And("sonuclarin xiaomi icerdigini test eder")
    public void sonuclarinXiaomiIcerdiginiTestEder() {
        String arananKelime="xiaomi";
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @And("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime+Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String istenenKelime) {
        String arananKelime=istenenKelime;
        String actualAramaSonucStr=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {

        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
