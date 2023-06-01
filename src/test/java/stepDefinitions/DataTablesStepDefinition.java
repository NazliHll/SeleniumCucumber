package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablesStepDefinition {
    DataTablesPage dataTablesPage=new DataTablesPage();
    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dataTablesPage.newButonu.click();
    }

    @And("isim bolumune {string} yazar")
    public void isimBolumuneYazar(String firstname) {
        dataTablesPage.firstName.sendKeys(firstname);
    }

    @And("soyisim bolumune {string} yazar")
    public void soyisimBolumuneYazar(String lastname) {
        dataTablesPage.lastName.sendKeys(lastname);
    }

    @And("position bolumune {string} yazar")
    public void positionBolumuneYazar(String position) {
        dataTablesPage.position.sendKeys(position);
    }

    @And("ofis bolumune {string} yazar")
    public void ofisBolumuneYazar(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @And("extension bolumune {string} yazar")
    public void extensionBolumuneYazar(String extension) {
        dataTablesPage.extension.sendKeys(extension);
    }

    @And("starDate bolumune {string} yazar")
    public void stardateBolumuneYazar(String starDate) {
        dataTablesPage.startDate.sendKeys(starDate);
    }

    @And("salary bolumune {string} yazar")
    public void salaryBolumuneYazar(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @And("create tusuna basar")
    public void createTusunaBasar() {
        dataTablesPage.create.click();
    }
    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        dataTablesPage.search.sendKeys(firstname);
    }
    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstname) {
        Assert.assertTrue(dataTablesPage.aramaSonucIlkElement.getText().contains(firstname));
    }
}
