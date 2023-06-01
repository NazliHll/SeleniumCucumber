package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HMCStepDefinition {
    HMCPage hmcPage=new HMCPage();

    @Then("Log in  yazisina tiklar")
    public void logInYazisinaTiklar() {
        hmcPage.loginButonu.click();
    }

    @And("gecerli username girer")
    public void gecerliUsernameGirer() {
        hmcPage.usernameKutusu.sendKeys(ConfigReader.getProperty("hmcValidUsername"));
    }

    @And("gecerli password girer")
    public void gecerliPasswordGirer() {
        hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("hmcValidPassword"));
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        hmcPage.loginButonu2.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfayaGirisYaptiginiKontrolEder() {
        Assert.assertTrue(hmcPage.hotelManagement.isDisplayed());
    }

    @And("kullanici gelismis butonuna basar")
    public void kullaniciGelismisButonunaBasar() {
        hmcPage.gelismis.click();
    }

    @Then("ilerle baglantisina tiklar")
    public void ilerleBaglantisinaTiklar() {
        hmcPage.ilerle.click();
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("hmcWrongPassword"));
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(hmcPage.loginButonu2.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hmcPage.usernameKutusu.sendKeys(ConfigReader.getProperty("hmcWrongUsername"));
    }
}
