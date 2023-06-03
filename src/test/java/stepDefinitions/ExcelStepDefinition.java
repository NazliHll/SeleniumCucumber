package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ExcelStepDefinition {
    @Given("kullanici excel dosyasini kullanabilir hale getirir")
    public void kullaniciExcelDosyasiniKullanabilirHaleGetirir() {
    }

    @Then("{int}.satirdaki {int}. hücreyi yazdirir")
    public void satirdakiHücreyiYazdirir(int arg0, int arg1) {
    }

    @And("baskenti Jakarta olan ulke ismini yazdirir")
    public void baskentiJakartaOlanUlkeIsminiYazdirir() {
    }

    @And("ulke sayisinin {int} oldugunu test eder")
    public void ulkeSayisininOldugunuTestEder(int arg0) {
    }

    @And("fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
    public void fizikiOlarakKullanilanSatirSayisininOldugunuTestEder(int arg0) {
    }

    @Then("{int}.satir {int}.sutundaki bilgiyi yazdirir")
    public void satirSutundakiBilgiyiYazdirir(int arg0, int arg1) {
    }
}
